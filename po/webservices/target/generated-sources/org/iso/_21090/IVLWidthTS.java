
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Width_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Width_TS">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_TS">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}TS" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}TS" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Width_TS")
public class IVLWidthTS
    extends IVLTS
{


    @Override
    public IVLWidthTS withLow(TS value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLWidthTS withHigh(TS value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLWidthTS withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLWidthTS withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLWidthTS withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLWidthTS withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLWidthTS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLWidthTS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLWidthTS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLWidthTS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLWidthTS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLWidthTS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLWidthTS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
