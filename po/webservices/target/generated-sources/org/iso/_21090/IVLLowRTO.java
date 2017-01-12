
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IVL.Low_RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IVL.Low_RTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}IVL_RTO">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="low" type="{uri:iso.org:21090}RTO" minOccurs="0"/>
 *         &lt;element name="high" type="{uri:iso.org:21090}RTO" maxOccurs="0" minOccurs="0"/>
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
@XmlType(name = "IVL.Low_RTO")
public class IVLLowRTO
    extends IVLRTO
{


    @Override
    public IVLLowRTO withLow(RTO value) {
        setLow(value);
        return this;
    }

    @Override
    public IVLLowRTO withHigh(RTO value) {
        setHigh(value);
        return this;
    }

    @Override
    public IVLLowRTO withWidth(QTY value) {
        setWidth(value);
        return this;
    }

    @Override
    public IVLLowRTO withLowClosed(Boolean value) {
        setLowClosed(value);
        return this;
    }

    @Override
    public IVLLowRTO withHighClosed(Boolean value) {
        setHighClosed(value);
        return this;
    }

    @Override
    public IVLLowRTO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public IVLLowRTO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public IVLLowRTO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public IVLLowRTO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public IVLLowRTO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public IVLLowRTO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public IVLLowRTO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public IVLLowRTO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
