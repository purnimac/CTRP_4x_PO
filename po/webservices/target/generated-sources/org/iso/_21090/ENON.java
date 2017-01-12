
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EN.ON complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN.ON">
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
@XmlType(name = "EN.ON")
public class ENON
    extends EN
{


    @Override
    public ENON withPart(ENXP... values) {
        if (values!= null) {
            for (ENXP value: values) {
                getPart().add(value);
            }
        }
        return this;
    }

    @Override
    public ENON withPart(Collection<ENXP> values) {
        if (values!= null) {
            getPart().addAll(values);
        }
        return this;
    }

    @Override
    public ENON withUse(EntityNameUse... values) {
        if (values!= null) {
            for (EntityNameUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    @Override
    public ENON withUse(Collection<EntityNameUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public ENON withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public ENON withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public ENON withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public ENON withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public ENON withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public ENON withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public ENON withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
