
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_ED.Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_ED.Image">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}ED.Image" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_ED.Image", propOrder = {
    "item"
})
@XmlSeeAlso({
    HISTEDImage.class
})
public class LISTEDImage
    extends ANY
{

    protected List<EDImage> item;

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
     * {@link EDImage }
     * 
     * 
     */
    public List<EDImage> getItem() {
        if (item == null) {
            item = new ArrayList<EDImage>();
        }
        return this.item;
    }

    public LISTEDImage withItem(EDImage... values) {
        if (values!= null) {
            for (EDImage value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public LISTEDImage withItem(Collection<EDImage> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public LISTEDImage withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public LISTEDImage withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public LISTEDImage withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public LISTEDImage withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public LISTEDImage withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public LISTEDImage withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public LISTEDImage withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}