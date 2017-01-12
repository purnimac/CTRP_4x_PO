
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSS_TS.Date.Full complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSS_TS.Date.Full">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS.Date.Full">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}TS.Date.Full" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSS_TS.Date.Full", propOrder = {
    "term"
})
public class QSSTSDateFull
    extends QSETTSDateFull
{

    protected List<TSDateFull> term;

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
     * {@link TSDateFull }
     * 
     * 
     */
    public List<TSDateFull> getTerm() {
        if (term == null) {
            term = new ArrayList<TSDateFull>();
        }
        return this.term;
    }

    public QSSTSDateFull withTerm(TSDateFull... values) {
        if (values!= null) {
            for (TSDateFull value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSSTSDateFull withTerm(Collection<TSDateFull> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSSTSDateFull withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSSTSDateFull withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSSTSDateFull withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSSTSDateFull withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSSTSDateFull withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSSTSDateFull withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSSTSDateFull withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSSTSDateFull withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
