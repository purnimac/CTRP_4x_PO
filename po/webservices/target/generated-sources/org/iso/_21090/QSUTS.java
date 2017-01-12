
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_TS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_TS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_TS">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_TS" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSU_TS", propOrder = {
    "term"
})
public class QSUTS
    extends QSETTS
{

    protected List<QSETTS> term;

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
     * {@link QSETTS }
     * 
     * 
     */
    public List<QSETTS> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETTS>();
        }
        return this.term;
    }

    public QSUTS withTerm(QSETTS... values) {
        if (values!= null) {
            for (QSETTS value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSUTS withTerm(Collection<QSETTS> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSUTS withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSUTS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSUTS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSUTS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSUTS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSUTS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSUTS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSUTS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
