
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iFOBSWebServicePacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iFOBSWebServicePacketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PacketHeader" type="{http://cs.com.ua/callingService/}PacketHeaderType"/>
 *         &lt;element name="PacketBody" type="{http://cs.com.ua/callingService/}PacketBodyType"/>
 *         &lt;element name="PacketSign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iFOBSWebServicePacketType", propOrder = {
    "packetHeader",
    "packetBody",
    "packetSign"
})
public class IFOBSWebServicePacketType {

    @XmlElement(name = "PacketHeader", required = true)
    protected PacketHeaderType packetHeader;
    @XmlElement(name = "PacketBody", required = true)
    protected PacketBodyType packetBody;
    @XmlElement(name = "PacketSign", required = true)
    protected String packetSign;

    /**
     * Gets the value of the packetHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PacketHeaderType }
     *     
     */
    public PacketHeaderType getPacketHeader() {
        return packetHeader;
    }

    /**
     * Sets the value of the packetHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketHeaderType }
     *     
     */
    public void setPacketHeader(PacketHeaderType value) {
        this.packetHeader = value;
    }

    /**
     * Gets the value of the packetBody property.
     * 
     * @return
     *     possible object is
     *     {@link PacketBodyType }
     *     
     */
    public PacketBodyType getPacketBody() {
        return packetBody;
    }

    /**
     * Sets the value of the packetBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketBodyType }
     *     
     */
    public void setPacketBody(PacketBodyType value) {
        this.packetBody = value;
    }

    /**
     * Gets the value of the packetSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketSign() {
        return packetSign;
    }

    /**
     * Sets the value of the packetSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketSign(String value) {
        this.packetSign = value;
    }

}
