package gov.nih.nci.po.webservices.service.simple.soap.organization;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-05T11:48:50.171-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", name = "OrganizationService")
@XmlSeeAlso({gov.nih.nci.po.webservices.types.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrganizationService {

    @WebResult(name = "createOrganizationResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public CreateOrganizationResponse createOrganization(
        @WebParam(partName = "parameters", name = "createOrganizationRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        CreateOrganizationRequest parameters
    );

    @WebResult(name = "getOrganizationResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public GetOrganizationResponse getOrganization(
        @WebParam(partName = "parameters", name = "getOrganizationRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        GetOrganizationRequest parameters
    );

    @WebResult(name = "changeOrganizationStatusResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public ChangeOrganizationStatusResponse changeOrganizationStatus(
        @WebParam(partName = "parameters", name = "changeOrganizationStatusRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        ChangeOrganizationStatusRequest parameters
    );

    @WebResult(name = "getOrganizationRolesByCtepIdResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public GetOrganizationRolesByCtepIdResponse getOrganizationRolesByCtepId(
        @WebParam(partName = "parameters", name = "getOrganizationRolesByCtepIdRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        GetOrganizationRolesByCtepIdRequest parameters
    );

    @WebResult(name = "updateOrganizationRoleResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public UpdateOrganizationRoleResponse updateOrganizationRole(
        @WebParam(partName = "parameters", name = "updateOrganizationRoleRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        UpdateOrganizationRoleRequest parameters
    );

    @WebResult(name = "changeOrganizationRoleStatusResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public ChangeOrganizationRoleStatusResponse changeOrganizationRoleStatus(
        @WebParam(partName = "parameters", name = "changeOrganizationRoleStatusRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        ChangeOrganizationRoleStatusRequest parameters
    );

    @WebResult(name = "getOrganizationRolesByOrgIdResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public GetOrganizationRolesByOrgIdResponse getOrganizationRolesByOrgId(
        @WebParam(partName = "parameters", name = "getOrganizationRolesByOrgIdRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        GetOrganizationRolesByOrgIdRequest parameters
    );

    @WebResult(name = "updateOrganizationResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public UpdateOrganizationResponse updateOrganization(
        @WebParam(partName = "parameters", name = "updateOrganizationRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        UpdateOrganizationRequest parameters
    );

    @WebResult(name = "getOrganizationRoleByIdResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public GetOrganizationRoleByIdResponse getOrganizationRoleById(
        @WebParam(partName = "parameters", name = "getOrganizationRoleByIdRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        GetOrganizationRoleByIdRequest parameters
    );

    @WebResult(name = "createOrganizationRoleResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public CreateOrganizationRoleResponse createOrganizationRole(
        @WebParam(partName = "parameters", name = "createOrganizationRoleRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        CreateOrganizationRoleRequest parameters
    );

    @WebResult(name = "searchOrganizationsResponse", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/", partName = "parameters")
    @WebMethod
    public SearchOrganizationsResponse searchOrganizations(
        @WebParam(partName = "parameters", name = "searchOrganizationsRequest", targetNamespace = "http://soap.simple.service.webservices.po.nci.nih.gov/organization/")
        SearchOrganizationsRequest parameters
    );
}