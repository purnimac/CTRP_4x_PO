
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GLIST_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLIST_TS.Date">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="head" type="{uri:iso.org:21090}TS.Date" minOccurs="0"/>
 *         &lt;element name="increment" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="denominator" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLIST_TS.Date", propOrder = {
    "head",
    "increment"
})
public class GLISTTSDate
    extends ANY
{

    protected TSDate head;
    protected QTY increment;
    @XmlAttribute(name = "denominator")
    protected Integer denominator;
    @XmlAttribute(name = "period")
    protected Integer period;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link TSDate }
     *     
     */
    public TSDate getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSDate }
     *     
     */
    public void setHead(TSDate value) {
        this.head = value;
    }

    /**
     * Gets the value of the increment property.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getIncrement() {
        return increment;
    }

    /**
     * Sets the value of the increment property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setIncrement(QTY value) {
        this.increment = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDenominator(Integer value) {
        this.denominator = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    public GLISTTSDate withHead(TSDate value) {
        setHead(value);
        return this;
    }

    public GLISTTSDate withIncrement(QTY value) {
        setIncrement(value);
        return this;
    }

    public GLISTTSDate withDenominator(Integer value) {
        setDenominator(value);
        return this;
    }

    public GLISTTSDate withPeriod(Integer value) {
        setPeriod(value);
        return this;
    }

    @Override
    public GLISTTSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public GLISTTSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public GLISTTSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public GLISTTSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public GLISTTSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public GLISTTSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public GLISTTSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
