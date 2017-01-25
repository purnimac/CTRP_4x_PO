
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL_INT.Positive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL_INT.Positive">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT.Positive">
 *       &lt;sequence>
 *         &lt;element name="low" type="{uri:iso.org:21090}INT.Positive" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}INT.Positive" minOccurs="0"/>
 *         &lt;element name="width" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lowClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="highClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL_INT.Positive", propOrder = {
    "low",
    "high",
    "width"
})
@XmlSeeAlso({
    IVLLowINTPositive.class,
    IVLWidthINTPositive.class,
    IVLHighINTPositive.class
})
public class IVLINTPositive
    extends QSETINTPositive
{

    protected INTPositive low;
    protected INTPositive high;
    protected QTY width;
    @XmlAttribute(name = "lowClosed")
    protected Boolean lowClosed;
    @XmlAttribute(name = "highClosed")
    protected Boolean highClosed;

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link INTPositive }
     *     
     */
    public INTPositive getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTPositive }
     *     
     */
    public void setLow(INTPositive value) {
        this.low = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link INTPositive }
     *     
     */
    public INTPositive getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link INTPositive }
     *     
     */
    public void setHigh(INTPositive value) {
        this.high = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setWidth(QTY value) {
        this.width = value;
    }

    /**
     * Gets the value of the lowClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowClosed() {
        return lowClosed;
    }

    /**
     * Sets the value of the lowClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowClosed(Boolean value) {
        this.lowClosed = value;
    }

    /**
     * Gets the value of the highClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighClosed() {
        return highClosed;
    }

    /**
     * Sets the value of the highClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighClosed(Boolean value) {
        this.highClosed = value;
    }

    public IVLINTPositive withLow(INTPositive value) {
        setLow(value);
        return this;
    }

    public IVLINTPositive withHigh(INTPositive value) {
        setHigh(value);
        return this;
    }

    public IVLINTPositive withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    public IVLINTPositive withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    public IVLINTPositive withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLINTPositive withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLINTPositive withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLINTPositive withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLINTPositive withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLINTPositive withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLINTPositive withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLINTPositive withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLINTPositive withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}