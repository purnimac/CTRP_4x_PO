
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_TS.Date">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_TS.Date">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_TS.Date")
public class HISTTSDate
    extends LISTTSDate
{


    @Override
    public HISTTSDate withItem(TSDate... values) {
        if (values!= null) {
            for (TSDate value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTTSDate withItem(Collection<TSDate> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTTSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTTSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTTSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTTSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTTSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTTSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTTSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
