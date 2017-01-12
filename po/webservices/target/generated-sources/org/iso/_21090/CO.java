
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QTY">
 *       &lt;sequence>
 *         &lt;element name="code" type="{uri:iso.org:21090}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO", propOrder = {
    "code"
})
public class CO
    extends QTY
{

    protected CD code;
    @XmlAttribute(name = "value")
    protected Integer value;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

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

    public CO withCode(CD value) {
        setCode(value);
        return this;
    }

    public CO withValue(Integer value) {
        setValue(value);
        return this;
    }

    @Override
    public CO withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public CO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public CO withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public CO withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public CO withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public CO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public CO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public CO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public CO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public CO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public CO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public CO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
