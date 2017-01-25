
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_TEL.Phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_TEL.Phone">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_TEL.Phone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_TEL.Phone", propOrder = {
    "item"
})
public class NPPDTELPhone
    extends ANY
{

    protected List<UVPTELPhone> item;

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
     * {@link UVPTELPhone }
     * 
     * 
     */
    public List<UVPTELPhone> getItem() {
        if (item == null) {
            item = new ArrayList<UVPTELPhone>();
        }
        return this.item;
    }

    public NPPDTELPhone withItem(UVPTELPhone... values) {
        if (values!= null) {
            for (UVPTELPhone value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDTELPhone withItem(Collection<UVPTELPhone> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDTELPhone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDTELPhone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDTELPhone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDTELPhone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDTELPhone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDTELPhone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDTELPhone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}