
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="INT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QTY">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INT")
@XmlSeeAlso({
    INTNonNeg.class
})
public class INT
    extends QTY
{

    @XmlAttribute(name = "value")
    protected Integer value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    public INT withValue(Integer value) {
        setValue(value);
        return this;
    }

    @Override
    public INT withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public INT withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public INT withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public INT withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public INT withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public INT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public INT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public INT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public INT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public INT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public INT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public INT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
