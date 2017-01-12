
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_CD.CE.None complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_CD.CE.None">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_CD.CE.None">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_CD.CE.None")
public class HISTCDCENone
    extends LISTCDCENone
{


    @Override
    public HISTCDCENone withItem(CDCENone... values) {
        if (values!= null) {
            for (CDCENone value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTCDCENone withItem(Collection<CDCENone> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTCDCENone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTCDCENone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTCDCENone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTCDCENone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTCDCENone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTCDCENone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTCDCENone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
