
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSI_TS.DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSI_TS.DateTime">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.DateTime">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_TS.DateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSI_TS.DateTime", propOrder = {
    "term"
})
public class QSITSDateTime
    extends QSETTSDateTime
{

    protected List<QSETTSDateTime> term;

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QSETTSDateTime }
     * 
     * 
     */
    public List<QSETTSDateTime> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETTSDateTime>();
        }
        return this.term;
    }

    public QSITSDateTime withTerm(QSETTSDateTime... values) {
        if (values!= null) {
            for (QSETTSDateTime value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSITSDateTime withTerm(Collection<QSETTSDateTime> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSITSDateTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSITSDateTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSITSDateTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSITSDateTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSITSDateTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSITSDateTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSITSDateTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSITSDateTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
