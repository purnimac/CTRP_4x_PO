
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_PQ.Time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_PQ.Time">
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
@XmlType(name = "COLL_PQ.Time")
@XmlSeeAlso({
    DSETPQTime.class,
    BAGPQTime.class
})
public abstract class COLLPQTime
    extends ANY
{


    @Override
    public COLLPQTime withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLPQTime withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLPQTime withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLPQTime withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLPQTime withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLPQTime withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLPQTime withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}