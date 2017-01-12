
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSD_INT.Positive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSD_INT.Positive">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT.Positive">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_INT.Positive" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_INT.Positive" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSD_INT.Positive", propOrder = {
    "first",
    "second"
})
public class QSDINTPositive
    extends QSETINTPositive
{

    protected QSETINTPositive first;
    protected QSETINTPositive second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETINTPositive }
     *     
     */
    public QSETINTPositive getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETINTPositive }
     *     
     */
    public void setFirst(QSETINTPositive value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETINTPositive }
     *     
     */
    public QSETINTPositive getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETINTPositive }
     *     
     */
    public void setSecond(QSETINTPositive value) {
        this.second = value;
    }

    public QSDINTPositive withFirst(QSETINTPositive value) {
        setFirst(value);
        return this;
    }

    public QSDINTPositive withSecond(QSETINTPositive value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSDINTPositive withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSDINTPositive withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSDINTPositive withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSDINTPositive withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSDINTPositive withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSDINTPositive withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSDINTPositive withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSDINTPositive withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
