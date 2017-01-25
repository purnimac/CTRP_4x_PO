
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Width_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Width_REAL">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_REAL">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}REAL" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}REAL" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Width_REAL")
public class IVLWidthREAL
    extends IVLREAL
{


    @Override
    public IVLWidthREAL withLow(REAL value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLWidthREAL withHigh(REAL value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLWidthREAL withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLWidthREAL withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLWidthREAL withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLWidthREAL withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLWidthREAL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLWidthREAL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLWidthREAL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLWidthREAL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLWidthREAL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLWidthREAL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLWidthREAL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}