
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * SearchCriteria for Organization
 * 
 * <p>Java class for OrganizationSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSearchCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}BaseSearchCriteria">
 *       &lt;sequence>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasChangeRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasPendingHcfRoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasPendingRoRoles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchAliases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSearchCriteria", propOrder = {
    "organizationName",
    "familyName",
    "hasChangeRequest",
    "hasPendingHcfRoles",
    "hasPendingRoRoles",
    "searchAliases"
})
public class OrganizationSearchCriteria
    extends BaseSearchCriteria
{

    protected String organizationName;
    protected String familyName;
    protected Boolean hasChangeRequest;
    protected Boolean hasPendingHcfRoles;
    protected Boolean hasPendingRoRoles;
    protected Boolean searchAliases;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the hasChangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChangeRequest() {
        return hasChangeRequest;
    }

    /**
     * Sets the value of the hasChangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChangeRequest(Boolean value) {
        this.hasChangeRequest = value;
    }

    /**
     * Gets the value of the hasPendingHcfRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPendingHcfRoles() {
        return hasPendingHcfRoles;
    }

    /**
     * Sets the value of the hasPendingHcfRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPendingHcfRoles(Boolean value) {
        this.hasPendingHcfRoles = value;
    }

    /**
     * Gets the value of the hasPendingRoRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPendingRoRoles() {
        return hasPendingRoRoles;
    }

    /**
     * Sets the value of the hasPendingRoRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPendingRoRoles(Boolean value) {
        this.hasPendingRoRoles = value;
    }

    /**
     * Gets the value of the searchAliases property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchAliases() {
        return searchAliases;
    }

    /**
     * Sets the value of the searchAliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchAliases(Boolean value) {
        this.searchAliases = value;
    }

}
