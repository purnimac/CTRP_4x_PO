package gov.nih.nci.po.webservices.service.bridg.soap.healthcarefacility;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-31T14:37:08.597-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", name = "HealthCareFacilityPortType")
@XmlSeeAlso({gov.nih.nci.coppa.po.faults.ObjectFactory.class, gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.ObjectFactory.class, gov.nih.nci.iso21090.extensions.ObjectFactory.class, gov.nih.nci.coppa.common.ObjectFactory.class, org.xmlsoap.schemas.ws._2004._03.addressing.ObjectFactory.class, org.iso._21090.ObjectFactory.class, gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.types.ObjectFactory.class, gov.nih.nci.coppa.po.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HealthCareFacilityPortType {

    @WebResult(name = "CreateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/CreateRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.CreateResponse create(
        @WebParam(partName = "parameters", name = "CreateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.CreateRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "QueryResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/QueryRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.QueryResponse query(
        @WebParam(partName = "parameters", name = "QueryRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.QueryRequest parameters
    ) throws TooManyResultsFaultFaultMessage;

    @WebResult(name = "ValidateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/ValidateRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.ValidateResponse validate(
        @WebParam(partName = "parameters", name = "ValidateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.ValidateRequest parameters
    );

    @WebResult(name = "GetByIdResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/GetByIdRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.GetByIdResponse getById(
        @WebParam(partName = "parameters", name = "GetByIdRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.GetByIdRequest parameters
    ) throws NullifiedRoleFaultFaultMessage;

    @WebResult(name = "UpdateStatusResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/UpdateStatusRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.UpdateStatusResponse updateStatus(
        @WebParam(partName = "parameters", name = "UpdateStatusRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.UpdateStatusRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "UpdateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/UpdateRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.UpdateResponse update(
        @WebParam(partName = "parameters", name = "UpdateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.UpdateRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "GetByIdsResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/GetByIdsRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.GetByIdsResponse getByIds(
        @WebParam(partName = "parameters", name = "GetByIdsRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.GetByIdsRequest parameters
    ) throws NullifiedRoleFaultFaultMessage;

    @WebResult(name = "GetByPlayerIdsResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility/GetByPlayerIdsRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.GetByPlayerIdsResponse getByPlayerIds(
        @WebParam(partName = "parameters", name = "GetByPlayerIdsRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareFacility")
        gov.nih.nci.enterpriseservices.structuralroles.healthcarefacility.GetByPlayerIdsRequest parameters
    );
}
