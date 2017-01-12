
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_CO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_CO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_CO">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_CO" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_CO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_CO", propOrder = {
    "first",
    "second"
})
public class QSPCO
    extends QSETCO
{

    protected QSETCO first;
    protected QSETCO second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETCO }
     *     
     */
    public QSETCO getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETCO }
     *     
     */
    public void setFirst(QSETCO value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETCO }
     *     
     */
    public QSETCO getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETCO }
     *     
     */
    public void setSecond(QSETCO value) {
        this.second = value;
    }

    public QSPCO withFirst(QSETCO value) {
        setFirst(value);
        return this;
    }

    public QSPCO withSecond(QSETCO value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPCO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPCO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPCO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPCO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPCO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPCO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPCO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPCO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
