package gov.nih.nci.po.webservices.service.bridg.soap.organization;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-05T11:48:56.518-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", name = "OrganizationPortType")
@XmlSeeAlso({gov.nih.nci.coppa.po.faults.ObjectFactory.class, gov.nih.nci.enterpriseservices.entities.organization.ObjectFactory.class, gov.nih.nci.iso21090.extensions.ObjectFactory.class, gov.nih.nci.coppa.common.ObjectFactory.class, org.xmlsoap.schemas.ws._2004._03.addressing.ObjectFactory.class, org.iso._21090.ObjectFactory.class, gov.nih.nci.coppa.po.ObjectFactory.class, gov.nih.nci.enterpriseservices.entities.organization.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OrganizationPortType {

    @WebResult(name = "GetByIdResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/entities/Organization/GetByIdRequest")
    public gov.nih.nci.enterpriseservices.entities.organization.GetByIdResponse getById(
        @WebParam(partName = "parameters", name = "GetByIdRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization")
        gov.nih.nci.enterpriseservices.entities.organization.GetByIdRequest parameters
    ) throws NullifiedEntityFaultFaultMessage;

    @WebResult(name = "UpdateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/entities/Organization/UpdateRequest")
    public gov.nih.nci.enterpriseservices.entities.organization.UpdateResponse update(
        @WebParam(partName = "parameters", name = "UpdateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization")
        gov.nih.nci.enterpriseservices.entities.organization.UpdateRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "UpdateStatusResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/entities/Organization/UpdateStatusRequest")
    public gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusResponse updateStatus(
        @WebParam(partName = "parameters", name = "UpdateStatusRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization")
        gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "QueryResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/entities/Organization/QueryRequest")
    public gov.nih.nci.enterpriseservices.entities.organization.QueryResponse query(
        @WebParam(partName = "parameters", name = "QueryRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization")
        gov.nih.nci.enterpriseservices.entities.organization.QueryRequest parameters
    ) throws TooManyResultsFaultFaultMessage;

    @WebResult(name = "ValidateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/entities/Organization/ValidateRequest")
    public gov.nih.nci.enterpriseservices.entities.organization.ValidateResponse validate(
        @WebParam(partName = "parameters", name = "ValidateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization")
        gov.nih.nci.enterpriseservices.entities.organization.ValidateRequest parameters
    );

    @WebResult(name = "CreateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/entities/Organization/CreateRequest")
    public gov.nih.nci.enterpriseservices.entities.organization.CreateResponse create(
        @WebParam(partName = "parameters", name = "CreateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/entities/Organization")
        gov.nih.nci.enterpriseservices.entities.organization.CreateRequest parameters
    ) throws EntityValidationFaultFaultMessage;
}