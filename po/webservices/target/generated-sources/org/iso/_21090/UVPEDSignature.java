
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UVP_ED.Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UVP_ED.Signature">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="value" type="{uri:iso.org:21090}ED.Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="probability" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UVP_ED.Signature", propOrder = {
    "value"
})
public class UVPEDSignature
    extends ANY
{

    protected EDSignature value;
    @XmlAttribute(name = "probability")
    protected Double probability;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EDSignature }
     *     
     */
    public EDSignature getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDSignature }
     *     
     */
    public void setValue(EDSignature value) {
        this.value = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProbability(Double value) {
        this.probability = value;
    }

    public UVPEDSignature withValue(EDSignature value) {
        setValue(value);
        return this;
    }

    public UVPEDSignature withProbability(Double value) {
        setProbability(value);
        return this;
    }

    @Override
    public UVPEDSignature withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public UVPEDSignature withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public UVPEDSignature withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public UVPEDSignature withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public UVPEDSignature withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public UVPEDSignature withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public UVPEDSignature withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}