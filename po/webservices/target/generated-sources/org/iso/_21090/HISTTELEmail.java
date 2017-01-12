
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_TEL.Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_TEL.Email">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_TEL.Email">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_TEL.Email")
public class HISTTELEmail
    extends LISTTELEmail
{


    @Override
    public HISTTELEmail withItem(TELEmail... values) {
        if (values!= null) {
            for (TELEmail value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTTELEmail withItem(Collection<TELEmail> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTTELEmail withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTTELEmail withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTTELEmail withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTTELEmail withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTTELEmail withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTTELEmail withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTTELEmail withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
