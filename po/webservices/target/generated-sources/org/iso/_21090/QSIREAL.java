
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSI_REAL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSI_REAL">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_REAL">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_REAL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSI_REAL", propOrder = {
    "term"
})
public class QSIREAL
    extends QSETREAL
{

    protected List<QSETREAL> term;

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
     * {@link QSETREAL }
     * 
     * 
     */
    public List<QSETREAL> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETREAL>();
        }
        return this.term;
    }

    public QSIREAL withTerm(QSETREAL... values) {
        if (values!= null) {
            for (QSETREAL value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSIREAL withTerm(Collection<QSETREAL> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSIREAL withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSIREAL withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSIREAL withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSIREAL withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSIREAL withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSIREAL withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSIREAL withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSIREAL withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
