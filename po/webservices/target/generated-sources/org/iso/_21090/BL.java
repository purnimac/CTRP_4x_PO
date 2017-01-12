
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.iso21090.extensions.Bl;


/**
 * <p>Java class for BL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BL")
@XmlSeeAlso({
    BLNonNull.class,
    Bl.class
})
public class BL
    extends ANY
{

    @XmlAttribute(name = "value")
    protected Boolean value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

    public BL withValue(Boolean value) {
        setValue(value);
        return this;
    }

    @Override
    public BL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
