package ua.com.cs.model.wm.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.com.cs.model.wm.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Parameters_QNAME = new QName("http://cs.com.ua/callingService/", "Parameters");
    private final static QName _GetDealOperationPaymentDetailsRequestParameters_QNAME = new QName("http://cs.com.ua/callingService/", "GetDealOperationPaymentDetailsRequestParameters");
    private final static QName _CardPictureListRequestParameters_QNAME = new QName("http://cs.com.ua/callingService/", "CardPictureListRequestParameters");
    private final static QName _CardListRequestParameters_QNAME = new QName("http://cs.com.ua/callingService/", "CardListRequestParameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.com.cs.model.wm.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CardPictureInfoList }
     * 
     */
    public CardPictureInfoList createCardPictureInfoList() {
        return new CardPictureInfoList();
    }

    /**
     * Create an instance of {@link CallingRequest }
     * 
     */
    public CallingRequest createCallingRequest() {
        return new CallingRequest();
    }

    /**
     * Create an instance of {@link GetDealOperationPaymentDetailsRequestParametersType }
     * 
     */
    public GetDealOperationPaymentDetailsRequestParametersType createGetDealOperationPaymentDetailsRequestParametersType() {
        return new GetDealOperationPaymentDetailsRequestParametersType();
    }

    /**
     * Create an instance of {@link GetDealOperationPaymentDetailsRequest }
     * 
     */
    public GetDealOperationPaymentDetailsRequest createGetDealOperationPaymentDetailsRequest() {
        return new GetDealOperationPaymentDetailsRequest();
    }

    /**
     * Create an instance of {@link IFOBSWebServicePacket }
     * 
     */
    public IFOBSWebServicePacket createIFOBSWebServicePacket() {
        return new IFOBSWebServicePacket();
    }

    /**
     * Create an instance of {@link IFOBSWebServicePacketType }
     * 
     */
    public IFOBSWebServicePacketType createIFOBSWebServicePacketType() {
        return new IFOBSWebServicePacketType();
    }

    /**
     * Create an instance of {@link CardPictureListRequestParametersType }
     * 
     */
    public CardPictureListRequestParametersType createCardPictureListRequestParametersType() {
        return new CardPictureListRequestParametersType();
    }

    /**
     * Create an instance of {@link CardPictureListRequest }
     * 
     */
    public CardPictureListRequest createCardPictureListRequest() {
        return new CardPictureListRequest();
    }

    /**
     * Create an instance of {@link CardListRequest }
     * 
     */
    public CardListRequest createCardListRequest() {
        return new CardListRequest();
    }

    /**
     * Create an instance of {@link CardListRequestParametersType }
     * 
     */
    public CardListRequestParametersType createCardListRequestParametersType() {
        return new CardListRequestParametersType();
    }

    /**
     * Create an instance of {@link AuthInfoType }
     * 
     */
    public AuthInfoType createAuthInfoType() {
        return new AuthInfoType();
    }

    /**
     * Create an instance of {@link UserType }
     * 
     */
    public UserType createUserType() {
        return new UserType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link CallingServiceType }
     * 
     */
    public CallingServiceType createCallingServiceType() {
        return new CallingServiceType();
    }

    /**
     * Create an instance of {@link PacketBodyType }
     * 
     */
    public PacketBodyType createPacketBodyType() {
        return new PacketBodyType();
    }

    /**
     * Create an instance of {@link SessionInfoType }
     * 
     */
    public SessionInfoType createSessionInfoType() {
        return new SessionInfoType();
    }

    /**
     * Create an instance of {@link SenderInfoType }
     * 
     */
    public SenderInfoType createSenderInfoType() {
        return new SenderInfoType();
    }

    /**
     * Create an instance of {@link LocaleType }
     * 
     */
    public LocaleType createLocaleType() {
        return new LocaleType();
    }

    /**
     * Create an instance of {@link PacketHeaderType }
     * 
     */
    public PacketHeaderType createPacketHeaderType() {
        return new PacketHeaderType();
    }

    /**
     * Create an instance of {@link CardPictureInfoList.CardPictureInfo }
     * 
     */
    public CardPictureInfoList.CardPictureInfo createCardPictureInfoListCardPictureInfo() {
        return new CardPictureInfoList.CardPictureInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "Parameters")
    public JAXBElement<ParametersRequestType> createParameters(ParametersRequestType value) {
        return new JAXBElement<ParametersRequestType>(_Parameters_QNAME, ParametersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealOperationPaymentDetailsRequestParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "GetDealOperationPaymentDetailsRequestParameters", substitutionHeadNamespace = "http://cs.com.ua/callingService/", substitutionHeadName = "Parameters")
    public JAXBElement<GetDealOperationPaymentDetailsRequestParametersType> createGetDealOperationPaymentDetailsRequestParameters(GetDealOperationPaymentDetailsRequestParametersType value) {
        return new JAXBElement<GetDealOperationPaymentDetailsRequestParametersType>(_GetDealOperationPaymentDetailsRequestParameters_QNAME, GetDealOperationPaymentDetailsRequestParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPictureListRequestParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "CardPictureListRequestParameters", substitutionHeadNamespace = "http://cs.com.ua/callingService/", substitutionHeadName = "Parameters")
    public JAXBElement<CardPictureListRequestParametersType> createCardPictureListRequestParameters(CardPictureListRequestParametersType value) {
        return new JAXBElement<CardPictureListRequestParametersType>(_CardPictureListRequestParameters_QNAME, CardPictureListRequestParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardListRequestParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "CardListRequestParameters", substitutionHeadNamespace = "http://cs.com.ua/callingService/", substitutionHeadName = "Parameters")
    public JAXBElement<CardListRequestParametersType> createCardListRequestParameters(CardListRequestParametersType value) {
        return new JAXBElement<CardListRequestParametersType>(_CardListRequestParameters_QNAME, CardListRequestParametersType.class, null, value);
    }

}
