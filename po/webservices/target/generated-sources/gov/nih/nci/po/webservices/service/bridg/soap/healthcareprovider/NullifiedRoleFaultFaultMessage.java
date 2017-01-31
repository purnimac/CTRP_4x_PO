
package gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-31T14:37:10.073-05:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "NullifiedRoleFault", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/types")
public class NullifiedRoleFaultFaultMessage extends Exception {
    
    private gov.nih.nci.coppa.po.faults.NullifiedRoleFault nullifiedRoleFault;

    public NullifiedRoleFaultFaultMessage() {
        super();
    }
    
    public NullifiedRoleFaultFaultMessage(String message) {
        super(message);
    }
    
    public NullifiedRoleFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public NullifiedRoleFaultFaultMessage(String message, gov.nih.nci.coppa.po.faults.NullifiedRoleFault nullifiedRoleFault) {
        super(message);
        this.nullifiedRoleFault = nullifiedRoleFault;
    }

    public NullifiedRoleFaultFaultMessage(String message, gov.nih.nci.coppa.po.faults.NullifiedRoleFault nullifiedRoleFault, Throwable cause) {
        super(message, cause);
        this.nullifiedRoleFault = nullifiedRoleFault;
    }

    public gov.nih.nci.coppa.po.faults.NullifiedRoleFault getFaultInfo() {
        return this.nullifiedRoleFault;
    }
}
