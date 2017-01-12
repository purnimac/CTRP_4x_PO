
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_ED.Doc.Ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_ED.Doc.Ref">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_ED.Doc.Ref">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ED.Doc.Ref" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_ED.Doc.Ref", propOrder = {
    "item"
})
public class BAGEDDocRef
    extends COLLEDDocRef
{

    protected List<EDDocRef> item;

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
     * {@link EDDocRef }
     * 
     * 
     */
    public List<EDDocRef> getItem() {
        if (item == null) {
            item = new ArrayList<EDDocRef>();
        }
        return this.item;
    }

    public BAGEDDocRef withItem(EDDocRef... values) {
        if (values!= null) {
            for (EDDocRef value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGEDDocRef withItem(Collection<EDDocRef> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGEDDocRef withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGEDDocRef withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGEDDocRef withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGEDDocRef withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGEDDocRef withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGEDDocRef withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGEDDocRef withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
