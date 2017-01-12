
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TS.Birth">
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
@XmlType(name = "TS.Birth")
public class TSBirth
    extends TS
{


    @Override
    public TSBirth withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TSBirth withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public TSBirth withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public TSBirth withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public TSBirth withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public TSBirth withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public TSBirth withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TSBirth withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TSBirth withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TSBirth withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TSBirth withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TSBirth withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TSBirth withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
