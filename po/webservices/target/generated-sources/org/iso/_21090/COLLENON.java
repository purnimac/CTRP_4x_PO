
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_EN.ON complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_EN.ON">
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
@XmlType(name = "COLL_EN.ON")
@XmlSeeAlso({
    BAGENON.class,
    DSETENON.class
})
public abstract class COLLENON
    extends ANY
{


    @Override
    public COLLENON withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLENON withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLENON withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLENON withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLENON withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLENON withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLENON withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}