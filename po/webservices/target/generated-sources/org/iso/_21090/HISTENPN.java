
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_EN.PN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_EN.PN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_EN.PN">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_EN.PN")
public class HISTENPN
    extends LISTENPN
{


    @Override
    public HISTENPN withItem(ENPN... values) {
        if (values!= null) {
            for (ENPN value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTENPN withItem(Collection<ENPN> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTENPN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTENPN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTENPN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTENPN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTENPN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTENPN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTENPN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
