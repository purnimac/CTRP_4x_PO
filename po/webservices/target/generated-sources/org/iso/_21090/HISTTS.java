
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_TS">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_TS")
public class HISTTS
    extends LISTTS
{


    @Override
    public HISTTS withItem(TS... values) {
        if (values!= null) {
            for (TS value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTTS withItem(Collection<TS> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTTS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTTS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTTS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTTS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTTS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTTS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTTS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
