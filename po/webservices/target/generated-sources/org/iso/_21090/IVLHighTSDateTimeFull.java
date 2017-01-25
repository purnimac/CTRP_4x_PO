
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.High_TS.DateTime.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.High_TS.DateTime.Full">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_TS.DateTime.Full">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}TS.DateTime.Full" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}TS.DateTime.Full" minOccurs="0"/>
 *         &lt;element name="width" type="{uri:iso.org:21090}QTY" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IVL.High_TS.DateTime.Full")
public class IVLHighTSDateTimeFull
    extends IVLTSDateTimeFull
{


    @Override
    public IVLHighTSDateTimeFull withLow(TSDateTimeFull value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withHigh(TSDateTimeFull value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLHighTSDateTimeFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}