
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ED.Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ED.Text">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ED.Text">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ED.Text")
public class HISTEDText
    extends LISTEDText
{


    @Override
    public HISTEDText withItem(EDText... values) {
        if (values!= null) {
            for (EDText value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTEDText withItem(Collection<EDText> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTEDText withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTEDText withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTEDText withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTEDText withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTEDText withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTEDText withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTEDText withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
