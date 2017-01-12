
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QTY">
 *       &lt;sequence>
 *         &lt;element name="translation" type="{uri:iso.org:21090}PQR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="unit" type="{uri:iso.org:21090}Code" />
 *       &lt;attribute name="codingRationale" type="{uri:iso.org:21090}set_CodingRationale" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PQ", propOrder = {
    "translation"
})
@XmlSeeAlso({
    PQTime.class
})
public class PQ
    extends QTY
{

    protected List<PQR> translation;
    @XmlAttribute(name = "value")
    protected Double value;
    @XmlAttribute(name = "precision")
    protected Integer precision;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "codingRationale")
    protected List<CodingRationale> codingRationale;

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PQR }
     * 
     * 
     */
    public List<PQR> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<PQR>();
        }
        return this.translation;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the codingRationale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codingRationale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodingRationale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodingRationale }
     * 
     * 
     */
    public List<CodingRationale> getCodingRationale() {
        if (codingRationale == null) {
            codingRationale = new ArrayList<CodingRationale>();
        }
        return this.codingRationale;
    }

    public PQ withTranslation(PQR... values) {
        if (values!= null) {
            for (PQR value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    public PQ withTranslation(Collection<PQR> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    public PQ withValue(Double value) {
        setValue(value);
        return this;
    }

    public PQ withPrecision(Integer value) {
        setPrecision(value);
        return this;
    }

    public PQ withUnit(String value) {
        setUnit(value);
        return this;
    }

    public PQ withCodingRationale(CodingRationale... values) {
        if (values!= null) {
            for (CodingRationale value: values) {
                getCodingRationale().add(value);
            }
        }
        return this;
    }

    public PQ withCodingRationale(Collection<CodingRationale> values) {
        if (values!= null) {
            getCodingRationale().addAll(values);
        }
        return this;
    }

    @Override
    public PQ withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public PQ withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public PQ withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public PQ withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public PQ withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public PQ withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public PQ withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public PQ withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public PQ withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public PQ withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public PQ withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public PQ withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
