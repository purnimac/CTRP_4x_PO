
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_ST.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_ST.NT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_ST.NT">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ST.NT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BAG_ST.NT", propOrder = {
    "item"
})
public class BAGSTNT
    extends COLLSTNT
{

    protected List<STNT> item;

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
     * {@link STNT }
     * 
     * 
     */
    public List<STNT> getItem() {
        if (item == null) {
            item = new ArrayList<STNT>();
        }
        return this.item;
    }

    public BAGSTNT withItem(STNT... values) {
        if (values!= null) {
            for (STNT value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGSTNT withItem(Collection<STNT> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGSTNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGSTNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGSTNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGSTNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGSTNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGSTNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGSTNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
