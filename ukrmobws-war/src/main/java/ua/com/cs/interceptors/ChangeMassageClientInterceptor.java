package ua.com.cs.interceptors;

import com.sun.xml.messaging.saaj.soap.impl.ElementImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import java.util.Iterator;

/**
 * Created by valeriy_solyanik
 * on 08.07.2016.
 */
@Component
public class ChangeMassageClientInterceptor implements ClientInterceptor {

	private static final Log logger = LogFactory.getLog(ChangeMassageClientInterceptor.class);

	@Override
	public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
		changeMassage((SaajSoapMessage) messageContext.getResponse());
		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
		return false;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {

	}

	private void changeMassage(SaajSoapMessage saajSoapMessage) {
		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
		SOAPPart sp = soapMessage.getSOAPPart();
		try {
			Iterator<SOAPElement> it = sp.getEnvelope().getBody().getChildElements();
			while (it.hasNext()) {
				SOAPElement element = it.next();
				if ("callServiceResponse".equals(element.getLocalName())) {
					element.setElementQName(new QName("http://wm.webservices.ifobs.cs.com/", "callServiceResponse", "ns1"));
				}
			}

			Iterator<SOAPElement> it2 = sp.getEnvelope().getBody().getChildElements();
			while (it2.hasNext()) {
				SOAPElement element = it2.next();
				if ("callServiceResponse".equals(element.getLocalName())) {
					if (element.getFirstChild() instanceof ElementImpl) {
						((ElementImpl) element.getFirstChild()).setElementQName(new QName("http://wm.webservices.ifobs.cs.com/", "return", "ns1"));
					}
				}
			}
		} catch (SOAPException e) {
			logger.error(e, e);
		}
	}

}
