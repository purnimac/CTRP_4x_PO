
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_ED.Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_ED.Text">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_ED.Text">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ED.Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_ED.Text", propOrder = {
    "item"
})
public class DSETEDText
    extends COLLEDText
{

    protected List<EDText> item;

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
     * {@link EDText }
     * 
     * 
     */
    public List<EDText> getItem() {
        if (item == null) {
            item = new ArrayList<EDText>();
        }
        return this.item;
    }

    public DSETEDText withItem(EDText... values) {
        if (values!= null) {
            for (EDText value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETEDText withItem(Collection<EDText> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETEDText withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETEDText withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETEDText withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETEDText withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETEDText withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETEDText withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETEDText withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
