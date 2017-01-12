
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_SC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_SC">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_SC">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_SC")
public class HISTSC
    extends LISTSC
{


    @Override
    public HISTSC withItem(SC... values) {
        if (values!= null) {
            for (SC value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTSC withItem(Collection<SC> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTSC withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTSC withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTSC withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTSC withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTSC withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTSC withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTSC withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
