
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_CD.CE.None complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_CD.CE.None">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_CD.CE.None">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}CD.CE.None" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_CD.CE.None", propOrder = {
    "item"
})
public class DSETCDCENone
    extends COLLCDCENone
{

    protected List<CDCENone> item;

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
     * {@link CDCENone }
     * 
     * 
     */
    public List<CDCENone> getItem() {
        if (item == null) {
            item = new ArrayList<CDCENone>();
        }
        return this.item;
    }

    public DSETCDCENone withItem(CDCENone... values) {
        if (values!= null) {
            for (CDCENone value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETCDCENone withItem(Collection<CDCENone> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETCDCENone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETCDCENone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETCDCENone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETCDCENone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETCDCENone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETCDCENone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETCDCENone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}