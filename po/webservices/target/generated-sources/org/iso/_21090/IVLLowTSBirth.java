
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Low_TS.Birth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Low_TS.Birth">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_TS.Birth">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}TS.Birth" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}TS.Birth" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Low_TS.Birth")
public class IVLLowTSBirth
    extends IVLTSBirth
{


    @Override
    public IVLLowTSBirth withLow(TSBirth value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withHigh(TSBirth value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLLowTSBirth withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
