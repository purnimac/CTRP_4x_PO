
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_CD.CE.None complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_CD.CE.None">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_CD.CE.None" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_CD.CE.None", propOrder = {
    "item"
})
public class NPPDCDCENone
    extends ANY
{

    protected List<UVPCDCENone> item;

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
     * {@link UVPCDCENone }
     * 
     * 
     */
    public List<UVPCDCENone> getItem() {
        if (item == null) {
            item = new ArrayList<UVPCDCENone>();
        }
        return this.item;
    }

    public NPPDCDCENone withItem(UVPCDCENone... values) {
        if (values!= null) {
            for (UVPCDCENone value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDCDCENone withItem(Collection<UVPCDCENone> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDCDCENone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDCDCENone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDCDCENone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDCDCENone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDCDCENone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDCDCENone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDCDCENone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
