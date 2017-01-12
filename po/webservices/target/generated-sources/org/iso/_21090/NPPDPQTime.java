
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_PQ.Time">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_PQ.Time" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_PQ.Time", propOrder = {
    "item"
})
public class NPPDPQTime
    extends ANY
{

    protected List<UVPPQTime> item;

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
     * {@link UVPPQTime }
     * 
     * 
     */
    public List<UVPPQTime> getItem() {
        if (item == null) {
            item = new ArrayList<UVPPQTime>();
        }
        return this.item;
    }

    public NPPDPQTime withItem(UVPPQTime... values) {
        if (values!= null) {
            for (UVPPQTime value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDPQTime withItem(Collection<UVPPQTime> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDPQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDPQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDPQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDPQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDPQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDPQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDPQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
