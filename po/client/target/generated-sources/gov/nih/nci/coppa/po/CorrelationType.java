
package gov.nih.nci.coppa.po;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}ClinicalResearchStaff"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareFacility"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}HealthCareProvider"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedOrganization"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}IdentifiedPerson"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}OrganizationalContact"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}OversightCommittee"/>
 *         &lt;element ref="{http://po.coppa.nci.nih.gov}ResearchOrganization"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelationType", propOrder = {
    "content"
})
public class CorrelationType {

    @XmlElementRefs({
        @XmlElementRef(name = "IdentifiedOrganization", namespace = "http://po.coppa.nci.nih.gov", type = IdentifiedOrganization.class),
        @XmlElementRef(name = "ClinicalResearchStaff", namespace = "http://po.coppa.nci.nih.gov", type = ClinicalResearchStaff.class),
        @XmlElementRef(name = "OversightCommittee", namespace = "http://po.coppa.nci.nih.gov", type = OversightCommittee.class),
        @XmlElementRef(name = "IdentifiedPerson", namespace = "http://po.coppa.nci.nih.gov", type = IdentifiedPerson.class),
        @XmlElementRef(name = "HealthCareFacility", namespace = "http://po.coppa.nci.nih.gov", type = HealthCareFacility.class),
        @XmlElementRef(name = "ResearchOrganization", namespace = "http://po.coppa.nci.nih.gov", type = ResearchOrganization.class),
        @XmlElementRef(name = "OrganizationalContact", namespace = "http://po.coppa.nci.nih.gov", type = OrganizationalContact.class),
        @XmlElementRef(name = "HealthCareProvider", namespace = "http://po.coppa.nci.nih.gov", type = HealthCareProvider.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedOrganization }
     * {@link ClinicalResearchStaff }
     * {@link OversightCommittee }
     * {@link String }
     * {@link IdentifiedPerson }
     * {@link HealthCareFacility }
     * {@link ResearchOrganization }
     * {@link HealthCareProvider }
     * {@link OrganizationalContact }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
