
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_ED.Doc.Ref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_ED.Doc.Ref">
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
@XmlType(name = "COLL_ED.Doc.Ref")
@XmlSeeAlso({
    BAGEDDocRef.class,
    DSETEDDocRef.class
})
public abstract class COLLEDDocRef
    extends ANY
{


    @Override
    public COLLEDDocRef withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLEDDocRef withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLEDDocRef withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLEDDocRef withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLEDDocRef withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLEDDocRef withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLEDDocRef withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
