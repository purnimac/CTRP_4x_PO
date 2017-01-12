
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Narrative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Narrative">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ED">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="xml" type="{uri:iso.org:21090}Narrative" minOccurs="0"/>
 *         &lt;element name="reference" type="{uri:iso.org:21090}TEL" minOccurs="0"/>
 *         &lt;element name="integrityCheck" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="thumbnail" type="{uri:iso.org:21090}ED" minOccurs="0"/>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ED" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="text/x-hl7-text+xml" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED.Narrative")
public class EDNarrative
    extends ED
{


    @Override
    public EDNarrative withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDNarrative withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDNarrative withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDNarrative withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDNarrative withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDNarrative withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDNarrative withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDNarrative withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDNarrative withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDNarrative withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDNarrative withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDNarrative withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDNarrative withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDNarrative withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDNarrative withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDNarrative withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDNarrative withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDNarrative withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDNarrative withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDNarrative withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
