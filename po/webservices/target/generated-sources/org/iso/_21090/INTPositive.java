
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INT.Positive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INT.Positive">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}INT.NonNeg">
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
@XmlType(name = "INT.Positive")
public class INTPositive
    extends INTNonNeg
{


    @Override
    public INTPositive withValue(Integer value) {
        setValue(value);
        return this;
    }

    @Override
    public INTPositive withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public INTPositive withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public INTPositive withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public INTPositive withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public INTPositive withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public INTPositive withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public INTPositive withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public INTPositive withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public INTPositive withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public INTPositive withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public INTPositive withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public INTPositive withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
