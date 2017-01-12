
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TEL.Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEL.Email">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}TEL.Person">
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
@XmlType(name = "TEL.Email")
public class TELEmail
    extends TELPerson
{


    @Override
    public TELEmail withUseablePeriod(QSETTS value) {
        setUseablePeriod(value);
        return this;
    }

    @Override
    public TELEmail withUse(TelecommunicationAddressUse... values) {
        if (values!= null) {
            for (TelecommunicationAddressUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    @Override
    public TELEmail withUse(Collection<TelecommunicationAddressUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public TELEmail withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TELEmail withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TELEmail withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TELEmail withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TELEmail withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TELEmail withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TELEmail withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TELEmail withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
