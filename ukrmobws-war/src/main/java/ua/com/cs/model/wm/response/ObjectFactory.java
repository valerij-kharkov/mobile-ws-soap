package ua.com.cs.model.wm.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.com.cs.model.wm.response package. 
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

    private final static QName _ResponseParameters_QNAME = new QName("http://cs.com.ua/callingService/", "ResponseParameters");
    private final static QName _CardPictureListResponseParameters_QNAME = new QName("http://cs.com.ua/callingService/", "CardPictureListResponseParameters");
    private final static QName _CardListResponseParameters_QNAME = new QName("http://cs.com.ua/callingService/", "CardListResponseParameters");
    private final static QName _GetDealOperationPaymentDetailsResponseParameters_QNAME = new QName("http://cs.com.ua/callingService/", "GetDealOperationPaymentDetailsResponseParameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.com.cs.model.wm.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link CardPictureInfoListResponse }
     * 
     */
    public CardPictureInfoListResponse createCardPictureInfoListResponse() {
        return new CardPictureInfoListResponse();
    }

    /**
     * Create an instance of {@link Response.SenderInfo }
     * 
     */
    public Response.SenderInfo createResponseSenderInfo() {
        return new Response.SenderInfo();
    }

    /**
     * Create an instance of {@link CardListResponseParametersType }
     * 
     */
    public CardListResponseParametersType createCardListResponseParametersType() {
        return new CardListResponseParametersType();
    }

    /**
     * Create an instance of {@link CardListResponseParametersType.AccountDetails }
     * 
     */
    public CardListResponseParametersType.AccountDetails createCardListResponseParametersTypeAccountDetails() {
        return new CardListResponseParametersType.AccountDetails();
    }

    /**
     * Create an instance of {@link CardPictureListResponseParametersType }
     * 
     */
    public CardPictureListResponseParametersType createCardPictureListResponseParametersType() {
        return new CardPictureListResponseParametersType();
    }

    /**
     * Create an instance of {@link GetDealOperationPaymentDetailsResponseParametersType }
     * 
     */
    public GetDealOperationPaymentDetailsResponseParametersType createGetDealOperationPaymentDetailsResponseParametersType() {
        return new GetDealOperationPaymentDetailsResponseParametersType();
    }

    /**
     * Create an instance of {@link Response.StatusBlock }
     * 
     */
    public Response.StatusBlock createResponseStatusBlock() {
        return new Response.StatusBlock();
    }

    /**
     * Create an instance of {@link CallingResponse }
     * 
     */
    public CallingResponse createCallingResponse() {
        return new CallingResponse();
    }

    /**
     * Create an instance of {@link CardPictureInfoListResponse.CardPictureInfo }
     * 
     */
    public CardPictureInfoListResponse.CardPictureInfo createCardPictureInfoListResponseCardPictureInfo() {
        return new CardPictureInfoListResponse.CardPictureInfo();
    }

    /**
     * Create an instance of {@link Response.SenderInfo.SessionInfo }
     * 
     */
    public Response.SenderInfo.SessionInfo createResponseSenderInfoSessionInfo() {
        return new Response.SenderInfo.SessionInfo();
    }

    /**
     * Create an instance of {@link CardListResponseParametersType.AccountDetails.Balances }
     * 
     */
    public CardListResponseParametersType.AccountDetails.Balances createCardListResponseParametersTypeAccountDetailsBalances() {
        return new CardListResponseParametersType.AccountDetails.Balances();
    }

    /**
     * Create an instance of {@link CardListResponseParametersType.AccountDetails.Card }
     * 
     */
    public CardListResponseParametersType.AccountDetails.Card createCardListResponseParametersTypeAccountDetailsCard() {
        return new CardListResponseParametersType.AccountDetails.Card();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "ResponseParameters")
    public JAXBElement<ParametersResponseType> createResponseParameters(ParametersResponseType value) {
        return new JAXBElement<ParametersResponseType>(_ResponseParameters_QNAME, ParametersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardPictureListResponseParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "CardPictureListResponseParameters", substitutionHeadNamespace = "http://cs.com.ua/callingService/", substitutionHeadName = "ResponseParameters")
    public JAXBElement<CardPictureListResponseParametersType> createCardPictureListResponseParameters(CardPictureListResponseParametersType value) {
        return new JAXBElement<CardPictureListResponseParametersType>(_CardPictureListResponseParameters_QNAME, CardPictureListResponseParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardListResponseParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "CardListResponseParameters", substitutionHeadNamespace = "http://cs.com.ua/callingService/", substitutionHeadName = "ResponseParameters")
    public JAXBElement<CardListResponseParametersType> createCardListResponseParameters(CardListResponseParametersType value) {
        return new JAXBElement<CardListResponseParametersType>(_CardListResponseParameters_QNAME, CardListResponseParametersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealOperationPaymentDetailsResponseParametersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cs.com.ua/callingService/", name = "GetDealOperationPaymentDetailsResponseParameters", substitutionHeadNamespace = "http://cs.com.ua/callingService/", substitutionHeadName = "ResponseParameters")
    public JAXBElement<GetDealOperationPaymentDetailsResponseParametersType> createGetDealOperationPaymentDetailsResponseParameters(GetDealOperationPaymentDetailsResponseParametersType value) {
        return new JAXBElement<GetDealOperationPaymentDetailsResponseParametersType>(_GetDealOperationPaymentDetailsResponseParameters_QNAME, GetDealOperationPaymentDetailsResponseParametersType.class, null, value);
    }

}
