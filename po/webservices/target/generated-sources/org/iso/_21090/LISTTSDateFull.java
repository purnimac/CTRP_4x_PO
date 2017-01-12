
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_TS.Date.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TS.Date.Full">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}TS.Date.Full" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TS.Date.Full", propOrder = {
    "item"
})
@XmlSeeAlso({
    HISTTSDateFull.class
})
public class LISTTSDateFull
    extends ANY
{

    protected List<TSDateFull> item;

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
     * {@link TSDateFull }
     * 
     * 
     */
    public List<TSDateFull> getItem() {
        if (item == null) {
            item = new ArrayList<TSDateFull>();
        }
        return this.item;
    }

    public LISTTSDateFull withItem(TSDateFull... values) {
        if (values!= null) {
            for (TSDateFull value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public LISTTSDateFull withItem(Collection<TSDateFull> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public LISTTSDateFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public LISTTSDateFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public LISTTSDateFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public LISTTSDateFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public LISTTSDateFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public LISTTSDateFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public LISTTSDateFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
