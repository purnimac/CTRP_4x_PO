
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BAG_CS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAG_CS">
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
@XmlType(name = "BAG_CS", propOrder = {
    "item"
})
public class BAGCS
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

    public BAGCS withItem(CS... values) {
        if (values!= null) {
            for (CS value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public BAGCS withItem(Collection<CS> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public BAGCS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public BAGCS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public BAGCS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public BAGCS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public BAGCS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public BAGCS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public BAGCS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
