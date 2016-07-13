
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacketHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacketHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SenderInfo" type="{http://cs.com.ua/callingService/}SenderInfoType"/>
 *         &lt;element name="AuthInfo" type="{http://cs.com.ua/callingService/}AuthInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacketHeaderType", propOrder = {
    "senderInfo",
    "authInfo"
})
public class PacketHeaderType {

    @XmlElement(name = "SenderInfo", required = true)
    protected SenderInfoType senderInfo;
    @XmlElement(name = "AuthInfo", required = true)
    protected AuthInfoType authInfo;

    /**
     * Gets the value of the senderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SenderInfoType }
     *     
     */
    public SenderInfoType getSenderInfo() {
        return senderInfo;
    }

    /**
     * Sets the value of the senderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderInfoType }
     *     
     */
    public void setSenderInfo(SenderInfoType value) {
        this.senderInfo = value;
    }

    /**
     * Gets the value of the authInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AuthInfoType }
     *     
     */
    public AuthInfoType getAuthInfo() {
        return authInfo;
    }

    /**
     * Sets the value of the authInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthInfoType }
     *     
     */
    public void setAuthInfo(AuthInfoType value) {
        this.authInfo = value;
    }

}
