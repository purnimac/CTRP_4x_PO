
package gov.nih.nci.po.webservices.service.bridg.soap.identifiedorganization;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-31T14:37:11.566-05:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "TooManyResultsFault", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/IdentifiedOrganization/types")
public class TooManyResultsFaultFaultMessage extends Exception {
    
    private gov.nih.nci.coppa.po.faults.TooManyResultsFault tooManyResultsFault;

    public TooManyResultsFaultFaultMessage() {
        super();
    }
    
    public TooManyResultsFaultFaultMessage(String message) {
        super(message);
    }
    
    public TooManyResultsFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyResultsFaultFaultMessage(String message, gov.nih.nci.coppa.po.faults.TooManyResultsFault tooManyResultsFault) {
        super(message);
        this.tooManyResultsFault = tooManyResultsFault;
    }

    public TooManyResultsFaultFaultMessage(String message, gov.nih.nci.coppa.po.faults.TooManyResultsFault tooManyResultsFault, Throwable cause) {
        super(message, cause);
        this.tooManyResultsFault = tooManyResultsFault;
    }

    public gov.nih.nci.coppa.po.faults.TooManyResultsFault getFaultInfo() {
        return this.tooManyResultsFault;
    }
}
