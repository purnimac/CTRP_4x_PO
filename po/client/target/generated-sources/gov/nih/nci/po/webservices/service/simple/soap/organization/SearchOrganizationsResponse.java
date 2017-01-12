
package gov.nih.nci.po.webservices.service.simple.soap.organization;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.po.webservices.types.OrganizationSearchResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationSearchResultList" type="{gov.nih.nci.po.webservices.types}OrganizationSearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organizationSearchResultList"
})
@XmlRootElement(name = "searchOrganizationsResponse")
public class SearchOrganizationsResponse {

    protected List<OrganizationSearchResult> organizationSearchResultList;

    /**
     * Gets the value of the organizationSearchResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationSearchResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationSearchResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationSearchResult }
     * 
     * 
     */
    public List<OrganizationSearchResult> getOrganizationSearchResultList() {
        if (organizationSearchResultList == null) {
            organizationSearchResultList = new ArrayList<OrganizationSearchResult>();
        }
        return this.organizationSearchResultList;
    }

}
