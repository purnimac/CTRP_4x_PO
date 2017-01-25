
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_SC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_SC">
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
@XmlType(name = "COLL_SC")
@XmlSeeAlso({
    BAGSC.class,
    DSETSC.class
})
public abstract class COLLSC
    extends ANY
{


    @Override
    public COLLSC withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLSC withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLSC withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLSC withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLSC withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLSC withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLSC withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}