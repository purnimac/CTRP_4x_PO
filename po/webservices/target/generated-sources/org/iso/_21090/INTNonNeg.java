
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INT.NonNeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INT.NonNeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}INT">
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
@XmlType(name = "INT.NonNeg")
@XmlSeeAlso({
    INTPositive.class
})
public class INTNonNeg
    extends INT
{


    @Override
    public INTNonNeg withValue(Integer value) {
        setValue(value);
        return this;
    }

    @Override
    public INTNonNeg withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public INTNonNeg withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public INTNonNeg withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public INTNonNeg withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public INTNonNeg withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public INTNonNeg withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public INTNonNeg withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public INTNonNeg withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public INTNonNeg withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public INTNonNeg withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public INTNonNeg withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public INTNonNeg withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
