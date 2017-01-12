
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Width_INT.NonNeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Width_INT.NonNeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_INT.NonNeg">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}INT.NonNeg" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}INT.NonNeg" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="width" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL.Width_INT.NonNeg")
public class IVLWidthINTNonNeg
    extends IVLINTNonNeg
{


    @Override
    public IVLWidthINTNonNeg withLow(INTNonNeg value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withHigh(INTNonNeg value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLWidthINTNonNeg withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
