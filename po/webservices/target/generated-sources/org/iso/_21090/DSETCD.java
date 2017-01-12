
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_CD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_CD">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_CD">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}CD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_CD", propOrder = {
    "item"
})
public class DSETCD
    extends COLLCD
{

    protected List<CD> item;

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
     * {@link CD }
     * 
     * 
     */
    public List<CD> getItem() {
        if (item == null) {
            item = new ArrayList<CD>();
        }
        return this.item;
    }

    public DSETCD withItem(CD... values) {
        if (values!= null) {
            for (CD value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETCD withItem(Collection<CD> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETCD withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETCD withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETCD withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETCD withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETCD withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETCD withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETCD withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
