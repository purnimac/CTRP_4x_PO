
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SLIST_TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SLIST_TS.Birth">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{uri:iso.org:21090}TS.Birth" minOccurs="0"/>
 *         &lt;element name="scale" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *         &lt;element name="digit" type="{uri:iso.org:21090}INT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLIST_TS.Birth", propOrder = {
    "origin",
    "scale",
    "digit"
})
public class SLISTTSBirth
    extends ANY
{

    protected TSBirth origin;
    protected QTY scale;
    protected List<INT> digit;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link TSBirth }
     *     
     */
    public TSBirth getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSBirth }
     *     
     */
    public void setOrigin(TSBirth value) {
        this.origin = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setScale(QTY value) {
        this.scale = value;
    }

    /**
     * Gets the value of the digit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link INT }
     * 
     * 
     */
    public List<INT> getDigit() {
        if (digit == null) {
            digit = new ArrayList<INT>();
        }
        return this.digit;
    }

    public SLISTTSBirth withOrigin(TSBirth value) {
        setOrigin(value);
        return this;
    }

    public SLISTTSBirth withScale(QTY value) {
        setScale(value);
        return this;
    }

    public SLISTTSBirth withDigit(INT... values) {
        if (values!= null) {
            for (INT value: values) {
                getDigit().add(value);
            }
        }
        return this;
    }

    public SLISTTSBirth withDigit(Collection<INT> values) {
        if (values!= null) {
            getDigit().addAll(values);
        }
        return this;
    }

    @Override
    public SLISTTSBirth withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public SLISTTSBirth withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public SLISTTSBirth withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public SLISTTSBirth withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public SLISTTSBirth withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public SLISTTSBirth withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public SLISTTSBirth withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}