
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSI_TS.DateTime.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSI_TS.DateTime.Full">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.DateTime.Full">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_TS.DateTime.Full" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSI_TS.DateTime.Full", propOrder = {
    "term"
})
public class QSITSDateTimeFull
    extends QSETTSDateTimeFull
{

    protected List<QSETTSDateTimeFull> term;

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
     * {@link QSETTSDateTimeFull }
     * 
     * 
     */
    public List<QSETTSDateTimeFull> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETTSDateTimeFull>();
        }
        return this.term;
    }

    public QSITSDateTimeFull withTerm(QSETTSDateTimeFull... values) {
        if (values!= null) {
            for (QSETTSDateTimeFull value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSITSDateTimeFull withTerm(Collection<QSETTSDateTimeFull> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSITSDateTimeFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSITSDateTimeFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
