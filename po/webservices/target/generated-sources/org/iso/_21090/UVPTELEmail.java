
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UVP_TEL.Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UVP_TEL.Email">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="value" type="{uri:iso.org:21090}TEL.Email" minOccurs="0"/>
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
@XmlType(name = "UVP_TEL.Email", propOrder = {
    "value"
})
public class UVPTELEmail
    extends ANY
{

    protected TELEmail value;
    @XmlAttribute(name = "probability")
    protected Double probability;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link TELEmail }
     *     
     */
    public TELEmail getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link TELEmail }
     *     
     */
    public void setValue(TELEmail value) {
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

    public UVPTELEmail withValue(TELEmail value) {
        setValue(value);
        return this;
    }

    public UVPTELEmail withProbability(Double value) {
        setProbability(value);
        return this;
    }

    @Override
    public UVPTELEmail withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public UVPTELEmail withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public UVPTELEmail withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public UVPTELEmail withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public UVPTELEmail withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public UVPTELEmail withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public UVPTELEmail withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}