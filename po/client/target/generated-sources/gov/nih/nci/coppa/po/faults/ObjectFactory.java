
package gov.nih.nci.coppa.po.faults;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nih.nci.coppa.po.faults package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nih.nci.coppa.po.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseFaultType }
     * 
     */
    public BaseFaultType createBaseFaultType() {
        return new BaseFaultType();
    }

    /**
     * Create an instance of {@link StringMapType }
     * 
     */
    public StringMapType createStringMapType() {
        return new StringMapType();
    }

    /**
     * Create an instance of {@link SimpleIIMapType }
     * 
     */
    public SimpleIIMapType createSimpleIIMapType() {
        return new SimpleIIMapType();
    }

    /**
     * Create an instance of {@link EntityValidationFault }
     * 
     */
    public EntityValidationFault createEntityValidationFault() {
        return new EntityValidationFault();
    }

    /**
     * Create an instance of {@link TooManyResultsFault }
     * 
     */
    public TooManyResultsFault createTooManyResultsFault() {
        return new TooManyResultsFault();
    }

    /**
     * Create an instance of {@link NullifiedRoleFault }
     * 
     */
    public NullifiedRoleFault createNullifiedRoleFault() {
        return new NullifiedRoleFault();
    }

    /**
     * Create an instance of {@link NullifiedEntityFault }
     * 
     */
    public NullifiedEntityFault createNullifiedEntityFault() {
        return new NullifiedEntityFault();
    }

    /**
     * Create an instance of {@link BaseFaultType.ErrorCode }
     * 
     */
    public BaseFaultType.ErrorCode createBaseFaultTypeErrorCode() {
        return new BaseFaultType.ErrorCode();
    }

    /**
     * Create an instance of {@link BaseFaultType.Description }
     * 
     */
    public BaseFaultType.Description createBaseFaultTypeDescription() {
        return new BaseFaultType.Description();
    }

    /**
     * Create an instance of {@link StringMapType.Entry }
     * 
     */
    public StringMapType.Entry createStringMapTypeEntry() {
        return new StringMapType.Entry();
    }

    /**
     * Create an instance of {@link SimpleIIMapType.Entry }
     * 
     */
    public SimpleIIMapType.Entry createSimpleIIMapTypeEntry() {
        return new SimpleIIMapType.Entry();
    }

}
