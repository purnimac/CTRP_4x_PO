
package gov.nih.nci.coppa.po;

import java.util.ArrayList;
import java.util.Collection;
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
        @XmlElementRef(name = "OversightCommittee", namespace = "http://po.coppa.nci.nih.gov", type = OversightCommittee.class, required = false),
        @XmlElementRef(name = "ClinicalResearchStaff", namespace = "http://po.coppa.nci.nih.gov", type = ClinicalResearchStaff.class, required = false),
        @XmlElementRef(name = "HealthCareProvider", namespace = "http://po.coppa.nci.nih.gov", type = HealthCareProvider.class, required = false),
        @XmlElementRef(name = "OrganizationalContact", namespace = "http://po.coppa.nci.nih.gov", type = OrganizationalContact.class, required = false),
        @XmlElementRef(name = "IdentifiedOrganization", namespace = "http://po.coppa.nci.nih.gov", type = IdentifiedOrganization.class, required = false),
        @XmlElementRef(name = "ResearchOrganization", namespace = "http://po.coppa.nci.nih.gov", type = ResearchOrganization.class, required = false),
        @XmlElementRef(name = "IdentifiedPerson", namespace = "http://po.coppa.nci.nih.gov", type = IdentifiedPerson.class, required = false),
        @XmlElementRef(name = "HealthCareFacility", namespace = "http://po.coppa.nci.nih.gov", type = HealthCareFacility.class, required = false)
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
     * {@link OversightCommittee }
     * {@link ClinicalResearchStaff }
     * {@link HealthCareProvider }
     * {@link String }
     * {@link OrganizationalContact }
     * {@link IdentifiedOrganization }
     * {@link HealthCareFacility }
     * {@link IdentifiedPerson }
     * {@link ResearchOrganization }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    public CorrelationType withContent(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getContent().add(value);
            }
        }
        return this;
    }

    public CorrelationType withContent(Collection<Object> values) {
        if (values!= null) {
            getContent().addAll(values);
        }
        return this;
    }

}
