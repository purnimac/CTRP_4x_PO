
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSD_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSD_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_PQ">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_PQ" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_PQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSD_PQ", propOrder = {
    "first",
    "second"
})
public class QSDPQ
    extends QSETPQ
{

    protected QSETPQ first;
    protected QSETPQ second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETPQ }
     *     
     */
    public QSETPQ getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETPQ }
     *     
     */
    public void setFirst(QSETPQ value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETPQ }
     *     
     */
    public QSETPQ getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETPQ }
     *     
     */
    public void setSecond(QSETPQ value) {
        this.second = value;
    }

    public QSDPQ withFirst(QSETPQ value) {
        setFirst(value);
        return this;
    }

    public QSDPQ withSecond(QSETPQ value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSDPQ withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSDPQ withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSDPQ withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSDPQ withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSDPQ withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSDPQ withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSDPQ withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSDPQ withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
