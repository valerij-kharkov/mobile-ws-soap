
package ua.com.cs.model.wm.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDealOperationPaymentDetailsResponseParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDealOperationPaymentDetailsResponseParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersResponseType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDealOperationPaymentDetailsResponseParametersType", propOrder = {
    "paymentDetails"
})
public class GetDealOperationPaymentDetailsResponseParametersType
    extends ParametersResponseType
{

    @XmlElement(name = "PaymentDetails", required = true)
    protected String paymentDetails;

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDetails(String value) {
        this.paymentDetails = value;
    }

}
