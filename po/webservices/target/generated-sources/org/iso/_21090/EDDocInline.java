
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Doc.Inline complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Doc.Inline">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ED.Doc">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="reference" type="{uri:iso.org:21090}TEL" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "ED.Doc.Inline")
public class EDDocInline
    extends EDDoc
{


    @Override
    public EDDocInline withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDDocInline withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDDocInline withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDDocInline withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDDocInline withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDDocInline withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDDocInline withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDDocInline withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDDocInline withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDDocInline withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDDocInline withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDDocInline withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDDocInline withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDDocInline withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDDocInline withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDDocInline withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDDocInline withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDDocInline withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDDocInline withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDDocInline withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
