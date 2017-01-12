
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.iso21090.extensions.St;


/**
 * <p>Java class for ST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ST">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="translation" type="{uri:iso.org:21090}ST" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="language" type="{uri:iso.org:21090}Code" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST", propOrder = {
    "translation"
})
@XmlSeeAlso({
    STNT.class,
    SC.class,
    St.class
})
public class ST
    extends ANY
{

    protected List<ST> translation;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "language")
    protected String language;

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ST }
     * 
     * 
     */
    public List<ST> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<ST>();
        }
        return this.translation;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public ST withTranslation(ST... values) {
        if (values!= null) {
            for (ST value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    public ST withTranslation(Collection<ST> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    public ST withValue(String value) {
        setValue(value);
        return this;
    }

    public ST withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public ST withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public ST withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public ST withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public ST withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public ST withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public ST withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public ST withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
