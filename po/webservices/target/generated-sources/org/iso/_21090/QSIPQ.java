
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSI_PQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSI_PQ">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_PQ">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_PQ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSI_PQ", propOrder = {
    "term"
})
public class QSIPQ
    extends QSETPQ
{

    protected List<QSETPQ> term;

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
     * {@link QSETPQ }
     * 
     * 
     */
    public List<QSETPQ> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETPQ>();
        }
        return this.term;
    }

    public QSIPQ withTerm(QSETPQ... values) {
        if (values!= null) {
            for (QSETPQ value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSIPQ withTerm(Collection<QSETPQ> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSIPQ withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSIPQ withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSIPQ withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSIPQ withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSIPQ withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSIPQ withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSIPQ withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSIPQ withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}