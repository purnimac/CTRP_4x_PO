
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSD_RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSD_RTO">
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
@XmlType(name = "QSD_RTO", propOrder = {
    "first",
    "second"
})
public class QSDRTO
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

    public QSDRTO withFirst(QSETRTO value) {
        setFirst(value);
        return this;
    }

    public QSDRTO withSecond(QSETRTO value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSDRTO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSDRTO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSDRTO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSDRTO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSDRTO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSDRTO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSDRTO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSDRTO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}