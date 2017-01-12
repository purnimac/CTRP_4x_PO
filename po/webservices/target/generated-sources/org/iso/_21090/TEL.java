
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
 * <p>Java class for TEL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}URL">
 *       &lt;sequence>
 *         &lt;element name="useablePeriod" type="{uri:iso.org:21090}QSET_TS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="use" type="{uri:iso.org:21090}set_TelecommunicationAddressUse" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEL", propOrder = {
    "useablePeriod"
})
@XmlSeeAlso({
    TELUrl.class,
    TELPerson.class
})
public class TEL
    extends URL
{

    protected QSETTS useablePeriod;
    @XmlAttribute(name = "use")
    protected List<TelecommunicationAddressUse> use;

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
     * {@link TelecommunicationAddressUse }
     * 
     * 
     */
    public List<TelecommunicationAddressUse> getUse() {
        if (use == null) {
            use = new ArrayList<TelecommunicationAddressUse>();
        }
        return this.use;
    }

    public TEL withUseablePeriod(QSETTS value) {
        setUseablePeriod(value);
        return this;
    }

    public TEL withUse(TelecommunicationAddressUse... values) {
        if (values!= null) {
            for (TelecommunicationAddressUse value: values) {
                getUse().add(value);
            }
        }
        return this;
    }

    public TEL withUse(Collection<TelecommunicationAddressUse> values) {
        if (values!= null) {
            getUse().addAll(values);
        }
        return this;
    }

    @Override
    public TEL withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public TEL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public TEL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public TEL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public TEL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public TEL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public TEL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public TEL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
