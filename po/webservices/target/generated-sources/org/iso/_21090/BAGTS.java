
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_TS">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}TS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_TS", propOrder = {
    "item"
})
public class BAGTS
    extends COLLTS
{

    protected List<TS> item;

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
     * {@link TS }
     * 
     * 
     */
    public List<TS> getItem() {
        if (item == null) {
            item = new ArrayList<TS>();
        }
        return this.item;
    }

    public BAGTS withItem(TS... values) {
        if (values!= null) {
            for (TS value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGTS withItem(Collection<TS> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGTS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGTS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGTS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGTS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGTS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGTS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGTS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
