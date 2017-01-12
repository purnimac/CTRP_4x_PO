
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.annotate.JsonTypeInfo;


/**
 * A role that a person plays in an organization
 *             
 * 
 * <p>Java class for PersonRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonRole">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}Role">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonRole", propOrder = {
    "personId"
})
@XmlSeeAlso({
    HealthCareProvider.class,
    OrganizationalContact.class,
    ClinicalResearchStaff.class
})
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class", include = JsonTypeInfo.As.PROPERTY)
public abstract class PersonRole
    extends Role
{

    protected long personId;

    /**
     * Gets the value of the personId property.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

}
