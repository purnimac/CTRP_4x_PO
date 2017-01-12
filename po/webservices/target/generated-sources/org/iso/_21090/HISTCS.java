
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_CS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_CS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_CS">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_CS")
public class HISTCS
    extends LISTCS
{


    @Override
    public HISTCS withItem(CS... values) {
        if (values!= null) {
            for (CS value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTCS withItem(Collection<CS> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTCS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTCS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTCS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTCS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTCS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTCS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTCS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
