
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_CD.CV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_CD.CV">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_CD.CV">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_CD.CV")
public class HISTCDCV
    extends LISTCDCV
{


    @Override
    public HISTCDCV withItem(CDCV... values) {
        if (values!= null) {
            for (CDCV value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTCDCV withItem(Collection<CDCV> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTCDCV withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTCDCV withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTCDCV withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTCDCV withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTCDCV withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTCDCV withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTCDCV withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
