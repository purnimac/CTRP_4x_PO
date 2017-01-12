
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ED">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="reference" type="{uri:iso.org:21090}TEL" minOccurs="0"/>
 *         &lt;element name="integrityCheck" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{uri:iso.org:21090}ED" minOccurs="0"/>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ED" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED.Image")
public class EDImage
    extends ED
{


    @Override
    public EDImage withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDImage withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDImage withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDImage withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDImage withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDImage withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDImage withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDImage withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDImage withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDImage withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDImage withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDImage withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDImage withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDImage withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDImage withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDImage withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDImage withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDImage withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDImage withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDImage withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
