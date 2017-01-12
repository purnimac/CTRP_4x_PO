
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_INT.Positive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_INT.Positive">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COLL_INT.Positive")
@XmlSeeAlso({
    BAGINTPositive.class,
    DSETINTPositive.class
})
public abstract class COLLINTPositive
    extends ANY
{


    @Override
    public COLLINTPositive withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLINTPositive withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLINTPositive withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLINTPositive withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLINTPositive withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLINTPositive withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLINTPositive withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
