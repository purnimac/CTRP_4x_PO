
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_PQ.Time">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_PQ.Time">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_PQ.Time")
public class HISTPQTime
    extends LISTPQTime
{


    @Override
    public HISTPQTime withItem(PQTime... values) {
        if (values!= null) {
            for (PQTime value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTPQTime withItem(Collection<PQTime> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTPQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTPQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTPQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTPQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTPQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTPQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTPQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
