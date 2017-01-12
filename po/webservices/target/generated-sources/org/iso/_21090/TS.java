
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QTY">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TS")
@XmlSeeAlso({
    TSBirth.class,
    TSDate.class,
    TSDateTime.class
})
public class TS
    extends QTY
{

    @XmlAttribute(name = "value")
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    public TS withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TS withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public TS withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public TS withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public TS withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public TS withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public TS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
