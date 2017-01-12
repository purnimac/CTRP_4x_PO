
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ST">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ST">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ST")
public class HISTST
    extends LISTST
{


    @Override
    public HISTST withItem(ST... values) {
        if (values!= null) {
            for (ST value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTST withItem(Collection<ST> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTST withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTST withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTST withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTST withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTST withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTST withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTST withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
