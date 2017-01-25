
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.High_MO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.High_MO">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_MO">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}MO" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}MO" minOccurs="0"/>
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
@XmlType(name = "IVL.High_MO")
public class IVLHighMO
    extends IVLMO
{


    @Override
    public IVLHighMO withLow(MO value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLHighMO withHigh(MO value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLHighMO withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLHighMO withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLHighMO withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLHighMO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLHighMO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLHighMO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLHighMO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLHighMO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLHighMO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLHighMO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLHighMO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}