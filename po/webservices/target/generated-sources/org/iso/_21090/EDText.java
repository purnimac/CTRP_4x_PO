
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Text">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ED">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="reference" type="{uri:iso.org:21090}TEL" minOccurs="0"/>
 *         &lt;element name="integrityCheck" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{uri:iso.org:21090}ED" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ED" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="text/plain" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED.Text")
public class EDText
    extends ED
{


    @Override
    public EDText withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDText withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDText withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDText withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDText withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDText withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDText withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDText withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDText withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDText withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDText withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDText withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDText withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDText withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDText withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDText withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDText withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDText withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDText withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDText withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
