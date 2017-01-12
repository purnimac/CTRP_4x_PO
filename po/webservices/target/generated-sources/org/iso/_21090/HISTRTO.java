
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_RTO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_RTO">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_RTO")
public class HISTRTO
    extends LISTRTO
{


    @Override
    public HISTRTO withItem(RTO... values) {
        if (values!= null) {
            for (RTO value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTRTO withItem(Collection<RTO> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTRTO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTRTO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTRTO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTRTO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTRTO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTRTO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTRTO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
