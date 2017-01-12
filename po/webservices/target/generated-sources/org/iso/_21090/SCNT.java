
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC.NT">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}SC">
 *       &lt;sequence>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ST" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="code" type="{uri:iso.org:21090}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC.NT")
public class SCNT
    extends SC
{


    @Override
    public SCNT withCode(CD value) {
        setCode(value);
        return this;
    }

    @Override
    public SCNT withTranslation(ST... values) {
        if (values!= null) {
            for (ST value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public SCNT withTranslation(Collection<ST> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public SCNT withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SCNT withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public SCNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public SCNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public SCNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public SCNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public SCNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public SCNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public SCNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
