
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_II complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_II">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_II">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}II" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_II", propOrder = {
    "item"
})
public class BAGII
    extends COLLII
{

    protected List<II> item;

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
     * {@link II }
     * 
     * 
     */
    public List<II> getItem() {
        if (item == null) {
            item = new ArrayList<II>();
        }
        return this.item;
    }

    public BAGII withItem(II... values) {
        if (values!= null) {
            for (II value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGII withItem(Collection<II> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGII withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGII withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGII withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGII withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGII withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGII withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGII withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
