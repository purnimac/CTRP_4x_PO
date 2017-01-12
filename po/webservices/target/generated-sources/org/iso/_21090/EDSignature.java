
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Signature">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ED">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="reference" type="{uri:iso.org:21090}TEL" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="integrityCheck" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{uri:iso.org:21090}ED" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ED" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="text/xml" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED.Signature")
public class EDSignature
    extends ED
{


    @Override
    public EDSignature withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDSignature withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDSignature withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDSignature withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDSignature withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDSignature withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDSignature withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDSignature withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDSignature withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDSignature withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDSignature withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDSignature withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDSignature withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDSignature withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDSignature withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDSignature withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDSignature withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDSignature withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDSignature withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDSignature withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
