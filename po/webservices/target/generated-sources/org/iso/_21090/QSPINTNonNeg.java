
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_INT.NonNeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_INT.NonNeg">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT.NonNeg">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_INT.NonNeg" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_INT.NonNeg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_INT.NonNeg", propOrder = {
    "first",
    "second"
})
public class QSPINTNonNeg
    extends QSETINTNonNeg
{

    protected QSETINTNonNeg first;
    protected QSETINTNonNeg second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETINTNonNeg }
     *     
     */
    public QSETINTNonNeg getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETINTNonNeg }
     *     
     */
    public void setFirst(QSETINTNonNeg value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETINTNonNeg }
     *     
     */
    public QSETINTNonNeg getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETINTNonNeg }
     *     
     */
    public void setSecond(QSETINTNonNeg value) {
        this.second = value;
    }

    public QSPINTNonNeg withFirst(QSETINTNonNeg value) {
        setFirst(value);
        return this;
    }

    public QSPINTNonNeg withSecond(QSETINTNonNeg value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPINTNonNeg withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
