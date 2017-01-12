
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QTY">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *         &lt;element name="denominator" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO", propOrder = {
    "numerator",
    "denominator"
})
public class RTO
    extends QTY
{

    protected QTY numerator;
    protected QTY denominator;

    /**
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setNumerator(QTY value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setDenominator(QTY value) {
        this.denominator = value;
    }

    public RTO withNumerator(QTY value) {
        setNumerator(value);
        return this;
    }

    public RTO withDenominator(QTY value) {
        setDenominator(value);
        return this;
    }

    @Override
    public RTO withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public RTO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public RTO withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public RTO withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public RTO withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public RTO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public RTO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public RTO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public RTO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public RTO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public RTO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public RTO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
