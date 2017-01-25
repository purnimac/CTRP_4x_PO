
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ED.Narrative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ED.Narrative">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ED.Narrative" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ED.Narrative", propOrder = {
    "item"
})
@XmlSeeAlso({
    HISTEDNarrative.class
})
public class LISTEDNarrative
    extends ANY
{

    protected List<EDNarrative> item;

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
     * {@link EDNarrative }
     * 
     * 
     */
    public List<EDNarrative> getItem() {
        if (item == null) {
            item = new ArrayList<EDNarrative>();
        }
        return this.item;
    }

    public LISTEDNarrative withItem(EDNarrative... values) {
        if (values!= null) {
            for (EDNarrative value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public LISTEDNarrative withItem(Collection<EDNarrative> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public LISTEDNarrative withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public LISTEDNarrative withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public LISTEDNarrative withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public LISTEDNarrative withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public LISTEDNarrative withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public LISTEDNarrative withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public LISTEDNarrative withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}