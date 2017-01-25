
package gov.nih.nci.po.webservices.service.simple.soap.organization;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "OrganizationService", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", wsdlLocation = "file:/Users/kasubaghasridvr/CTRP_4x/code/po/client/../webservices/src/main/resources/OrganizationService.wsdl")
public class OrganizationService_Service
    extends Service
{

    private final static URL ORGANIZATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORGANIZATIONSERVICE_EXCEPTION;
    private final static QName ORGANIZATIONSERVICE_QNAME = new QName("http://soap.simple.service.webservices.po.nci.nih.gov/organization/", "OrganizationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/kasubaghasridvr/CTRP_4x/code/po/client/../webservices/src/main/resources/OrganizationService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORGANIZATIONSERVICE_WSDL_LOCATION = url;
        ORGANIZATIONSERVICE_EXCEPTION = e;
    }

    public OrganizationService_Service() {
        super(__getWsdlLocation(), ORGANIZATIONSERVICE_QNAME);
    }

    public OrganizationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns OrganizationService
     */
    @WebEndpoint(name = "OrganizationServicePort")
    public OrganizationService getOrganizationServicePort() {
        return super.getPort(new QName("http://soap.simple.service.webservices.po.nci.nih.gov/organization/", "OrganizationServicePort"), OrganizationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrganizationService
     */
    @WebEndpoint(name = "OrganizationServicePort")
    public OrganizationService getOrganizationServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.simple.service.webservices.po.nci.nih.gov/organization/", "OrganizationServicePort"), OrganizationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORGANIZATIONSERVICE_EXCEPTION!= null) {
            throw ORGANIZATIONSERVICE_EXCEPTION;
        }
        return ORGANIZATIONSERVICE_WSDL_LOCATION;
    }

}