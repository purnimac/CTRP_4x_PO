
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_MO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_MO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_MO">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_MO")
public class HISTMO
    extends LISTMO
{


    @Override
    public HISTMO withItem(MO... values) {
        if (values!= null) {
            for (MO value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTMO withItem(Collection<MO> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTMO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTMO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTMO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTMO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTMO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTMO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTMO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
