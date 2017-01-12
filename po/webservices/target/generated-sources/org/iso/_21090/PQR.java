
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PQR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PQR">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}CD">
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PQR")
public class PQR
    extends CD
{

    @XmlAttribute(name = "value")
    protected Double value;
    @XmlAttribute(name = "precision")
    protected Integer precision;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    public PQR withValue(Double value) {
        setValue(value);
        return this;
    }

    public PQR withPrecision(Integer value) {
        setPrecision(value);
        return this;
    }

    @Override
    public PQR withDisplayName(ST value) {
        setDisplayName(value);
        return this;
    }

    @Override
    public PQR withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public PQR withQualifier(CR... values) {
        if (values!= null) {
            for (CR value: values) {
                getQualifier().add(value);
            }
        }
        return this;
    }

    @Override
    public PQR withQualifier(Collection<CR> values) {
        if (values!= null) {
            getQualifier().addAll(values);
        }
        return this;
    }

    @Override
    public PQR withGroup(CDGroup... values) {
        if (values!= null) {
            for (CDGroup value: values) {
                getGroup().add(value);
            }
        }
        return this;
    }

    @Override
    public PQR withGroup(Collection<CDGroup> values) {
        if (values!= null) {
            getGroup().addAll(values);
        }
        return this;
    }

    @Override
    public PQR withTranslation(CD... values) {
        if (values!= null) {
            for (CD value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public PQR withTranslation(Collection<CD> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public PQR withSource(XReference value) {
        setSource(value);
        return this;
    }

    @Override
    public PQR withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public PQR withCodeSystem(String value) {
        setCodeSystem(value);
        return this;
    }

    @Override
    public PQR withCodeSystemName(String value) {
        setCodeSystemName(value);
        return this;
    }

    @Override
    public PQR withCodeSystemVersion(String value) {
        setCodeSystemVersion(value);
        return this;
    }

    @Override
    public PQR withValueSet(String value) {
        setValueSet(value);
        return this;
    }

    @Override
    public PQR withValueSetVersion(String value) {
        setValueSetVersion(value);
        return this;
    }

    @Override
    public PQR withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public PQR withCodingRationale(CodingRationale... values) {
        if (values!= null) {
            for (CodingRationale value: values) {
                getCodingRationale().add(value);
            }
        }
        return this;
    }

    @Override
    public PQR withCodingRationale(Collection<CodingRationale> values) {
        if (values!= null) {
            getCodingRationale().addAll(values);
        }
        return this;
    }

    @Override
    public PQR withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public PQR withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public PQR withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public PQR withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public PQR withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public PQR withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public PQR withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
