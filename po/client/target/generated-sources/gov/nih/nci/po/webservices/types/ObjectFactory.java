
package gov.nih.nci.po.webservices.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nih.nci.po.webservices.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FamilyMemberRelationship_QNAME = new QName("gov.nih.nci.po.webservices.types", "familyMemberRelationship");
    private final static QName _PersonRole_QNAME = new QName("gov.nih.nci.po.webservices.types", "personRole");
    private final static QName _PersonSearchResult_QNAME = new QName("gov.nih.nci.po.webservices.types", "personSearchResult");
    private final static QName _Organization_QNAME = new QName("gov.nih.nci.po.webservices.types", "organization");
    private final static QName _Person_QNAME = new QName("gov.nih.nci.po.webservices.types", "person");
    private final static QName _OrganizationRole_QNAME = new QName("gov.nih.nci.po.webservices.types", "organizationRole");
    private final static QName _OrganizationSearchResult_QNAME = new QName("gov.nih.nci.po.webservices.types", "organizationSearchResult");
    private final static QName _Family_QNAME = new QName("gov.nih.nci.po.webservices.types", "family");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nih.nci.po.webservices.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Family }
     * 
     */
    public Family createFamily() {
        return new Family();
    }

    /**
     * Create an instance of {@link FamilyMember }
     * 
     */
    public FamilyMember createFamilyMember() {
        return new FamilyMember();
    }

    /**
     * Create an instance of {@link FamilyMemberRelationship }
     * 
     */
    public FamilyMemberRelationship createFamilyMemberRelationship() {
        return new FamilyMemberRelationship();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PersonList }
     * 
     */
    public PersonList createPersonList() {
        return new PersonList();
    }

    /**
     * Create an instance of {@link FamilyList }
     * 
     */
    public FamilyList createFamilyList() {
        return new FamilyList();
    }

    /**
     * Create an instance of {@link OrganizationSearchResult }
     * 
     */
    public OrganizationSearchResult createOrganizationSearchResult() {
        return new OrganizationSearchResult();
    }

    /**
     * Create an instance of {@link PersonSearchResultList }
     * 
     */
    public PersonSearchResultList createPersonSearchResultList() {
        return new PersonSearchResultList();
    }

    /**
     * Create an instance of {@link PersonSearchResult }
     * 
     */
    public PersonSearchResult createPersonSearchResult() {
        return new PersonSearchResult();
    }

    /**
     * Create an instance of {@link OrganizationSearchResultList }
     * 
     */
    public OrganizationSearchResultList createOrganizationSearchResultList() {
        return new OrganizationSearchResultList();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link PersonRoleList }
     * 
     */
    public PersonRoleList createPersonRoleList() {
        return new PersonRoleList();
    }

    /**
     * Create an instance of {@link FamilyMemberRelationshipList }
     * 
     */
    public FamilyMemberRelationshipList createFamilyMemberRelationshipList() {
        return new FamilyMemberRelationshipList();
    }

    /**
     * Create an instance of {@link OrganizationRoleList }
     * 
     */
    public OrganizationRoleList createOrganizationRoleList() {
        return new OrganizationRoleList();
    }

    /**
     * Create an instance of {@link OrganizationSearchCriteria }
     * 
     */
    public OrganizationSearchCriteria createOrganizationSearchCriteria() {
        return new OrganizationSearchCriteria();
    }

    /**
     * Create an instance of {@link Affiliation }
     * 
     */
    public Affiliation createAffiliation() {
        return new Affiliation();
    }

    /**
     * Create an instance of {@link HealthCareProvider }
     * 
     */
    public HealthCareProvider createHealthCareProvider() {
        return new HealthCareProvider();
    }

    /**
     * Create an instance of {@link OrganizationalContact }
     * 
     */
    public OrganizationalContact createOrganizationalContact() {
        return new OrganizationalContact();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ResearchOrganization }
     * 
     */
    public ResearchOrganization createResearchOrganization() {
        return new ResearchOrganization();
    }

    /**
     * Create an instance of {@link ClinicalResearchStaff }
     * 
     */
    public ClinicalResearchStaff createClinicalResearchStaff() {
        return new ClinicalResearchStaff();
    }

    /**
     * Create an instance of {@link PersonSearchCriteria }
     * 
     */
    public PersonSearchCriteria createPersonSearchCriteria() {
        return new PersonSearchCriteria();
    }

    /**
     * Create an instance of {@link OversightCommittee }
     * 
     */
    public OversightCommittee createOversightCommittee() {
        return new OversightCommittee();
    }

    /**
     * Create an instance of {@link Alias }
     * 
     */
    public Alias createAlias() {
        return new Alias();
    }

    /**
     * Create an instance of {@link HealthCareFacility }
     * 
     */
    public HealthCareFacility createHealthCareFacility() {
        return new HealthCareFacility();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyMemberRelationship }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "familyMemberRelationship")
    public JAXBElement<FamilyMemberRelationship> createFamilyMemberRelationship(FamilyMemberRelationship value) {
        return new JAXBElement<FamilyMemberRelationship>(_FamilyMemberRelationship_QNAME, FamilyMemberRelationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "personRole")
    public JAXBElement<PersonRole> createPersonRole(PersonRole value) {
        return new JAXBElement<PersonRole>(_PersonRole_QNAME, PersonRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "personSearchResult")
    public JAXBElement<PersonSearchResult> createPersonSearchResult(PersonSearchResult value) {
        return new JAXBElement<PersonSearchResult>(_PersonSearchResult_QNAME, PersonSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "organizationRole")
    public JAXBElement<OrganizationRole> createOrganizationRole(OrganizationRole value) {
        return new JAXBElement<OrganizationRole>(_OrganizationRole_QNAME, OrganizationRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "organizationSearchResult")
    public JAXBElement<OrganizationSearchResult> createOrganizationSearchResult(OrganizationSearchResult value) {
        return new JAXBElement<OrganizationSearchResult>(_OrganizationSearchResult_QNAME, OrganizationSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Family }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gov.nih.nci.po.webservices.types", name = "family")
    public JAXBElement<Family> createFamily(Family value) {
        return new JAXBElement<Family>(_Family_QNAME, Family.class, null, value);
    }

}
