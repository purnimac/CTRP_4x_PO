
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_ED.Doc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_ED.Doc">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_ED.Doc">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ED.Doc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_ED.Doc", propOrder = {
    "item"
})
public class BAGEDDoc
    extends COLLEDDoc
{

    protected List<EDDoc> item;

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
     * {@link EDDoc }
     * 
     * 
     */
    public List<EDDoc> getItem() {
        if (item == null) {
            item = new ArrayList<EDDoc>();
        }
        return this.item;
    }

    public BAGEDDoc withItem(EDDoc... values) {
        if (values!= null) {
            for (EDDoc value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGEDDoc withItem(Collection<EDDoc> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGEDDoc withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGEDDoc withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGEDDoc withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGEDDoc withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGEDDoc withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGEDDoc withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGEDDoc withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
