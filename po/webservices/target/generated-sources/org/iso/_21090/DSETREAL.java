
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_REAL">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}REAL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_REAL", propOrder = {
    "item"
})
public class DSETREAL
    extends COLLREAL
{

    protected List<REAL> item;

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
     * {@link REAL }
     * 
     * 
     */
    public List<REAL> getItem() {
        if (item == null) {
            item = new ArrayList<REAL>();
        }
        return this.item;
    }

    public DSETREAL withItem(REAL... values) {
        if (values!= null) {
            for (REAL value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETREAL withItem(Collection<REAL> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETREAL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETREAL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETREAL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETREAL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETREAL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETREAL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETREAL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
