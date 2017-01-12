
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_EN.TN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_EN.TN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_EN.TN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_EN.TN", propOrder = {
    "item"
})
public class NPPDENTN
    extends ANY
{

    protected List<UVPENTN> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UVPENTN }
     * 
     * 
     */
    public List<UVPENTN> getItem() {
        if (item == null) {
            item = new ArrayList<UVPENTN>();
        }
        return this.item;
    }

    public NPPDENTN withItem(UVPENTN... values) {
        if (values!= null) {
            for (UVPENTN value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDENTN withItem(Collection<UVPENTN> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDENTN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDENTN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDENTN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDENTN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDENTN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDENTN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDENTN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
