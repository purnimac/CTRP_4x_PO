
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_TS.Date.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_TS.Date.Full">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Date.Full">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_TS.Date.Full" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_TS.Date.Full" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_TS.Date.Full", propOrder = {
    "first",
    "second"
})
public class QSPTSDateFull
    extends QSETTSDateFull
{

    protected QSETTSDateFull first;
    protected QSETTSDateFull second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateFull }
     *     
     */
    public QSETTSDateFull getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateFull }
     *     
     */
    public void setFirst(QSETTSDateFull value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateFull }
     *     
     */
    public QSETTSDateFull getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateFull }
     *     
     */
    public void setSecond(QSETTSDateFull value) {
        this.second = value;
    }

    public QSPTSDateFull withFirst(QSETTSDateFull value) {
        setFirst(value);
        return this;
    }

    public QSPTSDateFull withSecond(QSETTSDateFull value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPTSDateFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPTSDateFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPTSDateFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPTSDateFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPTSDateFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPTSDateFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPTSDateFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPTSDateFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
