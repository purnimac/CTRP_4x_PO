
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_BL.NonNull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_BL.NonNull">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_BL.NonNull">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_BL.NonNull")
public class HISTBLNonNull
    extends LISTBLNonNull
{


    @Override
    public HISTBLNonNull withItem(BLNonNull... values) {
        if (values!= null) {
            for (BLNonNull value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTBLNonNull withItem(Collection<BLNonNull> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTBLNonNull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTBLNonNull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTBLNonNull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTBLNonNull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTBLNonNull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTBLNonNull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTBLNonNull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
