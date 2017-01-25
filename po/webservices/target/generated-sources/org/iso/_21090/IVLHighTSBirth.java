
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.High_TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.High_TS.Birth">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_TS.Birth">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}TS.Birth" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}TS.Birth" minOccurs="0"/>
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
@XmlType(name = "IVL.High_TS.Birth")
public class IVLHighTSBirth
    extends IVLTSBirth
{


    @Override
    public IVLHighTSBirth withLow(TSBirth value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withHigh(TSBirth value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLHighTSBirth withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}