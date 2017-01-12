
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_EN.PN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_EN.PN">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_EN.PN">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}EN.PN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_EN.PN", propOrder = {
    "item"
})
public class BAGENPN
    extends COLLENPN
{

    protected List<ENPN> item;

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
     * {@link ENPN }
     * 
     * 
     */
    public List<ENPN> getItem() {
        if (item == null) {
            item = new ArrayList<ENPN>();
        }
        return this.item;
    }

    public BAGENPN withItem(ENPN... values) {
        if (values!= null) {
            for (ENPN value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGENPN withItem(Collection<ENPN> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGENPN withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGENPN withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGENPN withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGENPN withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGENPN withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGENPN withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGENPN withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
