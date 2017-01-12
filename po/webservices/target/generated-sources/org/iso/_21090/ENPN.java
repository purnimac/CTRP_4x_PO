
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EN.PN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN.PN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}EN">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN.PN")
public class ENPN
    extends EN
{


    @Override
    public ENPN withPart(ENXP... values) {
        if (values!= null) {
            for (ENXP value: values) {
                getPart().add(value);
            }
        }
        return this;
    }

    @Override
    public ENPN withPart(Collection<ENXP> values) {
        if (values!= null) {
            getPart().addAll(values);
        }
        return this;
    }

    @Override
    public ENPN withUse(EntityNameUse... values) {
        if (values!= null) {
            for (EntityNameUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    @Override
    public ENPN withUse(Collection<EntityNameUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public ENPN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public ENPN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public ENPN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public ENPN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public ENPN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public ENPN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public ENPN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
