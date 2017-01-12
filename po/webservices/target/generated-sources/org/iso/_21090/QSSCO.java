
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSS_CO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSS_CO">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_CO">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}CO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSS_CO", propOrder = {
    "term"
})
public class QSSCO
    extends QSETCO
{

    protected List<CO> term;

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
     * {@link CO }
     * 
     * 
     */
    public List<CO> getTerm() {
        if (term == null) {
            term = new ArrayList<CO>();
        }
        return this.term;
    }

    public QSSCO withTerm(CO... values) {
        if (values!= null) {
            for (CO value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSSCO withTerm(Collection<CO> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSSCO withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSSCO withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSSCO withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSSCO withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSSCO withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSSCO withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSSCO withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSSCO withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
