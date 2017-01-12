
package gov.nih.nci.iso21090.extensions;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.CD;
import org.iso._21090.CDGroup;
import org.iso._21090.CR;
import org.iso._21090.CodingRationale;
import org.iso._21090.EDText;
import org.iso._21090.NullFlavor;
import org.iso._21090.ST;
import org.iso._21090.UpdateMode;
import org.iso._21090.XReference;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}CD">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Cd")
public class Cd
    extends CD
{


    @Override
    public Cd withDisplayName(ST value) {
        setDisplayName(value);
        return this;
    }

    @Override
    public Cd withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public Cd withQualifier(CR... values) {
        if (values!= null) {
            for (CR value: values) {
                getQualifier().add(value);
            }
        }
        return this;
    }

    @Override
    public Cd withQualifier(Collection<CR> values) {
        if (values!= null) {
            getQualifier().addAll(values);
        }
        return this;
    }

    @Override
    public Cd withGroup(CDGroup... values) {
        if (values!= null) {
            for (CDGroup value: values) {
                getGroup().add(value);
            }
        }
        return this;
    }

    @Override
    public Cd withGroup(Collection<CDGroup> values) {
        if (values!= null) {
            getGroup().addAll(values);
        }
        return this;
    }

    @Override
    public Cd withTranslation(CD... values) {
        if (values!= null) {
            for (CD value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public Cd withTranslation(Collection<CD> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public Cd withSource(XReference value) {
        setSource(value);
        return this;
    }

    @Override
    public Cd withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public Cd withCodeSystem(String value) {
        setCodeSystem(value);
        return this;
    }

    @Override
    public Cd withCodeSystemName(String value) {
        setCodeSystemName(value);
        return this;
    }

    @Override
    public Cd withCodeSystemVersion(String value) {
        setCodeSystemVersion(value);
        return this;
    }

    @Override
    public Cd withValueSet(String value) {
        setValueSet(value);
        return this;
    }

    @Override
    public Cd withValueSetVersion(String value) {
        setValueSetVersion(value);
        return this;
    }

    @Override
    public Cd withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public Cd withCodingRationale(CodingRationale... values) {
        if (values!= null) {
            for (CodingRationale value: values) {
                getCodingRationale().add(value);
            }
        }
        return this;
    }

    @Override
    public Cd withCodingRationale(Collection<CodingRationale> values) {
        if (values!= null) {
            getCodingRationale().addAll(values);
        }
        return this;
    }

    @Override
    public Cd withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public Cd withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public Cd withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public Cd withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public Cd withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public Cd withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public Cd withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
