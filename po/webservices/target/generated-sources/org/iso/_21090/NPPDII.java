
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_II complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_II">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_II" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_II", propOrder = {
    "item"
})
public class NPPDII
    extends ANY
{

    protected List<UVPII> item;

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
     * {@link UVPII }
     * 
     * 
     */
    public List<UVPII> getItem() {
        if (item == null) {
            item = new ArrayList<UVPII>();
        }
        return this.item;
    }

    public NPPDII withItem(UVPII... values) {
        if (values!= null) {
            for (UVPII value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDII withItem(Collection<UVPII> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDII withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDII withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDII withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDII withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDII withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDII withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDII withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
