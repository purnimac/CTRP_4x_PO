
package gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.nih.nci.coppa.po.faults.EntityValidationFault;
import gov.nih.nci.coppa.po.faults.NullifiedRoleFault;
import gov.nih.nci.coppa.po.faults.TooManyResultsFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee.types package. 
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

    private final static QName _EntityValidationFault_QNAME = new QName("http://enterpriseservices.nci.nih.gov/structuralroles/OversightCommittee/types", "EntityValidationFault");
    private final static QName _NullifiedRoleFault_QNAME = new QName("http://enterpriseservices.nci.nih.gov/structuralroles/OversightCommittee/types", "NullifiedRoleFault");
    private final static QName _TooManyResultsFault_QNAME = new QName("http://enterpriseservices.nci.nih.gov/structuralroles/OversightCommittee/types", "TooManyResultsFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nih.nci.enterpriseservices.structuralroles.oversightcommittee.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enterpriseservices.nci.nih.gov/structuralroles/OversightCommittee/types", name = "EntityValidationFault")
    public JAXBElement<EntityValidationFault> createEntityValidationFault(EntityValidationFault value) {
        return new JAXBElement<EntityValidationFault>(_EntityValidationFault_QNAME, EntityValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NullifiedRoleFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enterpriseservices.nci.nih.gov/structuralroles/OversightCommittee/types", name = "NullifiedRoleFault")
    public JAXBElement<NullifiedRoleFault> createNullifiedRoleFault(NullifiedRoleFault value) {
        return new JAXBElement<NullifiedRoleFault>(_NullifiedRoleFault_QNAME, NullifiedRoleFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TooManyResultsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enterpriseservices.nci.nih.gov/structuralroles/OversightCommittee/types", name = "TooManyResultsFault")
    public JAXBElement<TooManyResultsFault> createTooManyResultsFault(TooManyResultsFault value) {
        return new JAXBElement<TooManyResultsFault>(_TooManyResultsFault_QNAME, TooManyResultsFault.class, null, value);
    }

}
