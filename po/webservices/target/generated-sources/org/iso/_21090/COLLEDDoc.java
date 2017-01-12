
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_ED.Doc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_ED.Doc">
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
@XmlType(name = "COLL_ED.Doc")
@XmlSeeAlso({
    DSETEDDoc.class,
    BAGEDDoc.class
})
public abstract class COLLEDDoc
    extends ANY
{


    @Override
    public COLLEDDoc withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLEDDoc withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLEDDoc withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLEDDoc withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLEDDoc withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLEDDoc withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLEDDoc withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
