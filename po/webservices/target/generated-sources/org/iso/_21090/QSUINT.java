
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_INT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_INT">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_INT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSU_INT", propOrder = {
    "term"
})
public class QSUINT
    extends QSETINT
{

    protected List<QSETINT> term;

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
     * {@link QSETINT }
     * 
     * 
     */
    public List<QSETINT> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETINT>();
        }
        return this.term;
    }

    public QSUINT withTerm(QSETINT... values) {
        if (values!= null) {
            for (QSETINT value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSUINT withTerm(Collection<QSETINT> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSUINT withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSUINT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSUINT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSUINT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSUINT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSUINT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSUINT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSUINT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
