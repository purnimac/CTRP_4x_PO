
package org.iso._21090;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ST">
 *       &lt;sequence>
 *         &lt;element name="code" type="{uri:iso.org:21090}CD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC", propOrder = {
    "code"
})
@XmlSeeAlso({
    SCNT.class
})
public class SC
    extends ST
{

    protected CD code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setCode(CD value) {
        this.code = value;
    }

    public SC withCode(CD value) {
        setCode(value);
        return this;
    }

    @Override
    public SC withTranslation(ST... values) {
        if (values!= null) {
            for (ST value: values) {
                getTranslation().add(value);
            }
        }
        return this;
    }

    @Override
    public SC withTranslation(Collection<ST> values) {
        if (values!= null) {
            getTranslation().addAll(values);
        }
        return this;
    }

    @Override
    public SC withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SC withLanguage(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public SC withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public SC withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public SC withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public SC withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public SC withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public SC withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public SC withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}
