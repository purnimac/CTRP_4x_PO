
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_REAL">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_REAL")
public class HISTREAL
    extends LISTREAL
{


    @Override
    public HISTREAL withItem(REAL... values) {
        if (values!= null) {
            for (REAL value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTREAL withItem(Collection<REAL> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTREAL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTREAL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTREAL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTREAL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTREAL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTREAL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTREAL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}