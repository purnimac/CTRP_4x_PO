
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_TEL.Phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_TEL.Phone">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_TEL.Phone">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}TEL.Phone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_TEL.Phone", propOrder = {
    "item"
})
public class BAGTELPhone
    extends COLLTELPhone
{

    protected List<TELPhone> item;

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
     * {@link TELPhone }
     * 
     * 
     */
    public List<TELPhone> getItem() {
        if (item == null) {
            item = new ArrayList<TELPhone>();
        }
        return this.item;
    }

    public BAGTELPhone withItem(TELPhone... values) {
        if (values!= null) {
            for (TELPhone value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGTELPhone withItem(Collection<TELPhone> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGTELPhone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGTELPhone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGTELPhone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGTELPhone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGTELPhone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGTELPhone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGTELPhone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
