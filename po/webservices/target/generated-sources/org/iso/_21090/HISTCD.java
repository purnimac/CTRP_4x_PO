
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HIST_CD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIST_CD">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}LIST_CD">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIST_CD")
public class HISTCD
    extends LISTCD
{


    @Override
    public HISTCD withItem(CD... values) {
        if (values!= null) {
            for (CD value: values) {
                getItem().add(value);
            }
        }
        return this;
    }

    @Override
    public HISTCD withItem(Collection<CD> values) {
        if (values!= null) {
            getItem().addAll(values);
        }
        return this;
    }

    @Override
    public HISTCD withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public HISTCD withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public HISTCD withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public HISTCD withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public HISTCD withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public HISTCD withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public HISTCD withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
