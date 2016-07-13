
package ua.com.cs.model.wm.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardListResponseParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardListResponseParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cs.com.ua/callingService/}ParametersResponseType">
 *       &lt;sequence>
 *         &lt;element name="FirstTxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastTxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CanContinue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountDetails" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Balances">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Ledger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ProjectedLedger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Moved" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ActualizedTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OwnerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Access" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Card">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CardAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EmbossedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Alarmed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OwnerIdentifyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BranchDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TempLimitId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TempLimitFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TempLimitTill" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TempLimitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MainLimitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SavingAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CardStateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SoftStopList">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SwitchStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ShowCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="PictureVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CanUnblock" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EnrolledDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardListResponseParametersType", propOrder = {
    "firstTxId",
    "lastTxId",
    "canContinue",
    "txCount",
    "accountDetails"
})
public class CardListResponseParametersType
    extends ParametersResponseType
{

    @XmlElement(name = "FirstTxId", required = true)
    protected String firstTxId;
    @XmlElement(name = "LastTxId", required = true)
    protected String lastTxId;
    @XmlElement(name = "CanContinue", required = true)
    protected String canContinue;
    @XmlElement(name = "TxCount", required = true)
    protected String txCount;
    @XmlElement(name = "AccountDetails")
    protected List<CardListResponseParametersType.AccountDetails> accountDetails;

    /**
     * Gets the value of the firstTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstTxId() {
        return firstTxId;
    }

    /**
     * Sets the value of the firstTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstTxId(String value) {
        this.firstTxId = value;
    }

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
     * Gets the value of the canContinue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanContinue() {
        return canContinue;
    }

    /**
     * Sets the value of the canContinue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanContinue(String value) {
        this.canContinue = value;
    }

    /**
     * Gets the value of the txCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCount() {
        return txCount;
    }

    /**
     * Sets the value of the txCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCount(String value) {
        this.txCount = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardListResponseParametersType.AccountDetails }
     * 
     * 
     */
    public List<CardListResponseParametersType.AccountDetails> getAccountDetails() {
        if (accountDetails == null) {
            accountDetails = new ArrayList<CardListResponseParametersType.AccountDetails>();
        }
        return this.accountDetails;
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
     *         &lt;element name="Balances">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Ledger" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ProjectedLedger" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Moved" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ActualizedTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OwnerAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Access" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TxId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BranchId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Card">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CardAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EmbossedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Alarmed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="OwnerIdentifyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BranchDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TempLimitId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TempLimitFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TempLimitTill" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TempLimitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MainLimitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SavingAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CardStateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SoftStopList">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SwitchStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ShowCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="PictureVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CanUnblock" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EnrolledDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "balances",
        "type",
        "ownerName",
        "ownerAddress",
        "status",
        "access",
        "txId",
        "currency",
        "branchId",
        "accountName",
        "card"
    })
    public static class AccountDetails {

        @XmlElement(name = "Balances", required = true)
        protected CardListResponseParametersType.AccountDetails.Balances balances;
        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "OwnerName", required = true)
        protected String ownerName;
        @XmlElement(name = "OwnerAddress", required = true)
        protected String ownerAddress;
        @XmlElement(name = "Status", required = true)
        protected String status;
        @XmlElement(name = "Access", required = true)
        protected String access;
        @XmlElement(name = "TxId", required = true)
        protected String txId;
        @XmlElement(name = "Currency", required = true)
        protected String currency;
        @XmlElement(name = "BranchId", required = true)
        protected String branchId;
        @XmlElement(name = "AccountName", required = true)
        protected String accountName;
        @XmlElement(name = "Card", required = true)
        protected CardListResponseParametersType.AccountDetails.Card card;

        /**
         * Gets the value of the balances property.
         * 
         * @return
         *     possible object is
         *     {@link CardListResponseParametersType.AccountDetails.Balances }
         *     
         */
        public CardListResponseParametersType.AccountDetails.Balances getBalances() {
            return balances;
        }

        /**
         * Sets the value of the balances property.
         * 
         * @param value
         *     allowed object is
         *     {@link CardListResponseParametersType.AccountDetails.Balances }
         *     
         */
        public void setBalances(CardListResponseParametersType.AccountDetails.Balances value) {
            this.balances = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the ownerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerName() {
            return ownerName;
        }

        /**
         * Sets the value of the ownerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerName(String value) {
            this.ownerName = value;
        }

        /**
         * Gets the value of the ownerAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerAddress() {
            return ownerAddress;
        }

        /**
         * Sets the value of the ownerAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerAddress(String value) {
            this.ownerAddress = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the access property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccess() {
            return access;
        }

        /**
         * Sets the value of the access property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccess(String value) {
            this.access = value;
        }

        /**
         * Gets the value of the txId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTxId() {
            return txId;
        }

        /**
         * Sets the value of the txId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTxId(String value) {
            this.txId = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the branchId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBranchId() {
            return branchId;
        }

        /**
         * Sets the value of the branchId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBranchId(String value) {
            this.branchId = value;
        }

        /**
         * Gets the value of the accountName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountName() {
            return accountName;
        }

        /**
         * Sets the value of the accountName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountName(String value) {
            this.accountName = value;
        }

        /**
         * Gets the value of the card property.
         * 
         * @return
         *     possible object is
         *     {@link CardListResponseParametersType.AccountDetails.Card }
         *     
         */
        public CardListResponseParametersType.AccountDetails.Card getCard() {
            return card;
        }

        /**
         * Sets the value of the card property.
         * 
         * @param value
         *     allowed object is
         *     {@link CardListResponseParametersType.AccountDetails.Card }
         *     
         */
        public void setCard(CardListResponseParametersType.AccountDetails.Card value) {
            this.card = value;
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
         *         &lt;element name="Ledger" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ProjectedLedger" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Moved" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ActualizedTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "ledger",
            "available",
            "projectedLedger",
            "overdraftLimit",
            "moved",
            "actualizedTime"
        })
        public static class Balances {

            @XmlElement(name = "Ledger", required = true)
            protected String ledger;
            @XmlElement(name = "Available", required = true)
            protected String available;
            @XmlElement(name = "ProjectedLedger", required = true)
            protected String projectedLedger;
            @XmlElement(name = "OverdraftLimit", required = true)
            protected String overdraftLimit;
            @XmlElement(name = "Moved", required = true)
            protected String moved;
            @XmlElement(name = "ActualizedTime", required = true)
            protected String actualizedTime;

            /**
             * Gets the value of the ledger property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLedger() {
                return ledger;
            }

            /**
             * Sets the value of the ledger property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLedger(String value) {
                this.ledger = value;
            }

            /**
             * Gets the value of the available property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvailable() {
                return available;
            }

            /**
             * Sets the value of the available property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvailable(String value) {
                this.available = value;
            }

            /**
             * Gets the value of the projectedLedger property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProjectedLedger() {
                return projectedLedger;
            }

            /**
             * Sets the value of the projectedLedger property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProjectedLedger(String value) {
                this.projectedLedger = value;
            }

            /**
             * Gets the value of the overdraftLimit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverdraftLimit() {
                return overdraftLimit;
            }

            /**
             * Sets the value of the overdraftLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverdraftLimit(String value) {
                this.overdraftLimit = value;
            }

            /**
             * Gets the value of the moved property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoved() {
                return moved;
            }

            /**
             * Sets the value of the moved property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoved(String value) {
                this.moved = value;
            }

            /**
             * Gets the value of the actualizedTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActualizedTime() {
                return actualizedTime;
            }

            /**
             * Sets the value of the actualizedTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActualizedTime(String value) {
                this.actualizedTime = value;
            }

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
         *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CardAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EmbossedName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContractId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Alarmed" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="OwnerIdentifyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BranchDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TempLimitId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TempLimitFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TempLimitTill" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TempLimitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MainLimitName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SavingAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CardStateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SoftStopList">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SwitchStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ShowCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="PictureVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CanUnblock" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EnrolledDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DisplayOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "endDate",
            "cardAccount",
            "accountId",
            "cardNo",
            "contract",
            "embossedName",
            "state",
            "contractId",
            "isPrimary",
            "type",
            "currencyCode",
            "alarmed",
            "ownerIdentifyCode",
            "branchDesc",
            "cardName",
            "tempLimitId",
            "tempLimitFrom",
            "tempLimitTill",
            "tempLimitName",
            "mainLimitName",
            "savingAccountNo",
            "cardId",
            "cardStateId",
            "softStopList",
            "responseId",
            "switchStatus",
            "showCard",
            "pictureVersion",
            "canUnblock",
            "contractNumber",
            "enrolledDate",
            "displayOrder"
        })
        public static class Card {

            @XmlElement(name = "EndDate", required = true)
            protected String endDate;
            @XmlElement(name = "CardAccount", required = true)
            protected String cardAccount;
            @XmlElement(name = "AccountId", required = true)
            protected String accountId;
            @XmlElement(name = "CardNo", required = true)
            protected String cardNo;
            @XmlElement(name = "Contract", required = true)
            protected String contract;
            @XmlElement(name = "EmbossedName", required = true)
            protected String embossedName;
            @XmlElement(name = "State", required = true)
            protected String state;
            @XmlElement(name = "ContractId", required = true)
            protected String contractId;
            @XmlElement(name = "IsPrimary")
            protected boolean isPrimary;
            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "CurrencyCode", required = true)
            protected String currencyCode;
            @XmlElement(name = "Alarmed", required = true)
            protected String alarmed;
            @XmlElement(name = "OwnerIdentifyCode", required = true)
            protected String ownerIdentifyCode;
            @XmlElement(name = "BranchDesc", required = true)
            protected String branchDesc;
            @XmlElement(name = "CardName", required = true)
            protected String cardName;
            @XmlElement(name = "TempLimitId", required = true)
            protected String tempLimitId;
            @XmlElement(name = "TempLimitFrom", required = true)
            protected String tempLimitFrom;
            @XmlElement(name = "TempLimitTill", required = true)
            protected String tempLimitTill;
            @XmlElement(name = "TempLimitName", required = true)
            protected String tempLimitName;
            @XmlElement(name = "MainLimitName", required = true)
            protected String mainLimitName;
            @XmlElement(name = "SavingAccountNo", required = true)
            protected String savingAccountNo;
            @XmlElement(name = "CardId", required = true)
            protected String cardId;
            @XmlElement(name = "CardStateId", required = true)
            protected String cardStateId;
            @XmlElement(name = "SoftStopList", required = true)
            protected String softStopList;
            @XmlElement(name = "ResponseId", required = true)
            protected String responseId;
            @XmlElement(name = "SwitchStatus", required = true)
            protected String switchStatus;
            @XmlElement(name = "ShowCard")
            protected boolean showCard;
            @XmlElement(name = "PictureVersion", required = true)
            protected String pictureVersion;
            @XmlElement(name = "CanUnblock", required = true)
            protected String canUnblock;
            @XmlElement(name = "ContractNumber", required = true)
            protected String contractNumber;
            @XmlElement(name = "EnrolledDate", required = true)
            protected String enrolledDate;
            @XmlElement(name = "DisplayOrder", required = true)
            protected String displayOrder;

            /**
             * Gets the value of the endDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndDate() {
                return endDate;
            }

            /**
             * Sets the value of the endDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndDate(String value) {
                this.endDate = value;
            }

            /**
             * Gets the value of the cardAccount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardAccount() {
                return cardAccount;
            }

            /**
             * Sets the value of the cardAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardAccount(String value) {
                this.cardAccount = value;
            }

            /**
             * Gets the value of the accountId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountId() {
                return accountId;
            }

            /**
             * Sets the value of the accountId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountId(String value) {
                this.accountId = value;
            }

            /**
             * Gets the value of the cardNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardNo() {
                return cardNo;
            }

            /**
             * Sets the value of the cardNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardNo(String value) {
                this.cardNo = value;
            }

            /**
             * Gets the value of the contract property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContract(String value) {
                this.contract = value;
            }

            /**
             * Gets the value of the embossedName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmbossedName() {
                return embossedName;
            }

            /**
             * Sets the value of the embossedName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmbossedName(String value) {
                this.embossedName = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the contractId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractId() {
                return contractId;
            }

            /**
             * Sets the value of the contractId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractId(String value) {
                this.contractId = value;
            }

            /**
             * Gets the value of the isPrimary property.
             * 
             */
            public boolean isIsPrimary() {
                return isPrimary;
            }

            /**
             * Sets the value of the isPrimary property.
             * 
             */
            public void setIsPrimary(boolean value) {
                this.isPrimary = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the alarmed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlarmed() {
                return alarmed;
            }

            /**
             * Sets the value of the alarmed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlarmed(String value) {
                this.alarmed = value;
            }

            /**
             * Gets the value of the ownerIdentifyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerIdentifyCode() {
                return ownerIdentifyCode;
            }

            /**
             * Sets the value of the ownerIdentifyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerIdentifyCode(String value) {
                this.ownerIdentifyCode = value;
            }

            /**
             * Gets the value of the branchDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBranchDesc() {
                return branchDesc;
            }

            /**
             * Sets the value of the branchDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBranchDesc(String value) {
                this.branchDesc = value;
            }

            /**
             * Gets the value of the cardName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardName() {
                return cardName;
            }

            /**
             * Sets the value of the cardName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardName(String value) {
                this.cardName = value;
            }

            /**
             * Gets the value of the tempLimitId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempLimitId() {
                return tempLimitId;
            }

            /**
             * Sets the value of the tempLimitId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempLimitId(String value) {
                this.tempLimitId = value;
            }

            /**
             * Gets the value of the tempLimitFrom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempLimitFrom() {
                return tempLimitFrom;
            }

            /**
             * Sets the value of the tempLimitFrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempLimitFrom(String value) {
                this.tempLimitFrom = value;
            }

            /**
             * Gets the value of the tempLimitTill property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempLimitTill() {
                return tempLimitTill;
            }

            /**
             * Sets the value of the tempLimitTill property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempLimitTill(String value) {
                this.tempLimitTill = value;
            }

            /**
             * Gets the value of the tempLimitName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTempLimitName() {
                return tempLimitName;
            }

            /**
             * Sets the value of the tempLimitName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTempLimitName(String value) {
                this.tempLimitName = value;
            }

            /**
             * Gets the value of the mainLimitName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMainLimitName() {
                return mainLimitName;
            }

            /**
             * Sets the value of the mainLimitName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMainLimitName(String value) {
                this.mainLimitName = value;
            }

            /**
             * Gets the value of the savingAccountNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSavingAccountNo() {
                return savingAccountNo;
            }

            /**
             * Sets the value of the savingAccountNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSavingAccountNo(String value) {
                this.savingAccountNo = value;
            }

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
             * Gets the value of the cardStateId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardStateId() {
                return cardStateId;
            }

            /**
             * Sets the value of the cardStateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardStateId(String value) {
                this.cardStateId = value;
            }

            /**
             * Gets the value of the softStopList property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoftStopList() {
                return softStopList;
            }

            /**
             * Sets the value of the softStopList property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoftStopList(String value) {
                this.softStopList = value;
            }

            /**
             * Gets the value of the responseId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponseId() {
                return responseId;
            }

            /**
             * Sets the value of the responseId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponseId(String value) {
                this.responseId = value;
            }

            /**
             * Gets the value of the switchStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSwitchStatus() {
                return switchStatus;
            }

            /**
             * Sets the value of the switchStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSwitchStatus(String value) {
                this.switchStatus = value;
            }

            /**
             * Gets the value of the showCard property.
             * 
             */
            public boolean isShowCard() {
                return showCard;
            }

            /**
             * Sets the value of the showCard property.
             * 
             */
            public void setShowCard(boolean value) {
                this.showCard = value;
            }

            /**
             * Gets the value of the pictureVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPictureVersion() {
                return pictureVersion;
            }

            /**
             * Sets the value of the pictureVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPictureVersion(String value) {
                this.pictureVersion = value;
            }

            /**
             * Gets the value of the canUnblock property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCanUnblock() {
                return canUnblock;
            }

            /**
             * Sets the value of the canUnblock property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCanUnblock(String value) {
                this.canUnblock = value;
            }

            /**
             * Gets the value of the contractNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractNumber() {
                return contractNumber;
            }

            /**
             * Sets the value of the contractNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractNumber(String value) {
                this.contractNumber = value;
            }

            /**
             * Gets the value of the enrolledDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrolledDate() {
                return enrolledDate;
            }

            /**
             * Sets the value of the enrolledDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrolledDate(String value) {
                this.enrolledDate = value;
            }

            /**
             * Gets the value of the displayOrder property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplayOrder() {
                return displayOrder;
            }

            /**
             * Sets the value of the displayOrder property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplayOrder(String value) {
                this.displayOrder = value;
            }

        }

    }

}
