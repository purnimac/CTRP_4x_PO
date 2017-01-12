
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Represents a hierarchical relationship between any two
 * 				members of a family. "organizationId" is a
 * 				PEER|PARENT|CHILD|DIVISION|SUBDIVISION|DEPARTMENT|SUBDEPARTMENT of
 * 				"relatedToOrganizationId"
 * 			
 * 
 * <p>Java class for FamilyMemberRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyMemberRelationship">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}Entity">
 *       &lt;sequence>
 *         &lt;element name="familyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="relatedToOrganizationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{gov.nih.nci.po.webservices.types}FamilyMemberRelationshipType"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyMemberRelationship", propOrder = {
    "familyId",
    "organizationId",
    "relatedToOrganizationId",
    "type",
    "startDate"
})
public class FamilyMemberRelationship
    extends Entity
{

    protected long familyId;
    protected long organizationId;
    protected long relatedToOrganizationId;
    @XmlElement(required = true)
    protected FamilyMemberRelationshipType type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the familyId property.
     * 
     */
    public long getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     */
    public void setFamilyId(long value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     */
    public long getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     */
    public void setOrganizationId(long value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the relatedToOrganizationId property.
     * 
     */
    public long getRelatedToOrganizationId() {
        return relatedToOrganizationId;
    }

    /**
     * Sets the value of the relatedToOrganizationId property.
     * 
     */
    public void setRelatedToOrganizationId(long value) {
        this.relatedToOrganizationId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyMemberRelationshipType }
     *     
     */
    public FamilyMemberRelationshipType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyMemberRelationshipType }
     *     
     */
    public void setType(FamilyMemberRelationshipType value) {
        this.type = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
