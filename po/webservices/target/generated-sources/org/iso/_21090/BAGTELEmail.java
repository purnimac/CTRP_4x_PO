
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_TEL.Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_TEL.Email">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_TEL.Email">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}TEL.Email" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_TEL.Email", propOrder = {
    "item"
})
public class BAGTELEmail
    extends COLLTELEmail
{

    protected List<TELEmail> item;

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
     * {@link TELEmail }
     * 
     * 
     */
    public List<TELEmail> getItem() {
        if (item == null) {
            item = new ArrayList<TELEmail>();
        }
        return this.item;
    }

    public BAGTELEmail withItem(TELEmail... values) {
        if (values!= null) {
            for (TELEmail value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGTELEmail withItem(Collection<TELEmail> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGTELEmail withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGTELEmail withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGTELEmail withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGTELEmail withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGTELEmail withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGTELEmail withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGTELEmail withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
