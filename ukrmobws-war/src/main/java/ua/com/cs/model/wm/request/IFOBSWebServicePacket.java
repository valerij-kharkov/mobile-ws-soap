package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iFOBSWebServicePacket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iFOBSWebServicePacket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iFOBSWebServicePacket" type="{http://cs.com.ua/callingService/}iFOBSWebServicePacketType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iFOBSWebServicePacket", propOrder = {
    "ifobsWebServicePacket"
})
@XmlSeeAlso({
    CardListRequest.class,
    CardPictureListRequest.class,
    GetDealOperationPaymentDetailsRequest.class
})
public class IFOBSWebServicePacket {

    @XmlElement(name = "iFOBSWebServicePacket", required = true)
    protected IFOBSWebServicePacketType ifobsWebServicePacket;

    /**
     * Gets the value of the ifobsWebServicePacket property.
     * 
     * @return
     *     possible object is
     *     {@link IFOBSWebServicePacketType }
     *     
     */
    public IFOBSWebServicePacketType getIFOBSWebServicePacket() {
        return ifobsWebServicePacket;
    }

    /**
     * Sets the value of the ifobsWebServicePacket property.
     * 
     * @param value
     *     allowed object is
     *     {@link IFOBSWebServicePacketType }
     *     
     */
    public void setIFOBSWebServicePacket(IFOBSWebServicePacketType value) {
        this.ifobsWebServicePacket = value;
    }

}
