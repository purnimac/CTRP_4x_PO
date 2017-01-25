
package org.iso._21090;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CS">
 *   &lt;complexContent>
 *     &lt;extension base="{uri:iso.org:21090}ANY">
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CS")
public class CS
    extends ANY
{

    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    public CS withCode(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CS withNullFlavor(NullFlavor value) {
        setNullFlavor(value);
        return this;
    }

    @Override
    public CS withFlavorId(String value) {
        setFlavorId(value);
        return this;
    }

    @Override
    public CS withUpdateMode(UpdateMode value) {
        setUpdateMode(value);
        return this;
    }

    @Override
    public CS withValidTimeLow(String value) {
        setValidTimeLow(value);
        return this;
    }

    @Override
    public CS withValidTimeHigh(String value) {
        setValidTimeHigh(value);
        return this;
    }

    @Override
    public CS withControlActRoot(String value) {
        setControlActRoot(value);
        return this;
    }

    @Override
    public CS withControlActExtension(String value) {
        setControlActExtension(value);
        return this;
    }

}