
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_BL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_BL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_BL">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_BL")
public class HISTBL
    extends LISTBL
{


    @Override
    public HISTBL withItem(BL... values) {
        if (values!= null) {
            for (BL value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTBL withItem(Collection<BL> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTBL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTBL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTBL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTBL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTBL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTBL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTBL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
