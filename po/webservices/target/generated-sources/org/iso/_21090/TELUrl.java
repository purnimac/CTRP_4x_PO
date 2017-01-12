
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEL.Url complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEL.Url">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}TEL">
 *       &lt;sequence>
 *         &lt;element name="useablePeriod" type="{uri:iso.org:21090}QSET_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEL.Url")
public class TELUrl
    extends TEL
{


    @Override
    public TELUrl withUseablePeriod(QSETTS value) {
        setUseablePeriod(value);
        return this;
    }

    @Override
    public TELUrl withUse(TelecommunicationAddressUse... values) {
        if (values!= null) {
            for (TelecommunicationAddressUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    @Override
    public TELUrl withUse(Collection<TelecommunicationAddressUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public TELUrl withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TELUrl withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TELUrl withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TELUrl withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TELUrl withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TELUrl withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TELUrl withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TELUrl withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
