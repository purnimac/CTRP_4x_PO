
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_TS.Date complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_TS.Date">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Date">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_TS.Date" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSU_TS.Date", propOrder = {
    "term"
})
public class QSUTSDate
    extends QSETTSDate
{

    protected List<QSETTSDate> term;

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
     * {@link QSETTSDate }
     * 
     * 
     */
    public List<QSETTSDate> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETTSDate>();
        }
        return this.term;
    }

    public QSUTSDate withTerm(QSETTSDate... values) {
        if (values!= null) {
            for (QSETTSDate value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSUTSDate withTerm(Collection<QSETTSDate> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSUTSDate withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSUTSDate withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSUTSDate withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSUTSDate withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSUTSDate withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSUTSDate withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSUTSDate withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSUTSDate withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
