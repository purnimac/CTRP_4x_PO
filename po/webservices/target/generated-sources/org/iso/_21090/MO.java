
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QTY">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="currency" type="{uri:iso.org:21090}Code" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MO")
public class MO
    extends QTY
{

    @XmlAttribute(name = "value")
    protected Double value;
    @XmlAttribute(name = "precision")
    protected Integer precision;
    @XmlAttribute(name = "currency")
    protected String currency;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    public MO withValue(Double value) {
        setValue(value);
        return this;
    }

    public MO withPrecision(Integer value) {
        setPrecision(value);
        return this;
    }

    public MO withCurrency(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public MO withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public MO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public MO withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public MO withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public MO withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public MO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public MO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public MO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public MO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public MO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public MO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public MO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
