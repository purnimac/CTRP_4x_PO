
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AD">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="part" type="{uri:iso.org:21090}ADXP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useablePeriod" type="{uri:iso.org:21090}QSET_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{uri:iso.org:21090}set_PostalAddressUse" />
 *       &lt;attribute name="isNotOrdered" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AD", propOrder = {
    "part",
    "useablePeriod"
})
public class AD
    extends ANY
{

    protected List<ADXP> part;
    protected QSETTS useablePeriod;
    @XmlAttribute(name = "use")
    protected List<PostalAddressUse> use;
    @XmlAttribute(name = "isNotOrdered")
    protected Boolean isNotOrdered;

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
     * {@link ADXP }
     * 
     * 
     */
    public List<ADXP> getPart() {
        if (part == null) {
            part = new ArrayList<ADXP>();
        }
        return this.part;
    }

    /**
     * Gets the value of the useablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTS }
     *     
     */
    public QSETTS getUseablePeriod() {
        return useablePeriod;
    }

    /**
     * Sets the value of the useablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTS }
     *     
     */
    public void setUseablePeriod(QSETTS value) {
        this.useablePeriod = value;
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
     * {@link PostalAddressUse }
     * 
     * 
     */
    public List<PostalAddressUse> getUse() {
        if (use == null) {
            use = new ArrayList<PostalAddressUse>();
        }
        return this.use;
    }

    /**
     * Gets the value of the isNotOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotOrdered() {
        return isNotOrdered;
    }

    /**
     * Sets the value of the isNotOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotOrdered(Boolean value) {
        this.isNotOrdered = value;
    }

    public AD withPart(ADXP... values) {
        if (values!= null) {
            for (ADXP value: values) {
                getPart().add(value);
            }
        }
        return this;
    }

    public AD withPart(Collection<ADXP> values) {
        if (values!= null) {
            getPart().addAll(values);
        }
        return this;
    }

    public AD withUseablePeriod(QSETTS value) {
        setUseablePeriod(value);
        return this;
    }

    public AD withUse(PostalAddressUse... values) {
        if (values!= null) {
            for (PostalAddressUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    public AD withUse(Collection<PostalAddressUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    public AD withIsNotOrdered(Boolean value) {
        setIsNotOrdered(value);
        return this;
    }

    @Override
    public AD withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public AD withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public AD withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public AD withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public AD withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public AD withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public AD withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
