package gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-01-31T14:37:10.081-05:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", name = "HealthCareProviderPortType")
@XmlSeeAlso({gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.types.ObjectFactory.class, gov.nih.nci.coppa.po.faults.ObjectFactory.class, gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.ObjectFactory.class, gov.nih.nci.iso21090.extensions.ObjectFactory.class, gov.nih.nci.coppa.common.ObjectFactory.class, org.xmlsoap.schemas.ws._2004._03.addressing.ObjectFactory.class, org.iso._21090.ObjectFactory.class, gov.nih.nci.coppa.po.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HealthCareProviderPortType {

    @WebResult(name = "ValidateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/ValidateRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.ValidateResponse validate(
        @WebParam(partName = "parameters", name = "ValidateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.ValidateRequest parameters
    );

    @WebResult(name = "GetByIdResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/GetByIdRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdResponse getById(
        @WebParam(partName = "parameters", name = "GetByIdRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdRequest parameters
    ) throws NullifiedRoleFaultFaultMessage;

    @WebResult(name = "CreateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/CreateRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.CreateResponse create(
        @WebParam(partName = "parameters", name = "CreateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.CreateRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "UpdateResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/UpdateRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateResponse update(
        @WebParam(partName = "parameters", name = "UpdateRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateRequest parameters
    ) throws EntityValidationFaultFaultMessage;

    @WebResult(name = "GetByPlayerIdsResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/GetByPlayerIdsRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByPlayerIdsResponse getByPlayerIds(
        @WebParam(partName = "parameters", name = "GetByPlayerIdsRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByPlayerIdsRequest parameters
    );

    @WebResult(name = "QueryResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/QueryRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.QueryResponse query(
        @WebParam(partName = "parameters", name = "QueryRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.QueryRequest parameters
    ) throws TooManyResultsFaultFaultMessage;

    @WebResult(name = "GetByIdsResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/GetByIdsRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdsResponse getByIds(
        @WebParam(partName = "parameters", name = "GetByIdsRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdsRequest parameters
    ) throws NullifiedRoleFaultFaultMessage;

    @WebResult(name = "UpdateStatusResponse", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider", partName = "parameters")
    @WebMethod(action = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider/UpdateStatusRequest")
    public gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateStatusResponse updateStatus(
        @WebParam(partName = "parameters", name = "UpdateStatusRequest", targetNamespace = "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider")
        gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateStatusRequest parameters
    ) throws EntityValidationFaultFaultMessage;
}
