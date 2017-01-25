
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_AD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_AD">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_AD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_AD", propOrder = {
    "item"
})
public class NPPDAD
    extends ANY
{

    protected List<UVPAD> item;

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
     * {@link UVPAD }
     * 
     * 
     */
    public List<UVPAD> getItem() {
        if (item == null) {
            item = new ArrayList<UVPAD>();
        }
        return this.item;
    }

    public NPPDAD withItem(UVPAD... values) {
        if (values!= null) {
            for (UVPAD value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDAD withItem(Collection<UVPAD> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDAD withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDAD withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDAD withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDAD withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDAD withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDAD withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDAD withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}