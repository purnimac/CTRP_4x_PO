
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_SC.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_SC.NT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_SC.NT">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_SC.NT")
public class HISTSCNT
    extends LISTSCNT
{


    @Override
    public HISTSCNT withItem(SCNT... values) {
        if (values!= null) {
            for (SCNT value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTSCNT withItem(Collection<SCNT> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTSCNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTSCNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTSCNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTSCNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTSCNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTSCNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTSCNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
