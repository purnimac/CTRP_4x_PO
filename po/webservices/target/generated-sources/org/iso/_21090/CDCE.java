
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD.CE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CD.CE">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}CD">
 *       &lt;sequence>
 *         &lt;element name="displayName" type="{uri:iso.org:21090}ST" minOccurs="0"/>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="qualifier" type="{uri:iso.org:21090}CR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group" type="{uri:iso.org:21090}CDGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="translation" type="{uri:iso.org:21090}CD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="source" type="{uri:iso.org:21090}XReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CD.CE")
@XmlSeeAlso({
    CDCENone.class,
    CDCV.class
})
public class CDCE
    extends CD
{


    @Override
    public CDCE withDisplayName(ST value) {
        setDisplayName(value);
        return this;
    }

    @Override
    public CDCE withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public CDCE withQualifier(CR... values) {
        if (values!= null) {
            for (CR value: values) {
                getQualifier().add(value);
            }
        }
        return this;
    }

    @Override
    public CDCE withQualifier(Collection<CR> values) {
        if (values!= null) {
            getQualifier().addAll(values);
        }
        return this;
    }

    @Override
    public CDCE withGroup(CDGroup... values) {
        if (values!= null) {
            for (CDGroup value: values) {
                getGroup().add(value);
            }
        }
        return this;
    }

    @Override
    public CDCE withGroup(Collection<CDGroup> values) {
        if (values!= null) {
            getGroup().addAll(values);
        }
        return this;
    }

    @Override
    public CDCE withTranslation(CD... values) {
        if (values!= null) {
            for (CD value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public CDCE withTranslation(Collection<CD> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public CDCE withSource(XReference value) {
        setSource(value);
        return this;
    }

    @Override
    public CDCE withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CDCE withCodeSystem(String value) {
        setCodeSystem(value);
        return this;
    }

    @Override
    public CDCE withCodeSystemName(String value) {
        setCodeSystemName(value);
        return this;
    }

    @Override
    public CDCE withCodeSystemVersion(String value) {
        setCodeSystemVersion(value);
        return this;
    }

    @Override
    public CDCE withValueSet(String value) {
        setValueSet(value);
        return this;
    }

    @Override
    public CDCE withValueSetVersion(String value) {
        setValueSetVersion(value);
        return this;
    }

    @Override
    public CDCE withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public CDCE withCodingRationale(CodingRationale... values) {
        if (values!= null) {
            for (CodingRationale value: values) {
                getCodingRationale().add(value);
            }
        }
        return this;
    }

    @Override
    public CDCE withCodingRationale(Collection<CodingRationale> values) {
        if (values!= null) {
            getCodingRationale().addAll(values);
        }
        return this;
    }

    @Override
    public CDCE withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public CDCE withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public CDCE withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public CDCE withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public CDCE withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public CDCE withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public CDCE withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
