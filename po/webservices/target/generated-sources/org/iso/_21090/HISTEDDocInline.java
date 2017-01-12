
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_ED.Doc.Inline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_ED.Doc.Inline">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_ED.Doc.Inline">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_ED.Doc.Inline")
public class HISTEDDocInline
    extends LISTEDDocInline
{


    @Override
    public HISTEDDocInline withItem(EDDocInline... values) {
        if (values!= null) {
            for (EDDocInline value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTEDDocInline withItem(Collection<EDDocInline> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTEDDocInline withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTEDDocInline withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTEDDocInline withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTEDDocInline withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTEDDocInline withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTEDDocInline withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTEDDocInline withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
