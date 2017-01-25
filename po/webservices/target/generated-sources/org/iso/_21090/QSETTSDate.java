
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSET_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSET_TS.Date">
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
@XmlType(name = "QSET_TS.Date", propOrder = {
    "originalText"
})
@XmlSeeAlso({
    QSSTSDate.class,
    EIVLTSDate.class,
    QSITSDate.class,
    QSUTSDate.class,
    QSPTSDate.class,
    QSDTSDate.class,
    IVLTSDate.class,
    PIVLTSDate.class
})
public abstract class QSETTSDate
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

    public QSETTSDate withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSETTSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSETTSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSETTSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSETTSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSETTSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSETTSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSETTSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}