
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BL.NonNull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BL.NonNull">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}BL">
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BL.NonNull")
public class BLNonNull
    extends BL
{


    @Override
    public BLNonNull withValue(Boolean value) {
        setValue(value);
        return this;
    }

    @Override
    public BLNonNull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BLNonNull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BLNonNull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BLNonNull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BLNonNull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BLNonNull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BLNonNull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
