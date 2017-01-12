
package gov.nih.nci.po.webservices.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * SearchResult for Organization
 * 
 * <p>Java class for OrganizationSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}BaseSearchResult">
 *       &lt;sequence>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roCtepID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hcfCtepID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCtepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pendingROs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pendingHCFs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="totalROs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalHCFs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalIdOrgs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalOversightCommitees" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalOrgContacts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alias" type="{gov.nih.nci.po.webservices.types}Alias" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSearchResult", propOrder = {
    "organizationName",
    "familyName",
    "roCtepID",
    "hcfCtepID",
    "orgCtepId",
    "changeRequests",
    "pendingROs",
    "pendingHCFs",
    "statusDate",
    "totalROs",
    "totalHCFs",
    "totalIdOrgs",
    "totalOversightCommitees",
    "totalOrgContacts",
    "alias"
})
public class OrganizationSearchResult
    extends BaseSearchResult
{

    @XmlElement(required = true)
    protected String organizationName;
    protected String familyName;
    protected String roCtepID;
    protected String hcfCtepID;
    protected String orgCtepId;
    protected int changeRequests;
    protected int pendingROs;
    protected int pendingHCFs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    protected int totalROs;
    protected int totalHCFs;
    protected int totalIdOrgs;
    protected int totalOversightCommitees;
    protected int totalOrgContacts;
    protected List<Alias> alias;

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
     * Gets the value of the roCtepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoCtepID() {
        return roCtepID;
    }

    /**
     * Sets the value of the roCtepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoCtepID(String value) {
        this.roCtepID = value;
    }

    /**
     * Gets the value of the hcfCtepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcfCtepID() {
        return hcfCtepID;
    }

    /**
     * Sets the value of the hcfCtepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcfCtepID(String value) {
        this.hcfCtepID = value;
    }

    /**
     * Gets the value of the orgCtepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCtepId() {
        return orgCtepId;
    }

    /**
     * Sets the value of the orgCtepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCtepId(String value) {
        this.orgCtepId = value;
    }

    /**
     * Gets the value of the changeRequests property.
     * 
     */
    public int getChangeRequests() {
        return changeRequests;
    }

    /**
     * Sets the value of the changeRequests property.
     * 
     */
    public void setChangeRequests(int value) {
        this.changeRequests = value;
    }

    /**
     * Gets the value of the pendingROs property.
     * 
     */
    public int getPendingROs() {
        return pendingROs;
    }

    /**
     * Sets the value of the pendingROs property.
     * 
     */
    public void setPendingROs(int value) {
        this.pendingROs = value;
    }

    /**
     * Gets the value of the pendingHCFs property.
     * 
     */
    public int getPendingHCFs() {
        return pendingHCFs;
    }

    /**
     * Sets the value of the pendingHCFs property.
     * 
     */
    public void setPendingHCFs(int value) {
        this.pendingHCFs = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the totalROs property.
     * 
     */
    public int getTotalROs() {
        return totalROs;
    }

    /**
     * Sets the value of the totalROs property.
     * 
     */
    public void setTotalROs(int value) {
        this.totalROs = value;
    }

    /**
     * Gets the value of the totalHCFs property.
     * 
     */
    public int getTotalHCFs() {
        return totalHCFs;
    }

    /**
     * Sets the value of the totalHCFs property.
     * 
     */
    public void setTotalHCFs(int value) {
        this.totalHCFs = value;
    }

    /**
     * Gets the value of the totalIdOrgs property.
     * 
     */
    public int getTotalIdOrgs() {
        return totalIdOrgs;
    }

    /**
     * Sets the value of the totalIdOrgs property.
     * 
     */
    public void setTotalIdOrgs(int value) {
        this.totalIdOrgs = value;
    }

    /**
     * Gets the value of the totalOversightCommitees property.
     * 
     */
    public int getTotalOversightCommitees() {
        return totalOversightCommitees;
    }

    /**
     * Sets the value of the totalOversightCommitees property.
     * 
     */
    public void setTotalOversightCommitees(int value) {
        this.totalOversightCommitees = value;
    }

    /**
     * Gets the value of the totalOrgContacts property.
     * 
     */
    public int getTotalOrgContacts() {
        return totalOrgContacts;
    }

    /**
     * Sets the value of the totalOrgContacts property.
     * 
     */
    public void setTotalOrgContacts(int value) {
        this.totalOrgContacts = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alias }
     * 
     * 
     */
    public List<Alias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<Alias>();
        }
        return this.alias;
    }

}
