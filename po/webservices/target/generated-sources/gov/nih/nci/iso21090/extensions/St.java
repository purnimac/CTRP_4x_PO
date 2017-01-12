
package gov.nih.nci.iso21090.extensions;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.NullFlavor;
import org.iso._21090.ST;
import org.iso._21090.UpdateMode;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ST">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "St")
public class St
    extends ST
{


    @Override
    public St withTranslation(ST... values) {
        if (values!= null) {
            for (ST value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public St withTranslation(Collection<ST> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public St withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public St withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public St withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public St withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public St withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public St withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public St withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public St withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public St withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
