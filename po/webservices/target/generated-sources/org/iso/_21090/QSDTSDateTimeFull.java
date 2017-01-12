
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSD_TS.DateTime.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSD_TS.DateTime.Full">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.DateTime.Full">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_TS.DateTime.Full" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_TS.DateTime.Full" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSD_TS.DateTime.Full", propOrder = {
    "first",
    "second"
})
public class QSDTSDateTimeFull
    extends QSETTSDateTimeFull
{

    protected QSETTSDateTimeFull first;
    protected QSETTSDateTimeFull second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateTimeFull }
     *     
     */
    public QSETTSDateTimeFull getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateTimeFull }
     *     
     */
    public void setFirst(QSETTSDateTimeFull value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateTimeFull }
     *     
     */
    public QSETTSDateTimeFull getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateTimeFull }
     *     
     */
    public void setSecond(QSETTSDateTimeFull value) {
        this.second = value;
    }

    public QSDTSDateTimeFull withFirst(QSETTSDateTimeFull value) {
        setFirst(value);
        return this;
    }

    public QSDTSDateTimeFull withSecond(QSETTSDateTimeFull value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSDTSDateTimeFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
