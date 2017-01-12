
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_TEL.Url complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_TEL.Url">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_TEL.Url">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_TEL.Url")
public class HISTTELUrl
    extends LISTTELUrl
{


    @Override
    public HISTTELUrl withItem(TELUrl... values) {
        if (values!= null) {
            for (TELUrl value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTTELUrl withItem(Collection<TELUrl> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTTELUrl withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTTELUrl withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTTELUrl withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTTELUrl withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTTELUrl withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTTELUrl withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTTELUrl withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
