
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ST.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ST.NT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ST.NT">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ST.NT")
public class HISTSTNT
    extends LISTSTNT
{


    @Override
    public HISTSTNT withItem(STNT... values) {
        if (values!= null) {
            for (STNT value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTSTNT withItem(Collection<STNT> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTSTNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTSTNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTSTNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTSTNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTSTNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTSTNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTSTNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
