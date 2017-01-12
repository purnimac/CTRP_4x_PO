
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSS_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSS_REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_REAL">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}REAL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSS_REAL", propOrder = {
    "term"
})
public class QSSREAL
    extends QSETREAL
{

    protected List<REAL> term;

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
     * {@link REAL }
     * 
     * 
     */
    public List<REAL> getTerm() {
        if (term == null) {
            term = new ArrayList<REAL>();
        }
        return this.term;
    }

    public QSSREAL withTerm(REAL... values) {
        if (values!= null) {
            for (REAL value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSSREAL withTerm(Collection<REAL> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSSREAL withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSSREAL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSSREAL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSSREAL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSSREAL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSSREAL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSSREAL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSSREAL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
