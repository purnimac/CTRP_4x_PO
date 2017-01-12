
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_PQ">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}PQ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_PQ", propOrder = {
    "item"
})
public class BAGPQ
    extends COLLPQ
{

    protected List<PQ> item;

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
     * {@link PQ }
     * 
     * 
     */
    public List<PQ> getItem() {
        if (item == null) {
            item = new ArrayList<PQ>();
        }
        return this.item;
    }

    public BAGPQ withItem(PQ... values) {
        if (values!= null) {
            for (PQ value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGPQ withItem(Collection<PQ> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGPQ withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGPQ withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGPQ withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGPQ withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGPQ withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGPQ withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGPQ withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
