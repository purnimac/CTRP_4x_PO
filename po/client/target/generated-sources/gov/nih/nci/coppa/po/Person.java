
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.AD;
import org.iso._21090.CD;
import org.iso._21090.DSETCD;
import org.iso._21090.DSETTEL;
import org.iso._21090.ENPN;
import org.iso._21090.TS;


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
 *         &lt;element name="name" type="{uri:iso.org:21090}EN.PN"/>
 *         &lt;element name="postalAddress" type="{uri:iso.org:21090}AD"/>
 *         &lt;element name="statusCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="telecomAddress" type="{uri:iso.org:21090}DSET_TEL"/>
 *         &lt;element name="raceCode" type="{uri:iso.org:21090}DSET_CD"/>
 *         &lt;element name="sexCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="ethnicGroupCode" type="{uri:iso.org:21090}DSET_CD"/>
 *         &lt;element name="birthDate" type="{uri:iso.org:21090}TS"/>
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
    "telecomAddress",
    "raceCode",
    "sexCode",
    "ethnicGroupCode",
    "birthDate"
})
@XmlRootElement(name = "Person")
public class Person
    extends Entity
{

    @XmlElement(required = true)
    protected ENPN name;
    @XmlElement(required = true)
    protected AD postalAddress;
    @XmlElement(required = true)
    protected CD statusCode;
    @XmlElement(required = true)
    protected DSETTEL telecomAddress;
    @XmlElement(required = true)
    protected DSETCD raceCode;
    @XmlElement(required = true)
    protected CD sexCode;
    @XmlElement(required = true)
    protected DSETCD ethnicGroupCode;
    @XmlElement(required = true)
    protected TS birthDate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ENPN }
     *     
     */
    public ENPN getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENPN }
     *     
     */
    public void setName(ENPN value) {
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

    /**
     * Gets the value of the raceCode property.
     * 
     * @return
     *     possible object is
     *     {@link DSETCD }
     *     
     */
    public DSETCD getRaceCode() {
        return raceCode;
    }

    /**
     * Sets the value of the raceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCD }
     *     
     */
    public void setRaceCode(DSETCD value) {
        this.raceCode = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setSexCode(CD value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the ethnicGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link DSETCD }
     *     
     */
    public DSETCD getEthnicGroupCode() {
        return ethnicGroupCode;
    }

    /**
     * Sets the value of the ethnicGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSETCD }
     *     
     */
    public void setEthnicGroupCode(DSETCD value) {
        this.ethnicGroupCode = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link TS }
     *     
     */
    public TS getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TS }
     *     
     */
    public void setBirthDate(TS value) {
        this.birthDate = value;
    }

}
