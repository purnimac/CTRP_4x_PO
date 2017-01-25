package gov.nih.nci.po.webservices.service.bridg.soap.researchorganization;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-05T11:49:06.129-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "ResearchOrganizationService", 
                  wsdlLocation = "file:/Users/kasubaghasridvr/CTRP_4x/code/po/webservices/src/main/resources/gov/nih/nci/po/webservices/bridg/ResearchOrganization.wsdl",
                  targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/ResearchOrganization") 
public class ResearchOrganizationService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://enterpriseservices.nci.nih.gov/structuralroles/ResearchOrganization", "ResearchOrganizationService");
    public final static QName ResearchOrganizationPortTypePort = new QName("http://enterpriseservices.nci.nih.gov/structuralroles/ResearchOrganization", "ResearchOrganizationPortTypePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/kasubaghasridvr/CTRP_4x/code/po/webservices/src/main/resources/gov/nih/nci/po/webservices/bridg/ResearchOrganization.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ResearchOrganizationService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/kasubaghasridvr/CTRP_4x/code/po/webservices/src/main/resources/gov/nih/nci/po/webservices/bridg/ResearchOrganization.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ResearchOrganizationService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ResearchOrganizationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ResearchOrganizationService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ResearchOrganizationService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ResearchOrganizationService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ResearchOrganizationService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ResearchOrganizationPortType
     */
    @WebEndpoint(name = "ResearchOrganizationPortTypePort")
    public ResearchOrganizationPortType getResearchOrganizationPortTypePort() {
        return super.getPort(ResearchOrganizationPortTypePort, ResearchOrganizationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ResearchOrganizationPortType
     */
    @WebEndpoint(name = "ResearchOrganizationPortTypePort")
    public ResearchOrganizationPortType getResearchOrganizationPortTypePort(WebServiceFeature... features) {
        return super.getPort(ResearchOrganizationPortTypePort, ResearchOrganizationPortType.class, features);
    }

}