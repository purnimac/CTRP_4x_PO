
package gov.nih.nci.iso21090.extensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.BL;
import org.iso._21090.NullFlavor;
import org.iso._21090.UpdateMode;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}BL">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Bl")
public class Bl
    extends BL
{


    @Override
    public Bl withValue(Boolean value) {
        setValue(value);
        return this;
    }

    @Override
    public Bl withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public Bl withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public Bl withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public Bl withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public Bl withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public Bl withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public Bl withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
