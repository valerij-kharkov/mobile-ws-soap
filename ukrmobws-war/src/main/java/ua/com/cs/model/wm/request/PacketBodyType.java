
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacketBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacketBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallingService" type="{http://cs.com.ua/callingService/}CallingServiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacketBodyType", propOrder = {
    "callingService"
})
public class PacketBodyType {

    @XmlElement(name = "CallingService", required = true)
    protected CallingServiceType callingService;

    /**
     * Gets the value of the callingService property.
     * 
     * @return
     *     possible object is
     *     {@link CallingServiceType }
     *     
     */
    public CallingServiceType getCallingService() {
        return callingService;
    }

    /**
     * Sets the value of the callingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallingServiceType }
     *     
     */
    public void setCallingService(CallingServiceType value) {
        this.callingService = value;
    }

}
