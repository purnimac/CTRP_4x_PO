
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_TS.DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_TS.DateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.DateTime">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_TS.DateTime" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_TS.DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_TS.DateTime", propOrder = {
    "first",
    "second"
})
public class QSPTSDateTime
    extends QSETTSDateTime
{

    protected QSETTSDateTime first;
    protected QSETTSDateTime second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateTime }
     *     
     */
    public QSETTSDateTime getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateTime }
     *     
     */
    public void setFirst(QSETTSDateTime value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSDateTime }
     *     
     */
    public QSETTSDateTime getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSDateTime }
     *     
     */
    public void setSecond(QSETTSDateTime value) {
        this.second = value;
    }

    public QSPTSDateTime withFirst(QSETTSDateTime value) {
        setFirst(value);
        return this;
    }

    public QSPTSDateTime withSecond(QSETTSDateTime value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPTSDateTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPTSDateTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPTSDateTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPTSDateTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPTSDateTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPTSDateTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPTSDateTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPTSDateTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}