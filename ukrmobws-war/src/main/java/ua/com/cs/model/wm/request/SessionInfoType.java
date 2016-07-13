
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for SessionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionInfoType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dns" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="osuser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionInfoType", propOrder = {
    "value"
})
public class SessionInfoType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "dns")
    protected String dns;
    @XmlAttribute(name = "osuser")
    protected String osuser;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDns() {
        return dns;
    }

    /**
     * Sets the value of the dns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDns(String value) {
        this.dns = value;
    }

    /**
     * Gets the value of the osuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsuser() {
        return osuser;
    }

    /**
     * Sets the value of the osuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsuser(String value) {
        this.osuser = value;
    }

}
