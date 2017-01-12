
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_CD.CE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_CD.CE">
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
@XmlType(name = "COLL_CD.CE")
@XmlSeeAlso({
    BAGCDCE.class,
    DSETCDCE.class
})
public abstract class COLLCDCE
    extends ANY
{


    @Override
    public COLLCDCE withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLCDCE withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLCDCE withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLCDCE withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLCDCE withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLCDCE withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLCDCE withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
