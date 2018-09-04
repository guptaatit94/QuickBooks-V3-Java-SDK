//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.03 at 12:04:22 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Holds credit-card information to request a credit card payment from a merchant account service, but NOT any response or authorization information from the merchant account service provider -- see CreditChargeResponse
 * 			
 * 
 * <p>Java class for CreditChargeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditChargeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameOnAcct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CcExpiryMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CcExpiryYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BillAddrStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialCardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCTxnMode" type="{http://schema.intuit.com/finance/v3}CCTxnModeEnum" minOccurs="0"/>
 *         &lt;element name="CCTxnType" type="{http://schema.intuit.com/finance/v3}CCTxnTypeEnum" minOccurs="0"/>
 *         &lt;element name="PrevCCTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProcessPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditCardChargeInfoEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditChargeInfo", propOrder = {
    "number",
    "type",
    "nameOnAcct",
    "ccExpiryMonth",
    "ccExpiryYear",
    "billAddrStreet",
    "postalCode",
    "commercialCardCode",
    "ccTxnMode",
    "ccTxnType",
    "prevCCTransId",
    "amount",
    "processPayment",
    "creditCardChargeInfoEx"
})
public class CreditChargeInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "NameOnAcct")
    protected String nameOnAcct;
    @XmlElement(name = "CcExpiryMonth")
    protected Integer ccExpiryMonth;
    @XmlElement(name = "CcExpiryYear")
    protected Integer ccExpiryYear;
    @XmlElement(name = "BillAddrStreet")
    protected String billAddrStreet;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CommercialCardCode")
    protected String commercialCardCode;
    @XmlElement(name = "CCTxnMode")
    protected CCTxnModeEnum ccTxnMode;
    @XmlElement(name = "CCTxnType")
    protected CCTxnTypeEnum ccTxnType;
    @XmlElement(name = "PrevCCTransId")
    protected String prevCCTransId;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ProcessPayment")
    protected Boolean processPayment;
    @XmlElement(name = "CreditCardChargeInfoEx")
    protected IntuitAnyType creditCardChargeInfoEx;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Gets the value of the nameOnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnAcct() {
        return nameOnAcct;
    }

    /**
     * Sets the value of the nameOnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnAcct(String value) {
        this.nameOnAcct = value;
    }

    /**
     * Gets the value of the ccExpiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCcExpiryMonth() {
        return ccExpiryMonth;
    }

    /**
     * Sets the value of the ccExpiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCcExpiryMonth(Integer value) {
        this.ccExpiryMonth = value;
    }

    /**
     * Gets the value of the ccExpiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCcExpiryYear() {
        return ccExpiryYear;
    }

    /**
     * Sets the value of the ccExpiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCcExpiryYear(Integer value) {
        this.ccExpiryYear = value;
    }

    /**
     * Gets the value of the billAddrStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddrStreet() {
        return billAddrStreet;
    }

    /**
     * Sets the value of the billAddrStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddrStreet(String value) {
        this.billAddrStreet = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the commercialCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialCardCode() {
        return commercialCardCode;
    }

    /**
     * Sets the value of the commercialCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialCardCode(String value) {
        this.commercialCardCode = value;
    }

    /**
     * Gets the value of the ccTxnMode property.
     * 
     * @return
     *     possible object is
     *     {@link CCTxnModeEnum }
     *     
     */
    public CCTxnModeEnum getCCTxnMode() {
        return ccTxnMode;
    }

    /**
     * Sets the value of the ccTxnMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTxnModeEnum }
     *     
     */
    public void setCCTxnMode(CCTxnModeEnum value) {
        this.ccTxnMode = value;
    }

    /**
     * Gets the value of the ccTxnType property.
     * 
     * @return
     *     possible object is
     *     {@link CCTxnTypeEnum }
     *     
     */
    public CCTxnTypeEnum getCCTxnType() {
        return ccTxnType;
    }

    /**
     * Sets the value of the ccTxnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTxnTypeEnum }
     *     
     */
    public void setCCTxnType(CCTxnTypeEnum value) {
        this.ccTxnType = value;
    }

    /**
     * Gets the value of the prevCCTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevCCTransId() {
        return prevCCTransId;
    }

    /**
     * Sets the value of the prevCCTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevCCTransId(String value) {
        this.prevCCTransId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the processPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessPayment() {
        return processPayment;
    }

    /**
     * Sets the value of the processPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessPayment(Boolean value) {
        this.processPayment = value;
    }

    /**
     * Gets the value of the creditCardChargeInfoEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getCreditCardChargeInfoEx() {
        return creditCardChargeInfoEx;
    }

    /**
     * Sets the value of the creditCardChargeInfoEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setCreditCardChargeInfoEx(IntuitAnyType value) {
        this.creditCardChargeInfoEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditChargeInfo that = ((CreditChargeInfo) object);
        {
            String lhsNumber;
            lhsNumber = this.getNumber();
            String rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber, (this.number!= null), (that.number!= null))) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            String lhsNameOnAcct;
            lhsNameOnAcct = this.getNameOnAcct();
            String rhsNameOnAcct;
            rhsNameOnAcct = that.getNameOnAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameOnAcct", lhsNameOnAcct), LocatorUtils.property(thatLocator, "nameOnAcct", rhsNameOnAcct), lhsNameOnAcct, rhsNameOnAcct, (this.nameOnAcct!= null), (that.nameOnAcct!= null))) {
                return false;
            }
        }
        {
            Integer lhsCcExpiryMonth;
            lhsCcExpiryMonth = this.getCcExpiryMonth();
            Integer rhsCcExpiryMonth;
            rhsCcExpiryMonth = that.getCcExpiryMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccExpiryMonth", lhsCcExpiryMonth), LocatorUtils.property(thatLocator, "ccExpiryMonth", rhsCcExpiryMonth), lhsCcExpiryMonth, rhsCcExpiryMonth, (this.ccExpiryMonth!= null), (that.ccExpiryMonth!= null))) {
                return false;
            }
        }
        {
            Integer lhsCcExpiryYear;
            lhsCcExpiryYear = this.getCcExpiryYear();
            Integer rhsCcExpiryYear;
            rhsCcExpiryYear = that.getCcExpiryYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccExpiryYear", lhsCcExpiryYear), LocatorUtils.property(thatLocator, "ccExpiryYear", rhsCcExpiryYear), lhsCcExpiryYear, rhsCcExpiryYear, (this.ccExpiryYear!= null), (that.ccExpiryYear!= null))) {
                return false;
            }
        }
        {
            String lhsBillAddrStreet;
            lhsBillAddrStreet = this.getBillAddrStreet();
            String rhsBillAddrStreet;
            rhsBillAddrStreet = that.getBillAddrStreet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billAddrStreet", lhsBillAddrStreet), LocatorUtils.property(thatLocator, "billAddrStreet", rhsBillAddrStreet), lhsBillAddrStreet, rhsBillAddrStreet, (this.billAddrStreet!= null), (that.billAddrStreet!= null))) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode, (this.postalCode!= null), (that.postalCode!= null))) {
                return false;
            }
        }
        {
            String lhsCommercialCardCode;
            lhsCommercialCardCode = this.getCommercialCardCode();
            String rhsCommercialCardCode;
            rhsCommercialCardCode = that.getCommercialCardCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialCardCode", lhsCommercialCardCode), LocatorUtils.property(thatLocator, "commercialCardCode", rhsCommercialCardCode), lhsCommercialCardCode, rhsCommercialCardCode, (this.commercialCardCode!= null), (that.commercialCardCode!= null))) {
                return false;
            }
        }
        {
            CCTxnModeEnum lhsCCTxnMode;
            lhsCCTxnMode = this.getCCTxnMode();
            CCTxnModeEnum rhsCCTxnMode;
            rhsCCTxnMode = that.getCCTxnMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccTxnMode", lhsCCTxnMode), LocatorUtils.property(thatLocator, "ccTxnMode", rhsCCTxnMode), lhsCCTxnMode, rhsCCTxnMode, (this.ccTxnMode!= null), (that.ccTxnMode!= null))) {
                return false;
            }
        }
        {
            CCTxnTypeEnum lhsCCTxnType;
            lhsCCTxnType = this.getCCTxnType();
            CCTxnTypeEnum rhsCCTxnType;
            rhsCCTxnType = that.getCCTxnType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccTxnType", lhsCCTxnType), LocatorUtils.property(thatLocator, "ccTxnType", rhsCCTxnType), lhsCCTxnType, rhsCCTxnType, (this.ccTxnType!= null), (that.ccTxnType!= null))) {
                return false;
            }
        }
        {
            String lhsPrevCCTransId;
            lhsPrevCCTransId = this.getPrevCCTransId();
            String rhsPrevCCTransId;
            rhsPrevCCTransId = that.getPrevCCTransId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prevCCTransId", lhsPrevCCTransId), LocatorUtils.property(thatLocator, "prevCCTransId", rhsPrevCCTransId), lhsPrevCCTransId, rhsPrevCCTransId, (this.prevCCTransId!= null), (that.prevCCTransId!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsAmount;
            lhsAmount = this.getAmount();
            BigDecimal rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
                return false;
            }
        }
        {
            Boolean lhsProcessPayment;
            lhsProcessPayment = this.isProcessPayment();
            Boolean rhsProcessPayment;
            rhsProcessPayment = that.isProcessPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processPayment", lhsProcessPayment), LocatorUtils.property(thatLocator, "processPayment", rhsProcessPayment), lhsProcessPayment, rhsProcessPayment, (this.processPayment!= null), (that.processPayment!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsCreditCardChargeInfoEx;
            lhsCreditCardChargeInfoEx = this.getCreditCardChargeInfoEx();
            IntuitAnyType rhsCreditCardChargeInfoEx;
            rhsCreditCardChargeInfoEx = that.getCreditCardChargeInfoEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditCardChargeInfoEx", lhsCreditCardChargeInfoEx), LocatorUtils.property(thatLocator, "creditCardChargeInfoEx", rhsCreditCardChargeInfoEx), lhsCreditCardChargeInfoEx, rhsCreditCardChargeInfoEx, (this.creditCardChargeInfoEx!= null), (that.creditCardChargeInfoEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber, (this.number!= null));
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            String theNameOnAcct;
            theNameOnAcct = this.getNameOnAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameOnAcct", theNameOnAcct), currentHashCode, theNameOnAcct, (this.nameOnAcct!= null));
        }
        {
            Integer theCcExpiryMonth;
            theCcExpiryMonth = this.getCcExpiryMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccExpiryMonth", theCcExpiryMonth), currentHashCode, theCcExpiryMonth, (this.ccExpiryMonth!= null));
        }
        {
            Integer theCcExpiryYear;
            theCcExpiryYear = this.getCcExpiryYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccExpiryYear", theCcExpiryYear), currentHashCode, theCcExpiryYear, (this.ccExpiryYear!= null));
        }
        {
            String theBillAddrStreet;
            theBillAddrStreet = this.getBillAddrStreet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billAddrStreet", theBillAddrStreet), currentHashCode, theBillAddrStreet, (this.billAddrStreet!= null));
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode, (this.postalCode!= null));
        }
        {
            String theCommercialCardCode;
            theCommercialCardCode = this.getCommercialCardCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commercialCardCode", theCommercialCardCode), currentHashCode, theCommercialCardCode, (this.commercialCardCode!= null));
        }
        {
            CCTxnModeEnum theCCTxnMode;
            theCCTxnMode = this.getCCTxnMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccTxnMode", theCCTxnMode), currentHashCode, theCCTxnMode, (this.ccTxnMode!= null));
        }
        {
            CCTxnTypeEnum theCCTxnType;
            theCCTxnType = this.getCCTxnType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccTxnType", theCCTxnType), currentHashCode, theCCTxnType, (this.ccTxnType!= null));
        }
        {
            String thePrevCCTransId;
            thePrevCCTransId = this.getPrevCCTransId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prevCCTransId", thePrevCCTransId), currentHashCode, thePrevCCTransId, (this.prevCCTransId!= null));
        }
        {
            BigDecimal theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            Boolean theProcessPayment;
            theProcessPayment = this.isProcessPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processPayment", theProcessPayment), currentHashCode, theProcessPayment, (this.processPayment!= null));
        }
        {
            IntuitAnyType theCreditCardChargeInfoEx;
            theCreditCardChargeInfoEx = this.getCreditCardChargeInfoEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditCardChargeInfoEx", theCreditCardChargeInfoEx), currentHashCode, theCreditCardChargeInfoEx, (this.creditCardChargeInfoEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
