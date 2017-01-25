
package org.iso._21090;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QSU_INT.Positive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QSU_INT.Positive">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}QSET_INT.Positive">
 *       &lt;sequence>
 *         &lt;element name="term" type="{uri:iso.org:21090}QSET_INT.Positive" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QSU_INT.Positive", propOrder = {
    "term"
})
public class QSUINTPositive
    extends QSETINTPositive
{

    protected List<QSETINTPositive> term;

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
     * {@link QSETINTPositive }
     * 
     * 
     */
    public List<QSETINTPositive> getTerm() {
        if (term == null) {
            term = new ArrayList<QSETINTPositive>();
        }
        return this.term;
    }

    public QSUINTPositive withTerm(QSETINTPositive... values) {
        if (values!= null) {
            for (QSETINTPositive value: values) {
                getTerm().add(value);
            }
        }
        return this;
    }

    public QSUINTPositive withTerm(Collection<QSETINTPositive> values) {
        if (values!= null) {
            getTerm().addAll(values);
        }
        return this;
    }

    @Override
    public QSUINTPositive withOriginalText(EDText value) {
        setOriginalText(value);
        return this;
    }

    @Override
    public QSUINTPositive withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public QSUINTPositive withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public QSUINTPositive withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public QSUINTPositive withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public QSUINTPositive withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public QSUINTPositive withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public QSUINTPositive withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}