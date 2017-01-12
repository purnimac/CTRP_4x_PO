
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_EN.TN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_EN.TN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_EN.TN">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_EN.TN")
public class HISTENTN
    extends LISTENTN
{


    @Override
    public HISTENTN withItem(ENTN... values) {
        if (values!= null) {
            for (ENTN value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTENTN withItem(Collection<ENTN> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTENTN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTENTN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTENTN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTENTN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTENTN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTENTN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTENTN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
