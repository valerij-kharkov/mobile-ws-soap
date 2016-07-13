
package ua.com.cs.model.wm.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPictureListRequestParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardPictureListRequestParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersRequestType">
 *       &lt;sequence>
 *         &lt;element name="CardPictureInfoList" type="{http://cs.com.ua/callingService/}CardPictureInfoList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPictureListRequestParametersType", propOrder = {
    "cardPictureInfoList"
})
public class CardPictureListRequestParametersType
    extends ParametersRequestType
{

    @XmlElement(name = "CardPictureInfoList", required = true)
    protected CardPictureInfoList cardPictureInfoList;

    /**
     * Gets the value of the cardPictureInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link CardPictureInfoList }
     *     
     */
    public CardPictureInfoList getCardPictureInfoList() {
        return cardPictureInfoList;
    }

    /**
     * Sets the value of the cardPictureInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPictureInfoList }
     *     
     */
    public void setCardPictureInfoList(CardPictureInfoList value) {
        this.cardPictureInfoList = value;
    }

}
