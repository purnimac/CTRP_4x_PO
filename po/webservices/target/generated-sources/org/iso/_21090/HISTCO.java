
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_CO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_CO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_CO">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_CO")
public class HISTCO
    extends LISTCO
{


    @Override
    public HISTCO withItem(CO... values) {
        if (values!= null) {
            for (CO value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTCO withItem(Collection<CO> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTCO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTCO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTCO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTCO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTCO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTCO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTCO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
