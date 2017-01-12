
package gov.nih.nci.coppa.po;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iso._21090.CD;
import org.iso._21090.DSETII;
import org.iso._21090.II;


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
 *         &lt;element name="assignedId" type="{uri:iso.org:21090}II"/>
 *         &lt;element name="status" type="{uri:iso.org:21090}CD"/>
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
    "assignedId",
    "status"
})
@XmlRootElement(name = "IdentifiedPerson")
public class IdentifiedPerson
    extends Correlation
{

    @XmlElement(required = true)
    protected II playerIdentifier;
    @XmlElement(required = true)
    protected II scoperIdentifier;
    @XmlElement(required = true)
    protected II assignedId;
    @XmlElement(required = true)
    protected CD status;

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
     * Gets the value of the assignedId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getAssignedId() {
        return assignedId;
    }

    /**
     * Sets the value of the assignedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setAssignedId(II value) {
        this.assignedId = value;
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

    public IdentifiedPerson withPlayerIdentifier(II value) {
        setPlayerIdentifier(value);
        return this;
    }

    public IdentifiedPerson withScoperIdentifier(II value) {
        setScoperIdentifier(value);
        return this;
    }

    public IdentifiedPerson withAssignedId(II value) {
        setAssignedId(value);
        return this;
    }

    public IdentifiedPerson withStatus(CD value) {
        setStatus(value);
        return this;
    }

    @Override
    public IdentifiedPerson withIdentifier(DSETII value) {
        setIdentifier(value);
        return this;
    }

}
