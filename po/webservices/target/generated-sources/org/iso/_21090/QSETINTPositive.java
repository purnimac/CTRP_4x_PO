
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSET_INT.Positive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSET_INT.Positive">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSET_INT.Positive", propOrder = {
    "originalText"
})
@XmlSeeAlso({
    QSUINTPositive.class,
    QSIINTPositive.class,
    QSDINTPositive.class,
    QSPINTPositive.class,
    IVLINTPositive.class,
    QSSINTPositive.class
})
public abstract class QSETINTPositive
    extends ANY
{

    protected EDText originalText;

    /**
     * Gets the value of the originalText property.
     * 
     * @return
     *     possible object is
     *     {@link EDText }
     *     
     */
    public EDText getOriginalText() {
        return originalText;
    }

    /**
     * Sets the value of the originalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDText }
     *     
     */
    public void setOriginalText(EDText value) {
        this.originalText = value;
    }

    public QSETINTPositive withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSETINTPositive withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSETINTPositive withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSETINTPositive withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSETINTPositive withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSETINTPositive withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSETINTPositive withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSETINTPositive withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}