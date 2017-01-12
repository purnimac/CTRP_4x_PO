
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_BL.NonNull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_BL.NonNull">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_BL.NonNull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_BL.NonNull", propOrder = {
    "item"
})
public class NPPDBLNonNull
    extends ANY
{

    protected List<UVPBLNonNull> item;

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
     * {@link UVPBLNonNull }
     * 
     * 
     */
    public List<UVPBLNonNull> getItem() {
        if (item == null) {
            item = new ArrayList<UVPBLNonNull>();
        }
        return this.item;
    }

    public NPPDBLNonNull withItem(UVPBLNonNull... values) {
        if (values!= null) {
            for (UVPBLNonNull value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDBLNonNull withItem(Collection<UVPBLNonNull> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDBLNonNull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDBLNonNull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDBLNonNull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDBLNonNull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDBLNonNull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDBLNonNull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDBLNonNull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
