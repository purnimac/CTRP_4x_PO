
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSP_PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSP_PQ.Time">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_PQ.Time">
 *       &lt;sequence>
 *         &lt;element name="first" type="{uri:iso.org:21090}QSET_PQ.Time" minOccurs="0"/>
 *         &lt;element name="second" type="{uri:iso.org:21090}QSET_PQ.Time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSP_PQ.Time", propOrder = {
    "first",
    "second"
})
public class QSPPQTime
    extends QSETPQTime
{

    protected QSETPQTime first;
    protected QSETPQTime second;

    /**
     * Gets the value of the first property.
     * 
     * @return
     *     possible object is
     *     {@link QSETPQTime }
     *     
     */
    public QSETPQTime getFirst() {
        return first;
    }

    /**
     * Sets the value of the first property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETPQTime }
     *     
     */
    public void setFirst(QSETPQTime value) {
        this.first = value;
    }

    /**
     * Gets the value of the second property.
     * 
     * @return
     *     possible object is
     *     {@link QSETPQTime }
     *     
     */
    public QSETPQTime getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     * @param value
     *     allowed object is
     *     {@link QSETPQTime }
     *     
     */
    public void setSecond(QSETPQTime value) {
        this.second = value;
    }

    public QSPPQTime withFirst(QSETPQTime value) {
        setFirst(value);
        return this;
    }

    public QSPPQTime withSecond(QSETPQTime value) {
        setSecond(value);
        return this;
    }

    @Override
    public QSPPQTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSPPQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSPPQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSPPQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSPPQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSPPQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSPPQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSPPQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
