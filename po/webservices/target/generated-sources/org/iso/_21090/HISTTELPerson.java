
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_TEL.Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_TEL.Person">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_TEL.Person">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_TEL.Person")
public class HISTTELPerson
    extends LISTTELPerson
{


    @Override
    public HISTTELPerson withItem(TELPerson... values) {
        if (values!= null) {
            for (TELPerson value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTTELPerson withItem(Collection<TELPerson> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTTELPerson withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTTELPerson withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTTELPerson withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTTELPerson withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTTELPerson withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTTELPerson withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTTELPerson withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
