
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_EN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_EN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_EN">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_EN")
public class HISTEN
    extends LISTEN
{


    @Override
    public HISTEN withItem(EN... values) {
        if (values!= null) {
            for (EN value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTEN withItem(Collection<EN> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTEN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTEN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTEN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTEN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTEN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTEN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTEN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
