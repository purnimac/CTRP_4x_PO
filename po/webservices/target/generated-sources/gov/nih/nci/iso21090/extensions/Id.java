
package gov.nih.nci.iso21090.extensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.II;
import org.iso._21090.IdentifierReliability;
import org.iso._21090.IdentifierScope;
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
 *     &lt;extension base="{uri:iso.org:21090}II">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Id")
public class Id
    extends II
{


    @Override
    public Id withRoot(String value) {
        setRoot(value);
        return this;
    }

    @Override
    public Id withExtension(String value) {
        setExtension(value);
        return this;
    }

    @Override
    public Id withIdentifierName(String value) {
        setIdentifierName(value);
        return this;
    }

    @Override
    public Id withDisplayable(Boolean value) {
        setDisplayable(value);
        return this;
    }

    @Override
    public Id withScope(IdentifierScope value) {
        setScope(value);
        return this;
    }

    @Override
    public Id withReliability(IdentifierReliability value) {
        setReliability(value);
        return this;
    }

    @Override
    public Id withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public Id withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public Id withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public Id withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public Id withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public Id withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public Id withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
