
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DSET_CD.CE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSET_CD.CE">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}COLL_CD.CE">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}CD.CE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSET_CD.CE", propOrder = {
    "item"
})
public class DSETCDCE
    extends COLLCDCE
{

    protected List<CDCE> item;

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
     * {@link CDCE }
     * 
     * 
     */
    public List<CDCE> getItem() {
        if (item == null) {
            item = new ArrayList<CDCE>();
        }
        return this.item;
    }

    public DSETCDCE withItem(CDCE... values) {
        if (values!= null) {
            for (CDCE value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public DSETCDCE withItem(Collection<CDCE> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public DSETCDCE withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public DSETCDCE withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public DSETCDCE withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public DSETCDCE withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public DSETCDCE withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public DSETCDCE withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public DSETCDCE withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}