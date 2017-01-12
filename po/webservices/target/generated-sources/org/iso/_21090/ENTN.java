
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EN.TN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN.TN">
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
@XmlType(name = "EN.TN")
public class ENTN
    extends EN
{


    @Override
    public ENTN withPart(ENXP... values) {
        if (values!= null) {
            for (ENXP value: values) {
                getPart().add(value);
            }
        }
        return this;
    }

    @Override
    public ENTN withPart(Collection<ENXP> values) {
        if (values!= null) {
            getPart().addAll(values);
        }
        return this;
    }

    @Override
    public ENTN withUse(EntityNameUse... values) {
        if (values!= null) {
            for (EntityNameUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    @Override
    public ENTN withUse(Collection<EntityNameUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public ENTN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public ENTN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public ENTN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public ENTN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public ENTN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public ENTN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public ENTN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
