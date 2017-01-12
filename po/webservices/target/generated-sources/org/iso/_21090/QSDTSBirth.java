
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSD_TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSD_TS.Birth">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Birth">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_TS.Birth" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_TS.Birth" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSD_TS.Birth", propOrder = {
    "first",
    "second"
})
public class QSDTSBirth
    extends QSETTSBirth
{

    protected QSETTSBirth first;
    protected QSETTSBirth second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSBirth }
     *     
     */
    public QSETTSBirth getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSBirth }
     *     
     */
    public void setFirst(QSETTSBirth value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETTSBirth }
     *     
     */
    public QSETTSBirth getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETTSBirth }
     *     
     */
    public void setSecond(QSETTSBirth value) {
        this.second = value;
    }

    public QSDTSBirth withFirst(QSETTSBirth value) {
        setFirst(value);
        return this;
    }

    public QSDTSBirth withSecond(QSETTSBirth value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSDTSBirth withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSDTSBirth withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSDTSBirth withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSDTSBirth withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSDTSBirth withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSDTSBirth withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSDTSBirth withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSDTSBirth withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
