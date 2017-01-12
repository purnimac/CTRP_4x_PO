
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Low_MO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Low_MO">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_MO">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}MO" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}MO" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Low_MO")
public class IVLLowMO
    extends IVLMO
{


    @Override
    public IVLLowMO withLow(MO value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLLowMO withHigh(MO value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLLowMO withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLLowMO withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLLowMO withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLLowMO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLLowMO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLLowMO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLLowMO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLLowMO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLLowMO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLLowMO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLLowMO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
