package ua.com.cs.model.wm.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallingServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallingServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://cs.com.ua/callingService/}Parameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="servicename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallingServiceType", propOrder = {
    "parameters"
})
public class CallingServiceType {

    @XmlElementRef(name = "Parameters", namespace = "http://cs.com.ua/callingService/", type = JAXBElement.class)
    protected JAXBElement<? extends ParametersRequestType> parameters;
    @XmlAttribute(name = "servicename")
    protected String servicename;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParametersRequestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CardListRequestParametersType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParametersRequestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GetDealOperationPaymentDetailsRequestParametersType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CardPictureListRequestParametersType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CardPictureListRequestParametersType }{@code >}
     *     
     */
    public JAXBElement<? extends ParametersRequestType> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParametersRequestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CardListRequestParametersType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParametersRequestType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GetDealOperationPaymentDetailsRequestParametersType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CardPictureListRequestParametersType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CardPictureListRequestParametersType }{@code >}
     *     
     */
    public void setParameters(JAXBElement<? extends ParametersRequestType> value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the servicename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicename() {
        return servicename;
    }

    /**
     * Sets the value of the servicename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicename(String value) {
        this.servicename = value;
    }

}
