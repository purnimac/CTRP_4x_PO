
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_ED.Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_ED.Image">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_ED.Image">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ED.Image" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_ED.Image", propOrder = {
    "item"
})
public class BAGEDImage
    extends COLLEDImage
{

    protected List<EDImage> item;

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
     * {@link EDImage }
     * 
     * 
     */
    public List<EDImage> getItem() {
        if (item == null) {
            item = new ArrayList<EDImage>();
        }
        return this.item;
    }

    public BAGEDImage withItem(EDImage... values) {
        if (values!= null) {
            for (EDImage value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGEDImage withItem(Collection<EDImage> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGEDImage withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGEDImage withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGEDImage withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGEDImage withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGEDImage withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGEDImage withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGEDImage withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
