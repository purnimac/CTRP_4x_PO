
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIST_TEL.Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIST_TEL.Person">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="item" type="{uri:iso.org:21090}TEL.Person" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LIST_TEL.Person", propOrder = {
    "item"
})
@XmlSeeAlso({
    HISTTELPerson.class
})
public class LISTTELPerson
    extends ANY
{

    protected List<TELPerson> item;

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
     * {@link TELPerson }
     * 
     * 
     */
    public List<TELPerson> getItem() {
        if (item == null) {
            item = new ArrayList<TELPerson>();
        }
        return this.item;
    }

    public LISTTELPerson withItem(TELPerson... values) {
        if (values!= null) {
            for (TELPerson value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    public LISTTELPerson withItem(Collection<TELPerson> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public LISTTELPerson withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public LISTTELPerson withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public LISTTELPerson withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public LISTTELPerson withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public LISTTELPerson withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public LISTTELPerson withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public LISTTELPerson withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}