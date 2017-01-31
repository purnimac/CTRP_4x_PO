
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="part" type="{uri:iso.org:21090}ENXP" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{uri:iso.org:21090}set_EntityNameUse" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EN", propOrder = {
    "part"
})
@XmlSeeAlso({
    ENON.class,
    ENPN.class,
    ENTN.class
})
public class EN
    extends ANY
{

    protected List<ENXP> part;
    @XmlAttribute(name = "use")
    protected List<EntityNameUse> use;

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENXP }
     * 
     * 
     */
    public List<ENXP> getPart() {
        if (part == null) {
            part = new ArrayList<ENXP>();
        }
        return this.part;
    }

    /**
     * Gets the value of the use property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the use property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNameUse }
     * 
     * 
     */
    public List<EntityNameUse> getUse() {
        if (use == null) {
            use = new ArrayList<EntityNameUse>();
        }
        return this.use;
    }

    public EN withPart(ENXP... values) {
        if (values!= null) {
            for (ENXP value: values) {
                getPart().add(value);
            }
        }
        return this;
    }

    public EN withPart(Collection<ENXP> values) {
        if (values!= null) {
            getPart().addAll(values);
        }
        return this;
    }

    public EN withUse(EntityNameUse... values) {
        if (values!= null) {
            for (EntityNameUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    public EN withUse(Collection<EntityNameUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public EN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public EN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public EN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public EN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public EN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public EN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public EN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
