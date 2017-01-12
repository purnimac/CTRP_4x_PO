
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_ED.Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_ED.Image">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_ED.Image" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_ED.Image", propOrder = {
    "item"
})
public class NPPDEDImage
    extends ANY
{

    protected List<UVPEDImage> item;

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
     * {@link UVPEDImage }
     * 
     * 
     */
    public List<UVPEDImage> getItem() {
        if (item == null) {
            item = new ArrayList<UVPEDImage>();
        }
        return this.item;
    }

    public NPPDEDImage withItem(UVPEDImage... values) {
        if (values!= null) {
            for (UVPEDImage value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDEDImage withItem(Collection<UVPEDImage> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDEDImage withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDEDImage withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDEDImage withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDEDImage withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDEDImage withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDEDImage withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDEDImage withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
