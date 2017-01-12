
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Doc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Doc">
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
@XmlType(name = "ED.Doc")
@XmlSeeAlso({
    EDDocRef.class,
    EDDocInline.class
})
public class EDDoc
    extends ED
{


    @Override
    public EDDoc withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDDoc withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDDoc withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDDoc withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDDoc withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDDoc withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDDoc withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDDoc withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDDoc withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDDoc withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDDoc withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDDoc withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDDoc withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDDoc withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDDoc withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDDoc withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDDoc withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDDoc withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDDoc withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDDoc withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
