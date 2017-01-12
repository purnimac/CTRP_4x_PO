
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Low_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Low_PQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_PQ">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}PQ" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}PQ" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Low_PQ")
public class IVLLowPQ
    extends IVLPQ
{


    @Override
    public IVLLowPQ withLow(PQ value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLLowPQ withHigh(PQ value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLLowPQ withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLLowPQ withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLLowPQ withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLLowPQ withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLLowPQ withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLLowPQ withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLLowPQ withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLLowPQ withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLLowPQ withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLLowPQ withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLLowPQ withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
