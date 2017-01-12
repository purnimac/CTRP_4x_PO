
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_II complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_II">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_II">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_II")
public class HISTII
    extends LISTII
{


    @Override
    public HISTII withItem(II... values) {
        if (values!= null) {
            for (II value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTII withItem(Collection<II> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTII withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTII withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTII withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTII withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTII withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTII withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTII withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
