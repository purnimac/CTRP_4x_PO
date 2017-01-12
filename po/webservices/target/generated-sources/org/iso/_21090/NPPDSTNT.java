
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPPD_ST.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPPD_ST.NT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}UVP_ST.NT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPPD_ST.NT", propOrder = {
    "item"
})
public class NPPDSTNT
    extends ANY
{

    protected List<UVPSTNT> item;

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
     * {@link UVPSTNT }
     * 
     * 
     */
    public List<UVPSTNT> getItem() {
        if (item == null) {
            item = new ArrayList<UVPSTNT>();
        }
        return this.item;
    }

    public NPPDSTNT withItem(UVPSTNT... values) {
        if (values!= null) {
            for (UVPSTNT value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public NPPDSTNT withItem(Collection<UVPSTNT> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public NPPDSTNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public NPPDSTNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public NPPDSTNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public NPPDSTNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public NPPDSTNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public NPPDSTNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public NPPDSTNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
