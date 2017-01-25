
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_TS.Date">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Date">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_TS.Date" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_TS.Date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_TS.Date", propOrder = {
    "first",
    "second"
})
public class QSPTSDate
    extends QSETTSDate
{

    protected QSETTSDate first;
    protected QSETTSDate second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDate }
     *     
     */
    public QSETTSDate getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDate }
     *     
     */
    public void setFirst(QSETTSDate value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDate }
     *     
     */
    public QSETTSDate getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDate }
     *     
     */
    public void setSecond(QSETTSDate value) {
        this.second = value;
    }

    public QSPTSDate withFirst(QSETTSDate value) {
        setFirst(value);
        return this;
    }

    public QSPTSDate withSecond(QSETTSDate value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPTSDate withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPTSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPTSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPTSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPTSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPTSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPTSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPTSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}