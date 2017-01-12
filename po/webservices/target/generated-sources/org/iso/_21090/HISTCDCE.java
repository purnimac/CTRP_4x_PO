
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_CD.CE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_CD.CE">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_CD.CE">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_CD.CE")
public class HISTCDCE
    extends LISTCDCE
{


    @Override
    public HISTCDCE withItem(CDCE... values) {
        if (values!= null) {
            for (CDCE value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTCDCE withItem(Collection<CDCE> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTCDCE withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTCDCE withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTCDCE withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTCDCE withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTCDCE withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTCDCE withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTCDCE withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
