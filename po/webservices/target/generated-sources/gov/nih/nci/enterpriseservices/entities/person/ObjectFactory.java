
package gov.nih.nci.enterpriseservices.entities.person;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nih.nci.enterpriseservices.entities.person package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nih.nci.enterpriseservices.entities.person
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link ValidateRequest }
     * 
     */
    public ValidateRequest createValidateRequest() {
        return new ValidateRequest();
    }

    /**
     * Create an instance of {@link GetByIdRequest }
     * 
     */
    public GetByIdRequest createGetByIdRequest() {
        return new GetByIdRequest();
    }

    /**
     * Create an instance of {@link UpdateStatusRequest }
     * 
     */
    public UpdateStatusRequest createUpdateStatusRequest() {
        return new UpdateStatusRequest();
    }

    /**
     * Create an instance of {@link CreateRequest }
     * 
     */
    public CreateRequest createCreateRequest() {
        return new CreateRequest();
    }

    /**
     * Create an instance of {@link QueryRequest }
     * 
     */
    public QueryRequest createQueryRequest() {
        return new QueryRequest();
    }

    /**
     * Create an instance of {@link UpdateRequest.Person }
     * 
     */
    public UpdateRequest.Person createUpdateRequestPerson() {
        return new UpdateRequest.Person();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link ValidateRequest.Person }
     * 
     */
    public ValidateRequest.Person createValidateRequestPerson() {
        return new ValidateRequest.Person();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link ValidateResponse }
     * 
     */
    public ValidateResponse createValidateResponse() {
        return new ValidateResponse();
    }

    /**
     * Create an instance of {@link PersonResourceProperties }
     * 
     */
    public PersonResourceProperties createPersonResourceProperties() {
        return new PersonResourceProperties();
    }

    /**
     * Create an instance of {@link GetByIdRequest.Id }
     * 
     */
    public GetByIdRequest.Id createGetByIdRequestId() {
        return new GetByIdRequest.Id();
    }

    /**
     * Create an instance of {@link UpdateStatusRequest.TargetId }
     * 
     */
    public UpdateStatusRequest.TargetId createUpdateStatusRequestTargetId() {
        return new UpdateStatusRequest.TargetId();
    }

    /**
     * Create an instance of {@link UpdateStatusRequest.StatusCode }
     * 
     */
    public UpdateStatusRequest.StatusCode createUpdateStatusRequestStatusCode() {
        return new UpdateStatusRequest.StatusCode();
    }

    /**
     * Create an instance of {@link UpdateStatusResponse }
     * 
     */
    public UpdateStatusResponse createUpdateStatusResponse() {
        return new UpdateStatusResponse();
    }

    /**
     * Create an instance of {@link CreateRequest.Person }
     * 
     */
    public CreateRequest.Person createCreateRequestPerson() {
        return new CreateRequest.Person();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link QueryRequest.Person }
     * 
     */
    public QueryRequest.Person createQueryRequestPerson() {
        return new QueryRequest.Person();
    }

    /**
     * Create an instance of {@link QueryRequest.LimitOffset }
     * 
     */
    public QueryRequest.LimitOffset createQueryRequestLimitOffset() {
        return new QueryRequest.LimitOffset();
    }

}