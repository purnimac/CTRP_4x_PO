
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ED.Doc.Ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ED.Doc.Ref">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ED.Doc.Ref">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ED.Doc.Ref")
public class HISTEDDocRef
    extends LISTEDDocRef
{


    @Override
    public HISTEDDocRef withItem(EDDocRef... values) {
        if (values!= null) {
            for (EDDocRef value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTEDDocRef withItem(Collection<EDDocRef> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTEDDocRef withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTEDDocRef withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTEDDocRef withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTEDDocRef withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTEDDocRef withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTEDDocRef withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTEDDocRef withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
