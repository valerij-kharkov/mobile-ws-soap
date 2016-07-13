package ua.com.cs.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;

/**
 * Created by valeriy_solyanik
 * on 21.10.2015.
 */
public class PayloadLoggingInterceptor  extends org.springframework.ws.server.endpoint.interceptor.PayloadLoggingInterceptor {

	private static Logger log = LoggerFactory.getLogger(PayloadLoggingInterceptor.class);

	protected boolean isLogEnabled() {
		return log.isDebugEnabled();
	}

	protected void logMessage(String message) {
		log.debug(message);
	}

	@Override
	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
		if (isLogEnabled()) {
			logMessage("------------START-----------");
			logMessageSource("Request: ", getSource(messageContext.getRequest()));
			logMessage("----------------------------");
			logMessageSource("Response: ", getSource(messageContext.getResponse()));
			logMessage("-------------END------------");
		}
		return true;
	}
}

