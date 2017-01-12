
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_CS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_CS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_CS">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}CS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_CS", propOrder = {
    "item"
})
public class DSETCS
    extends COLLCS
{

    protected List<CS> item;

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
     * {@link CS }
     * 
     * 
     */
    public List<CS> getItem() {
        if (item == null) {
            item = new ArrayList<CS>();
        }
        return this.item;
    }

    public DSETCS withItem(CS... values) {
        if (values!= null) {
            for (CS value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETCS withItem(Collection<CS> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETCS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETCS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETCS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETCS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETCS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETCS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETCS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
