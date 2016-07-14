package ua.com.cs.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.ws.client.core.WebServiceTemplate;
import ua.com.cs.helpers.Base64;
import ua.com.cs.helpers.XMLAndMarshallerHelper;
import ua.com.cs.helpers.ZipHelper;
import ua.com.cs.model.ifobswm.CallService;
import ua.com.cs.model.ifobswm.CallServiceResponse;
import ua.com.cs.model.wm.request.CallingRequest;
import ua.com.cs.model.wm.request.IFOBSWebServicePacket;
import ua.com.cs.model.wm.response.CallingResponse;
import ua.com.cs.model.wm.response.Response;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

/**
 * Created by valeriy_solyanik
 * on 17.12.2015.
 */
public class CallingService {
	protected final static org.slf4j.Logger logger = LoggerFactory.getLogger(CallingService.class);
	protected final static String JAVA_ENCODING = "cp1251";

	@Autowired
	private XMLAndMarshallerHelper xmlAndMarshallerHelper;
	@Autowired
	private WebServiceTemplate webServiceTemplate;

	static {
		disableSslVerification();
	}

	private static void disableSslVerification() {
		try {
			// Create a trust manager that does not validate certificate chains
			TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			}
			};

			// Install the all-trusting trust manager
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		} catch (NoSuchAlgorithmException e) {
			logger.error("Error disable ssl verification", e);
		} catch (KeyManagementException e) {
			logger.error("Error disable ssl verification", e);
		}
	}

	//Использовать для вызова мобильных сервисов, чтобы получить в ответе корректный XML для тестирования
	protected Response call(IFOBSWebServicePacket request, String responseParameterValue) {
		Response callingResponse = new Response();
		try {
			String encodedRequest;
			String decodedResponse;

			String requestAsString = xmlAndMarshallerHelper.getRequestAsString(request);

			ZipHelper zip = new ZipHelper(JAVA_ENCODING);
			encodedRequest = new String(Base64.encode(zip.CompressGZIP(requestAsString)), JAVA_ENCODING);

			CallService callRequest = new CallService();
			callRequest.setSWebServiceXML(encodedRequest);
			CallServiceResponse callServiceResponse = (CallServiceResponse) webServiceTemplate.marshalSendAndReceive(callRequest);

			if (callServiceResponse != null && StringUtils.hasText(callServiceResponse.getReturn())) {
				decodedResponse = zip.DecompressGZIP(Base64.decode(callServiceResponse.getReturn().getBytes(JAVA_ENCODING)));
				decodedResponse = xmlAndMarshallerHelper.geResponseWithParamType(decodedResponse, responseParameterValue);
				callingResponse = (Response) xmlAndMarshallerHelper.unmarshal(decodedResponse);
			} else {
				throw new RuntimeException("Error empty response from ifobs");
			}
		} catch (Exception e) {
			logger.error("Error during call ifobs ukrainian WM", e);
		}

		return callingResponse;
	}

	//Использовать для вызова мобильных сервисов по-старинке - через строку
	protected CallingResponse call(CallingRequest request) {
		CallingResponse callingResponse = new CallingResponse();
		try {
			String encodedRequest;
			String decodedResponse;

			ZipHelper zip = new ZipHelper(JAVA_ENCODING);
			encodedRequest = new String(Base64.encode(zip.CompressGZIP(request.getRequest())), JAVA_ENCODING);

			CallService callRequest = new CallService();
			callRequest.setSWebServiceXML(encodedRequest);
			CallServiceResponse callServiceResponse = (CallServiceResponse) webServiceTemplate.marshalSendAndReceive(callRequest);

			if (callServiceResponse != null && StringUtils.hasText(callServiceResponse.getReturn())) {
				decodedResponse = zip.DecompressGZIP(Base64.decode(callServiceResponse.getReturn().getBytes(JAVA_ENCODING)));
				callingResponse.setResponse(decodedResponse);
			} else {
				throw new RuntimeException("Error empty response from ifobs");
			}

		} catch (Exception e) {
			logger.error("Error during call ifobs ukrainian WM", e);
		}
		return callingResponse;
	}
}


