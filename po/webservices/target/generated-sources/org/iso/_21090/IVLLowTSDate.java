
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Low_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Low_TS.Date">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_TS.Date">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}TS.Date" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}TS.Date" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Low_TS.Date")
public class IVLLowTSDate
    extends IVLTSDate
{


    @Override
    public IVLLowTSDate withLow(TSDate value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLLowTSDate withHigh(TSDate value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLLowTSDate withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLLowTSDate withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLLowTSDate withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLLowTSDate withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLLowTSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLLowTSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLLowTSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLLowTSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLLowTSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLLowTSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLLowTSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
