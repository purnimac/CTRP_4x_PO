
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.High_PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.High_PQ.Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_PQ.Time">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}PQ.Time" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}PQ.Time" minOccurs="0"/>
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
@XmlType(name = "IVL.High_PQ.Time")
public class IVLHighPQTime
    extends IVLPQTime
{


    @Override
    public IVLHighPQTime withLow(PQTime value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLHighPQTime withHigh(PQTime value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLHighPQTime withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLHighPQTime withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLHighPQTime withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLHighPQTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLHighPQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLHighPQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLHighPQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLHighPQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLHighPQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLHighPQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLHighPQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
