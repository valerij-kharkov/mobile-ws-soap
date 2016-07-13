
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardListRequestParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardListRequestParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersRequestType">
 *       &lt;sequence>
 *         &lt;element name="LastTxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxTxCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NeedOnlineBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ByState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardListRequestParametersType", propOrder = {
    "lastTxId",
    "maxTxCount",
    "needOnlineBalance",
    "byState"
})
public class CardListRequestParametersType
    extends ParametersRequestType
{

    @XmlElement(name = "LastTxId")
    protected String lastTxId;
    @XmlElement(name = "MaxTxCount")
    protected String maxTxCount;
    @XmlElement(name = "NeedOnlineBalance")
    protected String needOnlineBalance;
    @XmlElement(name = "ByState")
    protected String byState;

    /**
     * Gets the value of the lastTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTxId() {
        return lastTxId;
    }

    /**
     * Sets the value of the lastTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTxId(String value) {
        this.lastTxId = value;
    }

    /**
     * Gets the value of the maxTxCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxTxCount() {
        return maxTxCount;
    }

    /**
     * Sets the value of the maxTxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxTxCount(String value) {
        this.maxTxCount = value;
    }

    /**
     * Gets the value of the needOnlineBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedOnlineBalance() {
        return needOnlineBalance;
    }

    /**
     * Sets the value of the needOnlineBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedOnlineBalance(String value) {
        this.needOnlineBalance = value;
    }

    /**
     * Gets the value of the byState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByState() {
        return byState;
    }

    /**
     * Sets the value of the byState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByState(String value) {
        this.byState = value;
    }

}
