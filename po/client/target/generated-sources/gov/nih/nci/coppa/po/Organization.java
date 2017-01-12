
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.AD;
import org.iso._21090.CD;
import org.iso._21090.DSETTEL;
import org.iso._21090.ENON;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://po.coppa.nci.nih.gov}Entity">
 *       &lt;sequence>
 *         &lt;element name="name" type="{uri:iso.org:21090}EN.ON"/>
 *         &lt;element name="postalAddress" type="{uri:iso.org:21090}AD"/>
 *         &lt;element name="statusCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="telecomAddress" type="{uri:iso.org:21090}DSET_TEL"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "postalAddress",
    "statusCode",
    "telecomAddress"
})
@XmlRootElement(name = "Organization")
public class Organization
    extends Entity
{

    @XmlElement(required = true)
    protected ENON name;
    @XmlElement(required = true)
    protected AD postalAddress;
    @XmlElement(required = true)
    protected CD statusCode;
    @XmlElement(required = true)
    protected DSETTEL telecomAddress;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ENON }
     *     
     */
    public ENON getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENON }
     *     
     */
    public void setName(ENON value) {
        this.name = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AD }
     *     
     */
    public AD getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AD }
     *     
     */
    public void setPostalAddress(AD value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setStatusCode(CD value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the telecomAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DSETTEL }
     *     
     */
    public DSETTEL getTelecomAddress() {
        return telecomAddress;
    }

    /**
     * Sets the value of the telecomAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSETTEL }
     *     
     */
    public void setTelecomAddress(DSETTEL value) {
        this.telecomAddress = value;
    }

}
