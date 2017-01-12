
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TS.DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TS.DateTime">
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
@XmlType(name = "TS.DateTime")
@XmlSeeAlso({
    TSDateTimeFull.class
})
public class TSDateTime
    extends TS
{


    @Override
    public TSDateTime withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TSDateTime withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public TSDateTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public TSDateTime withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public TSDateTime withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public TSDateTime withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public TSDateTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TSDateTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TSDateTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TSDateTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TSDateTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TSDateTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TSDateTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
