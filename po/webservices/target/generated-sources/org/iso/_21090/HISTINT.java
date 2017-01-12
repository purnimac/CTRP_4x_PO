
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_INT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_INT">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_INT")
public class HISTINT
    extends LISTINT
{


    @Override
    public HISTINT withItem(INT... values) {
        if (values!= null) {
            for (INT value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTINT withItem(Collection<INT> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTINT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTINT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTINT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTINT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTINT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTINT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTINT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
