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
 * Financial transaction representing a Payment by
 * 				check issued to pay one or more bills received from 3rd party
 * 				(vendor) for purchased goods or services. 
 * 
 * <p>Java class for BillPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction">
 *       &lt;sequence>
 *         &lt;element name="VendorRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="APAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="PayType" type="{http://schema.intuit.com/finance/v3}BillPaymentTypeEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="CheckPayment" type="{http://schema.intuit.com/finance/v3}BillPaymentCheck" minOccurs="0"/>
 *           &lt;element name="CreditCardPayment" type="{http://schema.intuit.com/finance/v3}BillPaymentCreditCard" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillPaymentEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPayment", propOrder = {
    "vendorRef",
    "apAccountRef",
    "payType",
    "checkPayment",
    "creditCardPayment",
    "totalAmt",
    "billPaymentEx"
})
public class BillPayment
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VendorRef")
    protected ReferenceType vendorRef;
    @XmlElement(name = "APAccountRef")
    protected ReferenceType apAccountRef;
    @XmlElement(name = "PayType")
    protected BillPaymentTypeEnum payType;
    @XmlElement(name = "CheckPayment")
    protected BillPaymentCheck checkPayment;
    @XmlElement(name = "CreditCardPayment")
    protected BillPaymentCreditCard creditCardPayment;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "BillPaymentEx")
    protected IntuitAnyType billPaymentEx;

    /**
     * Gets the value of the vendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVendorRef() {
        return vendorRef;
    }

    /**
     * Sets the value of the vendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVendorRef(ReferenceType value) {
        this.vendorRef = value;
    }

    /**
     * Gets the value of the apAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAPAccountRef() {
        return apAccountRef;
    }

    /**
     * Sets the value of the apAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAPAccountRef(ReferenceType value) {
        this.apAccountRef = value;
    }

    /**
     * Gets the value of the payType property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentTypeEnum }
     *     
     */
    public BillPaymentTypeEnum getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentTypeEnum }
     *     
     */
    public void setPayType(BillPaymentTypeEnum value) {
        this.payType = value;
    }

    /**
     * Gets the value of the checkPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentCheck }
     *     
     */
    public BillPaymentCheck getCheckPayment() {
        return checkPayment;
    }

    /**
     * Sets the value of the checkPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentCheck }
     *     
     */
    public void setCheckPayment(BillPaymentCheck value) {
        this.checkPayment = value;
    }

    /**
     * Gets the value of the creditCardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentCreditCard }
     *     
     */
    public BillPaymentCreditCard getCreditCardPayment() {
        return creditCardPayment;
    }

    /**
     * Sets the value of the creditCardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentCreditCard }
     *     
     */
    public void setCreditCardPayment(BillPaymentCreditCard value) {
        this.creditCardPayment = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the billPaymentEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getBillPaymentEx() {
        return billPaymentEx;
    }

    /**
     * Sets the value of the billPaymentEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setBillPaymentEx(IntuitAnyType value) {
        this.billPaymentEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BillPayment that = ((BillPayment) object);
        {
            ReferenceType lhsVendorRef;
            lhsVendorRef = this.getVendorRef();
            ReferenceType rhsVendorRef;
            rhsVendorRef = that.getVendorRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorRef", lhsVendorRef), LocatorUtils.property(thatLocator, "vendorRef", rhsVendorRef), lhsVendorRef, rhsVendorRef, (this.vendorRef!= null), (that.vendorRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAPAccountRef;
            lhsAPAccountRef = this.getAPAccountRef();
            ReferenceType rhsAPAccountRef;
            rhsAPAccountRef = that.getAPAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apAccountRef", lhsAPAccountRef), LocatorUtils.property(thatLocator, "apAccountRef", rhsAPAccountRef), lhsAPAccountRef, rhsAPAccountRef, (this.apAccountRef!= null), (that.apAccountRef!= null))) {
                return false;
            }
        }
        {
            BillPaymentTypeEnum lhsPayType;
            lhsPayType = this.getPayType();
            BillPaymentTypeEnum rhsPayType;
            rhsPayType = that.getPayType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payType", lhsPayType), LocatorUtils.property(thatLocator, "payType", rhsPayType), lhsPayType, rhsPayType, (this.payType!= null), (that.payType!= null))) {
                return false;
            }
        }
        {
            BillPaymentCheck lhsCheckPayment;
            lhsCheckPayment = this.getCheckPayment();
            BillPaymentCheck rhsCheckPayment;
            rhsCheckPayment = that.getCheckPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkPayment", lhsCheckPayment), LocatorUtils.property(thatLocator, "checkPayment", rhsCheckPayment), lhsCheckPayment, rhsCheckPayment, (this.checkPayment!= null), (that.checkPayment!= null))) {
                return false;
            }
        }
        {
            BillPaymentCreditCard lhsCreditCardPayment;
            lhsCreditCardPayment = this.getCreditCardPayment();
            BillPaymentCreditCard rhsCreditCardPayment;
            rhsCreditCardPayment = that.getCreditCardPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditCardPayment", lhsCreditCardPayment), LocatorUtils.property(thatLocator, "creditCardPayment", rhsCreditCardPayment), lhsCreditCardPayment, rhsCreditCardPayment, (this.creditCardPayment!= null), (that.creditCardPayment!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt, (this.totalAmt!= null), (that.totalAmt!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsBillPaymentEx;
            lhsBillPaymentEx = this.getBillPaymentEx();
            IntuitAnyType rhsBillPaymentEx;
            rhsBillPaymentEx = that.getBillPaymentEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billPaymentEx", lhsBillPaymentEx), LocatorUtils.property(thatLocator, "billPaymentEx", rhsBillPaymentEx), lhsBillPaymentEx, rhsBillPaymentEx, (this.billPaymentEx!= null), (that.billPaymentEx!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ReferenceType theVendorRef;
            theVendorRef = this.getVendorRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorRef", theVendorRef), currentHashCode, theVendorRef, (this.vendorRef!= null));
        }
        {
            ReferenceType theAPAccountRef;
            theAPAccountRef = this.getAPAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apAccountRef", theAPAccountRef), currentHashCode, theAPAccountRef, (this.apAccountRef!= null));
        }
        {
            BillPaymentTypeEnum thePayType;
            thePayType = this.getPayType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payType", thePayType), currentHashCode, thePayType, (this.payType!= null));
        }
        {
            BillPaymentCheck theCheckPayment;
            theCheckPayment = this.getCheckPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkPayment", theCheckPayment), currentHashCode, theCheckPayment, (this.checkPayment!= null));
        }
        {
            BillPaymentCreditCard theCreditCardPayment;
            theCreditCardPayment = this.getCreditCardPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditCardPayment", theCreditCardPayment), currentHashCode, theCreditCardPayment, (this.creditCardPayment!= null));
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt, (this.totalAmt!= null));
        }
        {
            IntuitAnyType theBillPaymentEx;
            theBillPaymentEx = this.getBillPaymentEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billPaymentEx", theBillPaymentEx), currentHashCode, theBillPaymentEx, (this.billPaymentEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
