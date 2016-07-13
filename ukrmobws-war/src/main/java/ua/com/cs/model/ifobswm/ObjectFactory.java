
package ua.com.cs.model.ifobswm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.com.cs.model package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and ua.com.cs.model
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CallService_QNAME = new QName("http://wm.webservices.ifobs.cs.com/", "call");
    private final static QName _CallServiceResponse_QNAME = new QName("http://ift.webservices.ifobs.cs.com/", "callServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.com.cs.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallServiceResponse }
     * 
     */
    public CallServiceResponse createCallServiceResponse() {
        return new CallServiceResponse();
    }

    /**
     * Create an instance of {@link CallService }
     * 
     */
    public CallService createCallService() {
        return new CallService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wm.webservices.ifobs.cs.com/", name = "call")
    public JAXBElement<CallService> createCallService(CallService value) {
        return new JAXBElement<CallService>(_CallService_QNAME, CallService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ift.webservices.ifobs.cs.com/", name = "callServiceResponse")
    public JAXBElement<CallServiceResponse> createCallServiceResponse(CallServiceResponse value) {
        return new JAXBElement<CallServiceResponse>(_CallServiceResponse_QNAME, CallServiceResponse.class, null, value);
    }

}
