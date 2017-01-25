
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.CD;
import org.iso._21090.DSETAD;
import org.iso._21090.DSETTEL;
import org.iso._21090.II;
import org.iso._21090.ST;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://po.coppa.nci.nih.gov}Correlation">
 *       &lt;sequence>
 *         &lt;element name="playerIdentifier" type="{uri:iso.org:21090}II"/>
 *         &lt;element name="scoperIdentifier" type="{uri:iso.org:21090}II"/>
 *         &lt;element name="postalAddress" type="{uri:iso.org:21090}DSET_AD"/>
 *         &lt;element name="telecomAddress" type="{uri:iso.org:21090}DSET_TEL"/>
 *         &lt;element name="status" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="typeCode" type="{uri:iso.org:21090}CD"/>
 *         &lt;element name="title" type="{uri:iso.org:21090}ST"/>
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
    "playerIdentifier",
    "scoperIdentifier",
    "postalAddress",
    "telecomAddress",
    "status",
    "typeCode",
    "title"
})
@XmlRootElement(name = "OrganizationalContact")
public class OrganizationalContact
    extends Correlation
{

    @XmlElement(required = true)
    protected II playerIdentifier;
    @XmlElement(required = true)
    protected II scoperIdentifier;
    @XmlElement(required = true)
    protected DSETAD postalAddress;
    @XmlElement(required = true)
    protected DSETTEL telecomAddress;
    @XmlElement(required = true)
    protected CD status;
    @XmlElement(required = true)
    protected CD typeCode;
    @XmlElement(required = true)
    protected ST title;

    /**
     * Gets the value of the playerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getPlayerIdentifier() {
        return playerIdentifier;
    }

    /**
     * Sets the value of the playerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setPlayerIdentifier(II value) {
        this.playerIdentifier = value;
    }

    /**
     * Gets the value of the scoperIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getScoperIdentifier() {
        return scoperIdentifier;
    }

    /**
     * Sets the value of the scoperIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setScoperIdentifier(II value) {
        this.scoperIdentifier = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link DSETAD }
     *     
     */
    public DSETAD getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSETAD }
     *     
     */
    public void setPostalAddress(DSETAD value) {
        this.postalAddress = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setStatus(CD value) {
        this.status = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CD }
     *     
     */
    public CD getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CD }
     *     
     */
    public void setTypeCode(CD value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link ST }
     *     
     */
    public ST getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link ST }
     *     
     */
    public void setTitle(ST value) {
        this.title = value;
    }

}