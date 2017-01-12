
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSET_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSET_INT">
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
@XmlType(name = "QSET_INT", propOrder = {
    "originalText"
})
@XmlSeeAlso({
    QSPINT.class,
    QSUINT.class,
    QSIINT.class,
    IVLINT.class,
    QSDINT.class,
    QSSINT.class
})
public abstract class QSETINT
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

    public QSETINT withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSETINT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSETINT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSETINT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSETINT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSETINT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSETINT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSETINT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
