
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_PQ">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_PQ")
public class HISTPQ
    extends LISTPQ
{


    @Override
    public HISTPQ withItem(PQ... values) {
        if (values!= null) {
            for (PQ value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTPQ withItem(Collection<PQ> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTPQ withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTPQ withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTPQ withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTPQ withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTPQ withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTPQ withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTPQ withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
