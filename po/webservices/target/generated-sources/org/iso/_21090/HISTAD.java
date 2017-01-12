
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_AD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_AD">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_AD">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_AD")
public class HISTAD
    extends LISTAD
{


    @Override
    public HISTAD withItem(AD... values) {
        if (values!= null) {
            for (AD value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTAD withItem(Collection<AD> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTAD withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTAD withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTAD withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTAD withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTAD withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTAD withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTAD withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
