
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSS_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSS_INT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}INT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSS_INT", propOrder = {
    "term"
})
public class QSSINT
    extends QSETINT
{

    protected List<INT> term;

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
     * {@link INT }
     * 
     * 
     */
    public List<INT> getTerm() {
        if (term == null) {
            term = new ArrayList<INT>();
        }
        return this.term;
    }

    public QSSINT withTerm(INT... values) {
        if (values!= null) {
            for (INT value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSSINT withTerm(Collection<INT> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSSINT withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSSINT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSSINT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSSINT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSSINT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSSINT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSSINT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSSINT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
