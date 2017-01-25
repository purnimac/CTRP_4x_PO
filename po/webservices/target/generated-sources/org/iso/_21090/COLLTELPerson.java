
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COLL_TEL.Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="COLL_TEL.Person">
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
@XmlType(name = "COLL_TEL.Person")
@XmlSeeAlso({
    DSETTELPerson.class,
    BAGTELPerson.class
})
public abstract class COLLTELPerson
    extends ANY
{


    @Override
    public COLLTELPerson withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public COLLTELPerson withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public COLLTELPerson withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public COLLTELPerson withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public COLLTELPerson withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public COLLTELPerson withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public COLLTELPerson withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}