
package ua.com.cs.model.wm.request;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDealOperationPaymentDetailsRequestParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDealOperationPaymentDetailsRequestParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersRequestType">
 *       &lt;sequence>
 *         &lt;element name="DealId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DealOperationId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDealOperationPaymentDetailsRequestParametersType", propOrder = {
    "dealId",
    "branchId",
    "dealOperationId"
})
public class GetDealOperationPaymentDetailsRequestParametersType
    extends ParametersRequestType
{

    @XmlElement(name = "DealId", required = true)
    protected BigDecimal dealId;
    @XmlElement(name = "BranchId", required = true)
    protected BigDecimal branchId;
    @XmlElement(name = "DealOperationId")
    protected BigDecimal dealOperationId;

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDealId(BigDecimal value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBranchId(BigDecimal value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the dealOperationId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDealOperationId() {
        return dealOperationId;
    }

    /**
     * Sets the value of the dealOperationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDealOperationId(BigDecimal value) {
        this.dealOperationId = value;
    }

}
