
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_INT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_INT">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}INT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_INT", propOrder = {
    "item"
})
public class BAGINT
    extends COLLINT
{

    protected List<INT> item;

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
     * {@link INT }
     * 
     * 
     */
    public List<INT> getItem() {
        if (item == null) {
            item = new ArrayList<INT>();
        }
        return this.item;
    }

    public BAGINT withItem(INT... values) {
        if (values!= null) {
            for (INT value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGINT withItem(Collection<INT> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGINT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGINT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGINT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGINT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGINT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGINT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGINT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
