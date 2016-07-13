package ua.com.cs.handler;

import com.sun.xml.messaging.saaj.soap.impl.ElementImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by valeriy_solyanik
 * on 15.12.2015.
 */
public class MessageHandler implements SOAPHandler<SOAPMessageContext> {

	private static final Logger logger = LoggerFactory.getLogger(MessageHandler.class);

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (!isRequest) {
			SOAPMessage msg = context.getMessage();

			SOAPPart sp = msg.getSOAPPart();
			try {
				Iterator<ElementImpl> it2 = sp.getEnvelope().getBody().getChildElements();
				while (it2.hasNext()) {
					ElementImpl element = it2.next();
					if ("callServiceResponse".equals(element.getLocalName())) {
						if (element.getFirstChild() instanceof ElementImpl) {
							((ElementImpl) element.getFirstChild()).setElementQName(new QName("return"));
						}
					}
				}
			} catch (SOAPException e) {
				logger.error("Outbound handle error:", e);
			}
		}

		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {

	}
}
