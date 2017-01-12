
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ED complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ED">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ED">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ED")
public class HISTED
    extends LISTED
{


    @Override
    public HISTED withItem(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTED withItem(Collection<ED> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTED withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTED withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTED withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTED withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTED withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTED withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTED withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
