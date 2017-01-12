
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_RTO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_RTO">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_RTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSU_RTO", propOrder = {
    "term"
})
public class QSURTO
    extends QSETRTO
{

    protected List<QSETRTO> term;

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
     * {@link QSETRTO }
     * 
     * 
     */
    public List<QSETRTO> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETRTO>();
        }
        return this.term;
    }

    public QSURTO withTerm(QSETRTO... values) {
        if (values!= null) {
            for (QSETRTO value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSURTO withTerm(Collection<QSETRTO> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSURTO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSURTO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSURTO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSURTO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSURTO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSURTO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSURTO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSURTO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
