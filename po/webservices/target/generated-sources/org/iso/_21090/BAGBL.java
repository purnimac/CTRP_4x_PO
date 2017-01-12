
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_BL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_BL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_BL">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}BL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_BL", propOrder = {
    "item"
})
public class BAGBL
    extends COLLBL
{

    protected List<BL> item;

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
     * {@link BL }
     * 
     * 
     */
    public List<BL> getItem() {
        if (item == null) {
            item = new ArrayList<BL>();
        }
        return this.item;
    }

    public BAGBL withItem(BL... values) {
        if (values!= null) {
            for (BL value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGBL withItem(Collection<BL> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGBL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGBL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGBL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGBL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGBL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGBL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGBL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
