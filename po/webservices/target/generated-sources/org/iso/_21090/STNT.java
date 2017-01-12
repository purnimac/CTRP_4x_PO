
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ST.NT">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ST">
 *       &lt;sequence>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST.NT")
public class STNT
    extends ST
{


    @Override
    public STNT withTranslation(ST... values) {
        if (values!= null) {
            for (ST value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public STNT withTranslation(Collection<ST> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public STNT withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public STNT withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public STNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public STNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public STNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public STNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public STNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public STNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public STNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
