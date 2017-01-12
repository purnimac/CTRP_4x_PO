
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ED.Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ED.Image">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ED.Image">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ED.Image")
public class HISTEDImage
    extends LISTEDImage
{


    @Override
    public HISTEDImage withItem(EDImage... values) {
        if (values!= null) {
            for (EDImage value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTEDImage withItem(Collection<EDImage> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTEDImage withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTEDImage withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTEDImage withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTEDImage withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTEDImage withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTEDImage withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTEDImage withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
