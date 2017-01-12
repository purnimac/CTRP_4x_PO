
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TS.Date">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}TS">
 *       &lt;sequence>
 *         &lt;element name="expression" type="{uri:iso.org:21090}ED" minOccurs="0"/>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="uncertainty" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TS.Date")
@XmlSeeAlso({
    TSDateFull.class
})
public class TSDate
    extends TS
{


    @Override
    public TSDate withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TSDate withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public TSDate withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public TSDate withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public TSDate withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public TSDate withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public TSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
