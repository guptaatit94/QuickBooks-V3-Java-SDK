//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.03 at 12:04:22 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
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
 * 				Product: QBO
 * 				Description: EffectiveTaxRate detail
 * 			
 * 
 * <p>Java class for EffectiveTaxRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectiveTaxRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveTaxRateEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveTaxRate", propOrder = {
    "rateValue",
    "effectiveDate",
    "endDate",
    "effectiveTaxRateEx"
})
public class EffectiveTaxRate implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RateValue")
    protected BigDecimal rateValue;
    @XmlElement(name = "EffectiveDate", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date effectiveDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(name = "EffectiveTaxRateEx")
    protected IntuitAnyType effectiveTaxRateEx;

    /**
     * Gets the value of the rateValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateValue() {
        return rateValue;
    }

    /**
     * Sets the value of the rateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateValue(BigDecimal value) {
        this.rateValue = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
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
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the effectiveTaxRateEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getEffectiveTaxRateEx() {
        return effectiveTaxRateEx;
    }

    /**
     * Sets the value of the effectiveTaxRateEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setEffectiveTaxRateEx(IntuitAnyType value) {
        this.effectiveTaxRateEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EffectiveTaxRate that = ((EffectiveTaxRate) object);
        {
            BigDecimal lhsRateValue;
            lhsRateValue = this.getRateValue();
            BigDecimal rhsRateValue;
            rhsRateValue = that.getRateValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateValue", lhsRateValue), LocatorUtils.property(thatLocator, "rateValue", rhsRateValue), lhsRateValue, rhsRateValue, (this.rateValue!= null), (that.rateValue!= null))) {
                return false;
            }
        }
        {
            Date lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            Date rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            Date lhsEndDate;
            lhsEndDate = this.getEndDate();
            Date rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsEffectiveTaxRateEx;
            lhsEffectiveTaxRateEx = this.getEffectiveTaxRateEx();
            IntuitAnyType rhsEffectiveTaxRateEx;
            rhsEffectiveTaxRateEx = that.getEffectiveTaxRateEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveTaxRateEx", lhsEffectiveTaxRateEx), LocatorUtils.property(thatLocator, "effectiveTaxRateEx", rhsEffectiveTaxRateEx), lhsEffectiveTaxRateEx, rhsEffectiveTaxRateEx, (this.effectiveTaxRateEx!= null), (that.effectiveTaxRateEx!= null))) {
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
            BigDecimal theRateValue;
            theRateValue = this.getRateValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateValue", theRateValue), currentHashCode, theRateValue, (this.rateValue!= null));
        }
        {
            Date theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate, (this.endDate!= null));
        }
        {
            IntuitAnyType theEffectiveTaxRateEx;
            theEffectiveTaxRateEx = this.getEffectiveTaxRateEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveTaxRateEx", theEffectiveTaxRateEx), currentHashCode, theEffectiveTaxRateEx, (this.effectiveTaxRateEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
