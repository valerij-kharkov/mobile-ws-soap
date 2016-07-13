
package ua.com.cs.model.ifobswm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for call complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="call">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sWebServiceXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callService", propOrder = {
    "sWebServiceXML"
})
public class CallService {

    protected String sWebServiceXML;

    /**
     * Gets the value of the sWebServiceXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWebServiceXML() {
        return sWebServiceXML;
    }

    /**
     * Sets the value of the sWebServiceXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWebServiceXML(String value) {
        this.sWebServiceXML = value;
    }

}
