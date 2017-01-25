
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_PQ.Time">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_PQ.Time">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}PQ.Time" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_PQ.Time", propOrder = {
    "item"
})
public class DSETPQTime
    extends COLLPQTime
{

    protected List<PQTime> item;

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
     * {@link PQTime }
     * 
     * 
     */
    public List<PQTime> getItem() {
        if (item == null) {
            item = new ArrayList<PQTime>();
        }
        return this.item;
    }

    public DSETPQTime withItem(PQTime... values) {
        if (values!= null) {
            for (PQTime value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETPQTime withItem(Collection<PQTime> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETPQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETPQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETPQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETPQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETPQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETPQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETPQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}