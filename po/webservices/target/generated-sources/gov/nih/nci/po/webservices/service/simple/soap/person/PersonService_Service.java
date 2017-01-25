package gov.nih.nci.po.webservices.service.simple.soap.person;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-05T11:48:49.763-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "PersonService", 
                  wsdlLocation = "file:/Users/kasubaghasridvr/CTRP_4x/code/po/webservices/src/main/resources/PersonService.wsdl",
                  targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/person/") 
public class PersonService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.simple.service.webservices.po.nci.nih.gov/person/", "PersonService");
    public final static QName PersonServicePort = new QName("http://soap.simple.service.webservices.po.nci.nih.gov/person/", "PersonServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/kasubaghasridvr/CTRP_4x/code/po/webservices/src/main/resources/PersonService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/kasubaghasridvr/CTRP_4x/code/po/webservices/src/main/resources/PersonService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServicePort")
    public PersonService getPersonServicePort() {
        return super.getPort(PersonServicePort, PersonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServicePort")
    public PersonService getPersonServicePort(WebServiceFeature... features) {
        return super.getPort(PersonServicePort, PersonService.class, features);
    }

}