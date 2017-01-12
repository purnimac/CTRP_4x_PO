
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_RTO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_RTO">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_RTO" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_RTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_RTO", propOrder = {
    "first",
    "second"
})
public class QSPRTO
    extends QSETRTO
{

    protected QSETRTO first;
    protected QSETRTO second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETRTO }
     *     
     */
    public QSETRTO getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETRTO }
     *     
     */
    public void setFirst(QSETRTO value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETRTO }
     *     
     */
    public QSETRTO getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETRTO }
     *     
     */
    public void setSecond(QSETRTO value) {
        this.second = value;
    }

    public QSPRTO withFirst(QSETRTO value) {
        setFirst(value);
        return this;
    }

    public QSPRTO withSecond(QSETRTO value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPRTO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPRTO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPRTO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPRTO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPRTO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPRTO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPRTO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPRTO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
