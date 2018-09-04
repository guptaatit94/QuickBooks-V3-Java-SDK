//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.03 at 12:04:22 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesktopEntityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DesktopEntityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="CREDIT_CARD"/>
 *     &lt;enumeration value="DEPOSIT"/>
 *     &lt;enumeration value="CHECK"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="CASHSALE"/>
 *     &lt;enumeration value="CREDIT_MEMO"/>
 *     &lt;enumeration value="APP_PAY"/>
 *     &lt;enumeration value="GENERAL_JOURNAL"/>
 *     &lt;enumeration value="BILL"/>
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="CREDIT_CARD_REFUND"/>
 *     &lt;enumeration value="BILL_REFUND"/>
 *     &lt;enumeration value="AR_CREDIT_CARD_REFUND"/>
 *     &lt;enumeration value="BILL_CHECK"/>
 *     &lt;enumeration value="BILL_CREDIT_CARD"/>
 *     &lt;enumeration value="SALES_TAX_PAYMENT"/>
 *     &lt;enumeration value="PURCHASE_ORDER"/>
 *     &lt;enumeration value="INVENTORY_ADJUSTMENT"/>
 *     &lt;enumeration value="INVENTORY_RECEIPT"/>
 *     &lt;enumeration value="PAYCHECK"/>
 *     &lt;enumeration value="LIABILITY_CHECK"/>
 *     &lt;enumeration value="BEGIN_BALANCE_CHECK"/>
 *     &lt;enumeration value="LIABILITY_ADJUSTMENT"/>
 *     &lt;enumeration value="ESTIMATE"/>
 *     &lt;enumeration value="STATEMENT_CHARGE"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="SALESORDER"/>
 *     &lt;enumeration value="QBRSLIABCHECK"/>
 *     &lt;enumeration value="BUILDASSEMBLY"/>
 *     &lt;enumeration value="EFPLIABCHECK"/>
 *     &lt;enumeration value="PRIOR_PMT"/>
 *     &lt;enumeration value="LIAB_REFUND_CHECK"/>
 *     &lt;enumeration value="ITEM_SERVICE"/>
 *     &lt;enumeration value="ITEM_INVENTORY"/>
 *     &lt;enumeration value="ITEM_ASSEMBLY"/>
 *     &lt;enumeration value="ITEM_PART"/>
 *     &lt;enumeration value="ITEM_FIXEDASSET"/>
 *     &lt;enumeration value="ITEM_CHARGES"/>
 *     &lt;enumeration value="ITEM_SUBTOTAL"/>
 *     &lt;enumeration value="ITEM_GROUP"/>
 *     &lt;enumeration value="ITEM_DISCOUNT"/>
 *     &lt;enumeration value="ITEM_PAYMENT"/>
 *     &lt;enumeration value="ITEM_TAXCOMP"/>
 *     &lt;enumeration value="ITEM_TAXGROUP"/>
 *     &lt;enumeration value="ITEM_GROUPEND"/>
 *     &lt;enumeration value="ITEM_PURCHASE"/>
 *     &lt;enumeration value="ITEM_PO"/>
 *     &lt;enumeration value="ITEM_INVOICE"/>
 *     &lt;enumeration value="ITEM_ALLITEMS"/>
 *     &lt;enumeration value="ITEM_NOTAXES"/>
 *     &lt;enumeration value="ITEM_SERVICES_AND_CHARGES"/>
 *     &lt;enumeration value="ITEM_REAL_GROUP_END"/>
 *     &lt;enumeration value="ITEM_MAX"/>
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="VENDOR"/>
 *     &lt;enumeration value="EMPLOYEE"/>
 *     &lt;enumeration value="OTHERNAME"/>
 *     &lt;enumeration value="NULLLINKTYPE"/>
 *     &lt;enumeration value="UNUSED1"/>
 *     &lt;enumeration value="REFUNDCHECKTOCRMEMO"/>
 *     &lt;enumeration value="INVOICETOCRMEMO"/>
 *     &lt;enumeration value="INVOICETOPAYMENT"/>
 *     &lt;enumeration value="INVOICETODISCOUNT"/>
 *     &lt;enumeration value="BILLTOCHECK"/>
 *     &lt;enumeration value="BILLTOCCARD"/>
 *     &lt;enumeration value="BILLTOCREDIT"/>
 *     &lt;enumeration value="DEPOSITTOPAYMENT"/>
 *     &lt;enumeration value="REFUNDCHECKTOPAYMENT"/>
 *     &lt;enumeration value="INVOICETOPMTLINE"/>
 *     &lt;enumeration value="INVOICETOCREDITLINE"/>
 *     &lt;enumeration value="BILLTOCREDITLINE"/>
 *     &lt;enumeration value="CREDLINETODISCLINE"/>
 *     &lt;enumeration value="PURCHASEORDERTORECEIPT"/>
 *     &lt;enumeration value="BILLTODISCOUNT"/>
 *     &lt;enumeration value="INVOICETODISCOUNTLINE"/>
 *     &lt;enumeration value="INVOICETOESTIMATEQTY"/>
 *     &lt;enumeration value="INVOICETOESTIMATEAMT"/>
 *     &lt;enumeration value="INVOICETOSALESORDERQTY"/>
 *     &lt;enumeration value="INVOICETOSALESORDERAMT"/>
 *     &lt;enumeration value="JOURNALENTRYTOCRMEMO"/>
 *     &lt;enumeration value="AR_CCREFUND_TO_CREDITMEMO"/>
 *     &lt;enumeration value="AR_CCREFUND_TO_PAYMENT"/>
 *     &lt;enumeration value="AR_CCREFUND_TO_JOURNAL"/>
 *     &lt;enumeration value="GIRO_TO_CHECK"/>
 *     &lt;enumeration value="ITEM"/>
 *     &lt;enumeration value="DEPARTMENT"/>
 *     &lt;enumeration value="USERS"/>
 *     &lt;enumeration value="KLASS"/>
 *     &lt;enumeration value="PAYMENT_METHOD"/>
 *     &lt;enumeration value="TERM"/>
 *     &lt;enumeration value="BUDGET"/>
 *     &lt;enumeration value="TAX_CODE"/>
 *     &lt;enumeration value="TAX_CODE_RATE"/>
 *     &lt;enumeration value="TAX_AGENCY"/>
 *     &lt;enumeration value="ATTACHABLE"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="PREFERENCES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DesktopEntityTypeEnum")
@XmlEnum
public enum DesktopEntityTypeEnum {

    ANY("ANY"),
    CREDIT_CARD("CREDIT_CARD"),
    DEPOSIT("DEPOSIT"),
    CHECK("CHECK"),
    INVOICE("INVOICE"),
    CASHSALE("CASHSALE"),
    CREDIT_MEMO("CREDIT_MEMO"),
    APP_PAY("APP_PAY"),
    GENERAL_JOURNAL("GENERAL_JOURNAL"),
    BILL("BILL"),
    GENERIC("GENERIC"),
    CREDIT_CARD_REFUND("CREDIT_CARD_REFUND"),
    BILL_REFUND("BILL_REFUND"),
    AR_CREDIT_CARD_REFUND("AR_CREDIT_CARD_REFUND"),
    BILL_CHECK("BILL_CHECK"),
    BILL_CREDIT_CARD("BILL_CREDIT_CARD"),
    SALES_TAX_PAYMENT("SALES_TAX_PAYMENT"),
    PURCHASE_ORDER("PURCHASE_ORDER"),
    INVENTORY_ADJUSTMENT("INVENTORY_ADJUSTMENT"),
    INVENTORY_RECEIPT("INVENTORY_RECEIPT"),
    PAYCHECK("PAYCHECK"),
    LIABILITY_CHECK("LIABILITY_CHECK"),
    BEGIN_BALANCE_CHECK("BEGIN_BALANCE_CHECK"),
    LIABILITY_ADJUSTMENT("LIABILITY_ADJUSTMENT"),
    ESTIMATE("ESTIMATE"),
    STATEMENT_CHARGE("STATEMENT_CHARGE"),
    TRANSFER("TRANSFER"),
    SALESORDER("SALESORDER"),
    QBRSLIABCHECK("QBRSLIABCHECK"),
    BUILDASSEMBLY("BUILDASSEMBLY"),
    EFPLIABCHECK("EFPLIABCHECK"),
    PRIOR_PMT("PRIOR_PMT"),
    LIAB_REFUND_CHECK("LIAB_REFUND_CHECK"),
    ITEM_SERVICE("ITEM_SERVICE"),
    ITEM_INVENTORY("ITEM_INVENTORY"),
    ITEM_ASSEMBLY("ITEM_ASSEMBLY"),
    ITEM_PART("ITEM_PART"),
    ITEM_FIXEDASSET("ITEM_FIXEDASSET"),
    ITEM_CHARGES("ITEM_CHARGES"),
    ITEM_SUBTOTAL("ITEM_SUBTOTAL"),
    ITEM_GROUP("ITEM_GROUP"),
    ITEM_DISCOUNT("ITEM_DISCOUNT"),
    ITEM_PAYMENT("ITEM_PAYMENT"),
    ITEM_TAXCOMP("ITEM_TAXCOMP"),
    ITEM_TAXGROUP("ITEM_TAXGROUP"),
    ITEM_GROUPEND("ITEM_GROUPEND"),
    ITEM_PURCHASE("ITEM_PURCHASE"),
    ITEM_PO("ITEM_PO"),
    ITEM_INVOICE("ITEM_INVOICE"),
    ITEM_ALLITEMS("ITEM_ALLITEMS"),
    ITEM_NOTAXES("ITEM_NOTAXES"),
    ITEM_SERVICES_AND_CHARGES("ITEM_SERVICES_AND_CHARGES"),
    ITEM_REAL_GROUP_END("ITEM_REAL_GROUP_END"),
    ITEM_MAX("ITEM_MAX"),
    CUSTOMER("CUSTOMER"),
    VENDOR("VENDOR"),
    EMPLOYEE("EMPLOYEE"),
    OTHERNAME("OTHERNAME"),
    NULLLINKTYPE("NULLLINKTYPE"),
    @XmlEnumValue("UNUSED1")
    UNUSED_1("UNUSED1"),
    REFUNDCHECKTOCRMEMO("REFUNDCHECKTOCRMEMO"),
    INVOICETOCRMEMO("INVOICETOCRMEMO"),
    INVOICETOPAYMENT("INVOICETOPAYMENT"),
    INVOICETODISCOUNT("INVOICETODISCOUNT"),
    BILLTOCHECK("BILLTOCHECK"),
    BILLTOCCARD("BILLTOCCARD"),
    BILLTOCREDIT("BILLTOCREDIT"),
    DEPOSITTOPAYMENT("DEPOSITTOPAYMENT"),
    REFUNDCHECKTOPAYMENT("REFUNDCHECKTOPAYMENT"),
    INVOICETOPMTLINE("INVOICETOPMTLINE"),
    INVOICETOCREDITLINE("INVOICETOCREDITLINE"),
    BILLTOCREDITLINE("BILLTOCREDITLINE"),
    CREDLINETODISCLINE("CREDLINETODISCLINE"),
    PURCHASEORDERTORECEIPT("PURCHASEORDERTORECEIPT"),
    BILLTODISCOUNT("BILLTODISCOUNT"),
    INVOICETODISCOUNTLINE("INVOICETODISCOUNTLINE"),
    INVOICETOESTIMATEQTY("INVOICETOESTIMATEQTY"),
    INVOICETOESTIMATEAMT("INVOICETOESTIMATEAMT"),
    INVOICETOSALESORDERQTY("INVOICETOSALESORDERQTY"),
    INVOICETOSALESORDERAMT("INVOICETOSALESORDERAMT"),
    JOURNALENTRYTOCRMEMO("JOURNALENTRYTOCRMEMO"),
    AR_CCREFUND_TO_CREDITMEMO("AR_CCREFUND_TO_CREDITMEMO"),
    AR_CCREFUND_TO_PAYMENT("AR_CCREFUND_TO_PAYMENT"),
    AR_CCREFUND_TO_JOURNAL("AR_CCREFUND_TO_JOURNAL"),
    GIRO_TO_CHECK("GIRO_TO_CHECK"),
    ITEM("ITEM"),
    DEPARTMENT("DEPARTMENT"),
    USERS("USERS"),
    KLASS("KLASS"),
    PAYMENT_METHOD("PAYMENT_METHOD"),
    TERM("TERM"),
    BUDGET("BUDGET"),
    TAX_CODE("TAX_CODE"),
    TAX_CODE_RATE("TAX_CODE_RATE"),
    TAX_AGENCY("TAX_AGENCY"),
    ATTACHABLE("ATTACHABLE"),
    ACCOUNT("ACCOUNT"),
    PREFERENCES("PREFERENCES");
    private final String value;

    DesktopEntityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DesktopEntityTypeEnum fromValue(String v) {
        for (DesktopEntityTypeEnum c: DesktopEntityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
