
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_INT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_INT" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_INT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_INT", propOrder = {
    "first",
    "second"
})
public class QSPINT
    extends QSETINT
{

    protected QSETINT first;
    protected QSETINT second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETINT }
     *     
     */
    public QSETINT getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETINT }
     *     
     */
    public void setFirst(QSETINT value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETINT }
     *     
     */
    public QSETINT getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETINT }
     *     
     */
    public void setSecond(QSETINT value) {
        this.second = value;
    }

    public QSPINT withFirst(QSETINT value) {
        setFirst(value);
        return this;
    }

    public QSPINT withSecond(QSETINT value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPINT withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPINT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPINT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPINT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPINT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPINT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPINT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPINT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
