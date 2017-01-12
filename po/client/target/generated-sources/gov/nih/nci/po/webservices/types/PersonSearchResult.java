
package gov.nih.nci.po.webservices.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * SearchResult for Person
 * 
 * <p>Java class for PersonSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonSearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{gov.nih.nci.po.webservices.types}BaseSearchResult">
 *       &lt;sequence>
 *         &lt;element name="ctepID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCrs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalHcp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalOc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPending" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="affiliation" type="{gov.nih.nci.po.webservices.types}Affiliation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonSearchResult", propOrder = {
    "ctepID",
    "firstName",
    "middleName",
    "lastName",
    "totalCrs",
    "totalHcp",
    "totalOc",
    "totalPending",
    "affiliation"
})
public class PersonSearchResult
    extends BaseSearchResult
{

    protected String ctepID;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected int totalCrs;
    protected int totalHcp;
    protected int totalOc;
    protected int totalPending;
    protected List<Affiliation> affiliation;

    /**
     * Gets the value of the ctepID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtepID() {
        return ctepID;
    }

    /**
     * Sets the value of the ctepID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtepID(String value) {
        this.ctepID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the totalCrs property.
     * 
     */
    public int getTotalCrs() {
        return totalCrs;
    }

    /**
     * Sets the value of the totalCrs property.
     * 
     */
    public void setTotalCrs(int value) {
        this.totalCrs = value;
    }

    /**
     * Gets the value of the totalHcp property.
     * 
     */
    public int getTotalHcp() {
        return totalHcp;
    }

    /**
     * Sets the value of the totalHcp property.
     * 
     */
    public void setTotalHcp(int value) {
        this.totalHcp = value;
    }

    /**
     * Gets the value of the totalOc property.
     * 
     */
    public int getTotalOc() {
        return totalOc;
    }

    /**
     * Sets the value of the totalOc property.
     * 
     */
    public void setTotalOc(int value) {
        this.totalOc = value;
    }

    /**
     * Gets the value of the totalPending property.
     * 
     */
    public int getTotalPending() {
        return totalPending;
    }

    /**
     * Sets the value of the totalPending property.
     * 
     */
    public void setTotalPending(int value) {
        this.totalPending = value;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Affiliation }
     * 
     * 
     */
    public List<Affiliation> getAffiliation() {
        if (affiliation == null) {
            affiliation = new ArrayList<Affiliation>();
        }
        return this.affiliation;
    }

}
