
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Width_TS.Date.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Width_TS.Date.Full">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_TS.Date.Full">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}TS.Date.Full" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}TS.Date.Full" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Width_TS.Date.Full")
public class IVLWidthTSDateFull
    extends IVLTSDateFull
{


    @Override
    public IVLWidthTSDateFull withLow(TSDateFull value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withHigh(TSDateFull value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLWidthTSDateFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
