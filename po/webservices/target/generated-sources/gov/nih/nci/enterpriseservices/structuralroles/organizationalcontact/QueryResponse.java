
package gov.nih.nci.enterpriseservices.structuralroles.organizationalcontact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.nih.nci.coppa.po.OrganizationalContact;


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
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}OrganizationalContact" maxOccurs="unbounded"/>
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
    "organizationalContact"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(name = "OrganizationalContact", namespace = "http://po.coppa.nci.nih.gov", required = true)
    protected List<OrganizationalContact> organizationalContact;

    /**
     * Gets the value of the organizationalContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationalContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationalContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationalContact }
     * 
     * 
     */
    public List<OrganizationalContact> getOrganizationalContact() {
        if (organizationalContact == null) {
            organizationalContact = new ArrayList<OrganizationalContact>();
        }
        return this.organizationalContact;
    }

    public QueryResponse withOrganizationalContact(OrganizationalContact... values) {
        if (values!= null) {
            for (OrganizationalContact value: values) {
                getOrganizationalContact().add(value);
            }
        }
        return this;
    }

    public QueryResponse withOrganizationalContact(Collection<OrganizationalContact> values) {
        if (values!= null) {
            getOrganizationalContact().addAll(values);
        }
        return this;
    }

}
