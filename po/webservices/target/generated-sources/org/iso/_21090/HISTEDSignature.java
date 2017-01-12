
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ED.Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ED.Signature">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ED.Signature">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ED.Signature")
public class HISTEDSignature
    extends LISTEDSignature
{


    @Override
    public HISTEDSignature withItem(EDSignature... values) {
        if (values!= null) {
            for (EDSignature value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTEDSignature withItem(Collection<EDSignature> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTEDSignature withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTEDSignature withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTEDSignature withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTEDSignature withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTEDSignature withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTEDSignature withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTEDSignature withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
