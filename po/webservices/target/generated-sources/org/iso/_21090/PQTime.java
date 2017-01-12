
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PQ.Time">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}PQ">
 *       &lt;sequence>
 *         &lt;element name="expression" type="{uri:iso.org:21090}ED" minOccurs="0"/>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="uncertainty" type="{uri:iso.org:21090}QTY" minOccurs="0"/>
 *         &lt;element name="translation" type="{uri:iso.org:21090}PQR" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PQ.Time")
public class PQTime
    extends PQ
{


    @Override
    public PQTime withTranslation(PQR... values) {
        if (values!= null) {
            for (PQR value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public PQTime withTranslation(Collection<PQR> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public PQTime withValue(Double value) {
        setValue(value);
        return this;
    }

    @Override
    public PQTime withPrecision(Integer value) {
        setPrecision(value);
        return this;
    }

    @Override
    public PQTime withUnit(String value) {
        setUnit(value);
        return this;
    }

    @Override
    public PQTime withCodingRationale(CodingRationale... values) {
        if (values!= null) {
            for (CodingRationale value: values) {
                getCodingRationale().add(value);
            }
        }
        return this;
    }

    @Override
    public PQTime withCodingRationale(Collection<CodingRationale> values) {
        if (values!= null) {
            getCodingRationale().addAll(values);
        }
        return this;
    }

    @Override
    public PQTime withExpression(ED value) {
        setExpression(value);
        return this;
    }

    @Override
    public PQTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public PQTime withUncertainty(QTY value) {
        setUncertainty(value);
        return this;
    }

    @Override
    public PQTime withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public PQTime withUncertaintyType(UncertaintyType value) {
        setUncertaintyType(value);
        return this;
    }

    @Override
    public PQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public PQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public PQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public PQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public PQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public PQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public PQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
