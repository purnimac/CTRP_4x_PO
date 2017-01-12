
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_EN.ON complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_EN.ON">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_EN.ON">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_EN.ON")
public class HISTENON
    extends LISTENON
{


    @Override
    public HISTENON withItem(ENON... values) {
        if (values!= null) {
            for (ENON value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTENON withItem(Collection<ENON> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTENON withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTENON withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTENON withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTENON withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTENON withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTENON withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTENON withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
