
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_TEL.Phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_TEL.Phone">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_TEL.Phone">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_TEL.Phone")
public class HISTTELPhone
    extends LISTTELPhone
{


    @Override
    public HISTTELPhone withItem(TELPhone... values) {
        if (values!= null) {
            for (TELPhone value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTTELPhone withItem(Collection<TELPhone> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTTELPhone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTTELPhone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTTELPhone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTTELPhone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTTELPhone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTTELPhone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTTELPhone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
