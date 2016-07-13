
package ua.com.cs.model.wm.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPictureListResponseParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardPictureListResponseParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersResponseType">
 *       &lt;sequence>
 *         &lt;element name="CardPictureInfoList" type="{http://cs.com.ua/callingService/}CardPictureInfoListResponse"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPictureListResponseParametersType", propOrder = {
    "cardPictureInfoList"
})
public class CardPictureListResponseParametersType
    extends ParametersResponseType
{

    @XmlElement(name = "CardPictureInfoList", required = true)
    protected CardPictureInfoListResponse cardPictureInfoList;

    /**
     * Gets the value of the cardPictureInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link CardPictureInfoListResponse }
     *     
     */
    public CardPictureInfoListResponse getCardPictureInfoList() {
        return cardPictureInfoList;
    }

    /**
     * Sets the value of the cardPictureInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPictureInfoListResponse }
     *     
     */
    public void setCardPictureInfoList(CardPictureInfoListResponse value) {
        this.cardPictureInfoList = value;
    }

}
