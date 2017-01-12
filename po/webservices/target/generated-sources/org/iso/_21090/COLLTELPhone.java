
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_TEL.Phone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_TEL.Phone">
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
@XmlType(name = "COLL_TEL.Phone")
@XmlSeeAlso({
    DSETTELPhone.class,
    BAGTELPhone.class
})
public abstract class COLLTELPhone
    extends ANY
{


    @Override
    public COLLTELPhone withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLTELPhone withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLTELPhone withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLTELPhone withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLTELPhone withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLTELPhone withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLTELPhone withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
