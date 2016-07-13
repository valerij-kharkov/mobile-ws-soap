
package ua.com.cs.model.wm.response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPictureInfoListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardPictureInfoListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardPictureInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPictureInfoListResponse", propOrder = {
    "cardPictureInfo"
})
public class CardPictureInfoListResponse {

    @XmlElement(name = "CardPictureInfo")
    protected List<CardPictureInfoListResponse.CardPictureInfo> cardPictureInfo;

    /**
     * Gets the value of the cardPictureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardPictureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardPictureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPictureInfoListResponse.CardPictureInfo }
     * 
     * 
     */
    public List<CardPictureInfoListResponse.CardPictureInfo> getCardPictureInfo() {
        if (cardPictureInfo == null) {
            cardPictureInfo = new ArrayList<CardPictureInfoListResponse.CardPictureInfo>();
        }
        return this.cardPictureInfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cardId",
        "picture",
        "version"
    })
    public static class CardPictureInfo {

        @XmlElement(name = "CardId", required = true)
        protected String cardId;
        @XmlElement(name = "Picture", required = true)
        protected byte[] picture;
        @XmlElement(name = "Version", required = true)
        protected BigDecimal version;

        /**
         * Gets the value of the cardId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardId() {
            return cardId;
        }

        /**
         * Sets the value of the cardId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardId(String value) {
            this.cardId = value;
        }

        /**
         * Gets the value of the picture property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getPicture() {
            return picture;
        }

        /**
         * Sets the value of the picture property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setPicture(byte[] value) {
            this.picture = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

    }

}
