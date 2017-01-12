
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_ED.Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_ED.Signature">
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
@XmlType(name = "COLL_ED.Signature")
@XmlSeeAlso({
    DSETEDSignature.class,
    BAGEDSignature.class
})
public abstract class COLLEDSignature
    extends ANY
{


    @Override
    public COLLEDSignature withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLEDSignature withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLEDSignature withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLEDSignature withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLEDSignature withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLEDSignature withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLEDSignature withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
