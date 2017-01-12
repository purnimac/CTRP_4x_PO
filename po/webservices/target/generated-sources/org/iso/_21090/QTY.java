
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QTY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QTY">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;sequence>
 *         &lt;element name="expression" type="{uri:iso.org:21090}ED" minOccurs="0"/>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="uncertainty" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="expressionLanguage" type="{uri:iso.org:21090}Code" />
 *       &lt;attribute name="uncertaintyType" type="{uri:iso.org:21090}UncertaintyType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QTY", propOrder = {
    "expression",
    "originalText",
    "uncertainty"
})
@XmlSeeAlso({
    CO.class,
    MO.class,
    REAL.class,
    TS.class,
    PQ.class,
    INT.class,
    RTO.class
})
public abstract class QTY
    extends ANY
{

    protected ED expression;
    protected EDText originalText;
    protected QTY uncertainty;
    @XmlAttribute(name = "expressionLanguage")
    protected String expressionLanguage;
    @XmlAttribute(name = "uncertaintyType")
    protected UncertaintyType uncertaintyType;

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link ED }
     *     
     */
    public ED getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED }
     *     
     */
    public void setExpression(ED value) {
        this.expression = value;
    }

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

    /**
     * Gets the value of the uncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link QTY }
     *     
     */
    public QTY getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QTY }
     *     
     */
    public void setUncertainty(QTY value) {
        this.uncertainty = value;
    }

    /**
     * Gets the value of the expressionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * Sets the value of the expressionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

    /**
     * Gets the value of the uncertaintyType property.
     * 
     * @return
     *     possible object is
     *     {@link UncertaintyType }
     *     
     */
    public UncertaintyType getUncertaintyType() {
        return uncertaintyType;
    }

    /**
     * Sets the value of the uncertaintyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertaintyType }
     *     
     */
    public void setUncertaintyType(UncertaintyType value) {
        this.uncertaintyType = value;
    }

    public QTY withExpression(ED value) {
        setExpression(value);
        return this;
    }

    public QTY withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    public QTY withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    public QTY withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    public QTY withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public QTY withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QTY withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QTY withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QTY withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QTY withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QTY withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QTY withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
