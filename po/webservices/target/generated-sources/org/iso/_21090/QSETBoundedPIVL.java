
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSET.BoundedPIVL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSET.BoundedPIVL">
 *   &lt;complexContent>
 *     &lt;restriction base="{uri:iso.org:21090}QSI_TS">
 *       &lt;sequence>
 *         &lt;element name="originalText" type="{uri:iso.org:21090}ED.Text" minOccurs="0"/>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_TS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSET.BoundedPIVL")
public class QSETBoundedPIVL
    extends QSITS
{


    @Override
    public QSETBoundedPIVL withTerm(QSETTS... values) {
        if (values!= null) {
            for (QSETTS value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    @Override
    public QSETBoundedPIVL withTerm(Collection<QSETTS> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSETBoundedPIVL withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSETBoundedPIVL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
