
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ED.Doc.Ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED.Doc.Ref">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}ED.Doc">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="xml" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "ED.Doc.Ref")
public class EDDocRef
    extends EDDoc
{


    @Override
    public EDDocRef withData(byte[] value) {
        setData(value);
        return this;
    }

    @Override
    public EDDocRef withXml(Object value) {
        setXml(value);
        return this;
    }

    @Override
    public EDDocRef withReference(TEL value) {
        setReference(value);
        return this;
    }

    @Override
    public EDDocRef withIntegrityCheck(byte[] value) {
        setIntegrityCheck(value);
        return this;
    }

    @Override
    public EDDocRef withThumbnail(ED value) {
        setThumbnail(value);
        return this;
    }

    @Override
    public EDDocRef withTranslation(ED... values) {
        if (values!= null) {
            for (ED value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public EDDocRef withTranslation(Collection<ED> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public EDDocRef withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public EDDocRef withMediaType(String value) {
        setMediaType(value);
        return this;
    }

    @Override
    public EDDocRef withCharset(String value) {
        setCharset(value);
        return this;
    }

    @Override
    public EDDocRef withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EDDocRef withCompression(Compression value) {
        setCompression(value);
        return this;
    }

    @Override
    public EDDocRef withIntegrityCheckAlgorithm(IntegrityCheckAlgorithm value) {
        setIntegrityCheckAlgorithm(value);
        return this;
    }

    @Override
    public EDDocRef withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EDDocRef withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EDDocRef withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EDDocRef withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EDDocRef withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EDDocRef withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EDDocRef withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
