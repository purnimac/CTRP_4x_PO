
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_SC.NT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_SC.NT">
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
@XmlType(name = "COLL_SC.NT")
@XmlSeeAlso({
    DSETSCNT.class,
    BAGSCNT.class
})
public abstract class COLLSCNT
    extends ANY
{


    @Override
    public COLLSCNT withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLSCNT withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLSCNT withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLSCNT withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLSCNT withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLSCNT withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLSCNT withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
