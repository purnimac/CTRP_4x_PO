
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_TS.DateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_TS.DateTime">
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
@XmlType(name = "QSU_TS.DateTime", propOrder = {
    "term"
})
public class QSUTSDateTime
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

    public QSUTSDateTime withTerm(QSETTSDateTime... values) {
        if (values!= null) {
            for (QSETTSDateTime value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSUTSDateTime withTerm(Collection<QSETTSDateTime> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSUTSDateTime withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSUTSDateTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSUTSDateTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSUTSDateTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSUTSDateTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSUTSDateTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSUTSDateTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSUTSDateTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
