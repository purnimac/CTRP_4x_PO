package gov.nih.nci.po.webservices.service.bridg.soap;


import gov.nih.nci.coppa.common.LimitOffset;
import gov.nih.nci.coppa.po.HealthCareProvider;
import gov.nih.nci.coppa.po.Person;
import gov.nih.nci.coppa.po.StringMapType;
import gov.nih.nci.coppa.test.DataGeneratorUtil;
import gov.nih.nci.coppa.test.TstProperties;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.CreateRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.CreateResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdsRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByIdsResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByPlayerIdsRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.GetByPlayerIdsResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.QueryRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.QueryResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateStatusRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.UpdateStatusResponse;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.ValidateRequest;
import gov.nih.nci.enterpriseservices.structuralroles.healthcareprovider.ValidateResponse;
import gov.nih.nci.iso21090.Ad;
import gov.nih.nci.iso21090.DSet;
import gov.nih.nci.iso21090.Ii;
import gov.nih.nci.iso21090.Tel;
import gov.nih.nci.iso21090.TelPhone;
import gov.nih.nci.iso21090.extensions.Cd;
import gov.nih.nci.iso21090.extensions.Id;
import gov.nih.nci.iso21090.grid.dto.transform.DtoTransformException;
import gov.nih.nci.iso21090.grid.dto.transform.iso.DSETADTransformer;
import gov.nih.nci.iso21090.grid.dto.transform.iso.DSETIITransformer;
import gov.nih.nci.iso21090.grid.dto.transform.iso.IdTransformer;
import gov.nih.nci.iso21090.grid.dto.transform.iso.TELTransformer;
import gov.nih.nci.po.data.bo.Address;
import gov.nih.nci.po.data.bo.Country;
import gov.nih.nci.po.data.bo.EntityStatus;
import gov.nih.nci.po.data.bo.RoleStatus;
import gov.nih.nci.po.data.convert.AddressConverter;
import gov.nih.nci.po.data.convert.IdConverter;
import gov.nih.nci.po.service.external.CtepOrganizationImporter;
import gov.nih.nci.po.util.PoHibernateUtil;
import gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider.EntityValidationFaultFaultMessage;
import gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider.HealthCareProviderPortType;
import gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider.HealthCareProviderService;
import gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider.NullifiedRoleFaultFaultMessage;
import gov.nih.nci.po.webservices.service.bridg.soap.healthcareprovider.TooManyResultsFaultFaultMessage;
import gov.nih.nci.po.webservices.service.bridg.soap.organization.OrganizationPortType;
import gov.nih.nci.po.webservices.service.bridg.soap.organization.OrganizationService;
import gov.nih.nci.po.webservices.service.bridg.soap.person.PersonPortType;
import gov.nih.nci.po.webservices.service.bridg.soap.person.PersonService;
import gov.nih.nci.po.webservices.service.utils.AuthUtils;
import org.hibernate.Transaction;
import org.iso._21090.CD;
import org.iso._21090.DSETAD;
import org.iso._21090.DSETII;
import org.iso._21090.DSETTEL;
import org.iso._21090.II;
import org.iso._21090.NullFlavor;
import org.iso._21090.TEL;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Jason Aliyetti <jason.aliyetti@semanticbits.com>
 */
public class HealthCareProviderClientTest {

    private static final Country USA;

    static {
        USA = new Country("United States", "840", "US", "USA");
    }

    private static PersonPortType personService;
    private static OrganizationPortType organizationService;
    private HealthCareProviderPortType port;

    @BeforeClass
    public static void setupClass() throws MalformedURLException {
        AuthUtils.addBasicAuthSupport(
                TstProperties.getWebserviceUsername(),
                TstProperties.getWebservicePassword()
        );

        //init person service
        initPersonService();

        //init organization service
        initOrganizationService();

        AuthUtils.removeBasicAuthSupport();

    }



    private static void initPersonService() throws MalformedURLException {

        QName serviceName = new QName(
                "http://enterpriseservices.nci.nih.gov/entities/Person",
                "PersonService");
        URL url = new URL(PersonClientTest.getServiceUrlString());

        PersonService service = new PersonService(url,
                serviceName);

        personService = service.getPersonPortTypePort();
        AuthUtils.addWsSecurityUTSupport(
                ((BindingProvider)personService).getBinding(),
                TstProperties.getWebserviceUsername(),
                TstProperties.getWebservicePassword()
        );


    }

    private static void initOrganizationService() throws MalformedURLException {
        QName serviceName = new QName(
                "http://enterpriseservices.nci.nih.gov/entities/Organization",
                "OrganizationService");

        URL url = new URL(OrganizationClientTest.getServiceUrlString());

        organizationService = new OrganizationService(url, serviceName).getOrganizationPortTypePort();
        AuthUtils.addWsSecurityUTSupport(
                ((BindingProvider)organizationService).getBinding(),
                TstProperties.getWebserviceUsername(),
                TstProperties.getWebservicePassword()
        );
    }

    @Before
    public void setup() throws Exception {
        QName serviceName = new QName(
                "http://enterpriseservices.nci.nih.gov/structuralroles/HealthCareProvider",
                "HealthCareProviderService");
        URL url = new URL(getServiceUrlString());

        AuthUtils.addBasicAuthSupport(
                TstProperties.getWebserviceUsername(),
                TstProperties.getWebservicePassword()
        );

        HealthCareProviderService service = new HealthCareProviderService(url,
                serviceName);

        AuthUtils.removeBasicAuthSupport();

        port = service.getHealthCareProviderPortTypePort();
        AuthUtils.addWsSecurityUTSupport(
                ((BindingProvider)port).getBinding(),
                TstProperties.getWebserviceUsername(),
                TstProperties.getWebservicePassword()
        );

    }


    private long createNewPerson() {

        Address address = new Address();
        address.setCityOrMunicipality("Herndon");
        address.setStateOrProvince("VA");
        address.setStreetAddressLine("123 Elm St");
        address.setCountry(USA);
        address.setPostalCode("20176");

        Person person = PersonClientTest.PersonBuilder.newInstance()
                .withFirstName("Johnny")
                .withLastName("Miller")
                .withStatusCode(EntityStatus.ACTIVE)
                .withAddress(address)
                .withPhone("555-555-5555")
                .build();

        gov.nih.nci.enterpriseservices.entities.person.CreateRequest createRequest
                = new gov.nih.nci.enterpriseservices.entities.person.CreateRequest();

        gov.nih.nci.enterpriseservices.entities.person.CreateRequest.Person payloadWrapper
                = new gov.nih.nci.enterpriseservices.entities.person.CreateRequest.Person();

        payloadWrapper.setPerson(person);

        createRequest.setPerson(payloadWrapper);

        Id id = null;
        try {
            id = personService.create(createRequest).getId();
        } catch (gov.nih.nci.po.webservices.service.bridg.soap.person.EntityValidationFaultFaultMessage e) {
            throw new RuntimeException(e);
        }

        return Long.parseLong(id.getExtension());
    }



    private long createNewOrganization() {
        gov.nih.nci.enterpriseservices.entities.organization.CreateRequest request
                = new gov.nih.nci.enterpriseservices.entities.organization.CreateRequest();
        gov.nih.nci.enterpriseservices.entities.organization.CreateRequest.Organization payloadWrapper
                = new gov.nih.nci.enterpriseservices.entities.organization.CreateRequest.Organization();

        Address address = new Address();
        address.setStreetAddressLine("123 Elm St");
        address.setCityOrMunicipality("Herndon");
        address.setStateOrProvince("VA");
        address.setPostalCode("20171");
        address.setCountry(USA);

        OrganizationClientTest.OrganizationBuilder builder = OrganizationClientTest.OrganizationBuilder.newInstance()
                .withName("org")
                .withAddress(address)
                .withStatusCode(EntityStatus.PENDING);

        payloadWrapper.setOrganization(builder.build());
        request.setOrganization(payloadWrapper);

        gov.nih.nci.enterpriseservices.entities.organization.CreateResponse response = null;
        try {
            response = organizationService.create(request);
        } catch (gov.nih.nci.po.webservices.service.bridg.soap.organization.EntityValidationFaultFaultMessage e) {
            throw new RuntimeException(e);
        }


        // make the organization ACTIVE
        gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest updateStatusRequest
                = new gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest();

        gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest.TargetId targetId
                = new gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest.TargetId();
        targetId.setId(response.getId());

        updateStatusRequest.setTargetId(targetId);

        gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest.StatusCode statusCode
                = new gov.nih.nci.enterpriseservices.entities.organization.UpdateStatusRequest.StatusCode();
        Cd statusCd = new Cd();
        statusCd.setCode(EntityStatus.ACTIVE.toString());

        statusCode.setCd(statusCd);
        updateStatusRequest.setStatusCode(statusCode);

        try {
            organizationService.updateStatus(updateStatusRequest);
        } catch (gov.nih.nci.po.webservices.service.bridg.soap.organization.EntityValidationFaultFaultMessage e) {
            throw new RuntimeException(e);
        }
        return Long.parseLong(response.getId().getExtension());
    }



    @After
    public void teardown() {

    }

    private String getServiceUrlString() {
        return "http://" + TstProperties.getServerHostname() + ":"
                + TstProperties.getServerPort()
                + "/po-webservices/services/bridg/HealthCareProviderService?wsdl";
    }

    @Test
    public void testCreateWithoutAuthentication() throws EntityValidationFaultFaultMessage {

        CreateRequest request = new CreateRequest();

        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();

        HealthCareProvider payload = new HealthCareProvider();

        //empty identifier
        payload.setIdentifier(new DSETII());


        II playerIdentifier = new II();
        playerIdentifier.setRoot(IdConverter.PERSON_ROOT);
        playerIdentifier.setIdentifierName(IdConverter.PERSON_IDENTIFIER_NAME);
        playerIdentifier.setExtension("123");
        payload.setPlayerIdentifier(playerIdentifier);

        II scoperIdentifier = new II();
        scoperIdentifier.setRoot(IdConverter.ORG_ROOT);
        scoperIdentifier.setIdentifierName(IdConverter.ORG_IDENTIFIER_NAME);
        scoperIdentifier.setExtension("123");
        payload.setScoperIdentifier(scoperIdentifier);

        payload.setPostalAddress(new DSETAD());
        payload.setTelecomAddress(new DSETTEL());

        CD status = new CD();
        status.setCode("PENDING");
        payload.setStatus(status);

        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        try{
            AuthUtils.addWsSecurityUTSupport(
                    ((BindingProvider)port).getBinding(),
                    "bogusUser",
                    "bogusPassword"
            );
            port.create(request);
            fail();
        } catch (WebServiceException wse) {
            assertEquals("The server sent HTTP status code 401: Unauthorized", wse.getMessage().trim());
        }

    }

    @Test
    public void testCreate() throws EntityValidationFaultFaultMessage {

        CreateRequest request = new CreateRequest();

        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();

        HealthCareProvider payload = new HealthCareProvider();

        //empty identifier
        payload.setIdentifier(new DSETII());


        II playerIdentifier = new II();
        playerIdentifier.setRoot(IdConverter.PERSON_ROOT);
        playerIdentifier.setIdentifierName(IdConverter.PERSON_IDENTIFIER_NAME);
        playerIdentifier.setExtension(Long.toString(createNewPerson()));
        payload.setPlayerIdentifier(playerIdentifier);

        II scoperIdentifier = new II();
        scoperIdentifier.setRoot(IdConverter.ORG_ROOT);
        scoperIdentifier.setIdentifierName(IdConverter.ORG_IDENTIFIER_NAME);
        scoperIdentifier.setExtension(Long.toString(createNewOrganization()));
        payload.setScoperIdentifier(scoperIdentifier);

        payload.setPostalAddress(new DSETAD());
        payload.setTelecomAddress(new DSETTEL());

        CD status = new CD();
        status.setCode("PENDING");
        payload.setStatus(status);

        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        CreateResponse response = null;

        response = port.create(request);


        assertNotNull(Long.parseLong(response.getId().getExtension()));
    }


    @Test(expected = EntityValidationFaultFaultMessage.class)
    public void testCreateInvalid() throws EntityValidationFaultFaultMessage {

        CreateRequest request = new CreateRequest();

        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();

        HealthCareProvider payload = generateNewHealthCareProvider();
        payload.getPlayerIdentifier().setExtension("123");
        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        CreateResponse response = port.create(request);



    }

    @Test
    public void testGetById() throws EntityValidationFaultFaultMessage, NullifiedRoleFaultFaultMessage {
        CreateRequest request = new CreateRequest();
        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();

        HealthCareProvider payload = generateNewHealthCareProvider();

        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);
        CreateResponse response = port.create(request);


        GetByIdRequest getByIdRequest = new GetByIdRequest();
        getByIdRequest.setId(new GetByIdRequest.Id());
        getByIdRequest.getId().setId(response.getId());

        GetByIdResponse getByIdResponse = port.getById(getByIdRequest);

        HealthCareProvider retrieved = getByIdResponse.getHealthCareProvider();
        payload.setIdentifier(retrieved.getIdentifier());
        assertEquals(payload.getPlayerIdentifier().getExtension(), retrieved.getPlayerIdentifier().getExtension());

        payload.setPlayerIdentifier(retrieved.getPlayerIdentifier());
        assertEquals(response.getId().getExtension(), getByIdResponse.getHealthCareProvider().getIdentifier().getItem().get(0).getExtension());
    }

    @Test(expected = NullifiedRoleFaultFaultMessage.class)
    public void testGetNullifiedEntry() throws EntityValidationFaultFaultMessage, NullifiedRoleFaultFaultMessage, SQLException {
        //create an instance in the pending state
        HealthCareProvider payload = generateNewHealthCareProvider();

        CreateRequest request = new CreateRequest();
        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        CreateResponse response = port.create(request);

        //nullify the instance
        Statement statement = DataGeneratorUtil.getJDBCConnection().createStatement();
        statement.executeUpdate("update healthcareprovider set status='NULLIFIED' where id=" + response.getId().getExtension());


        GetByIdRequest getByIdRequest = new GetByIdRequest();
        getByIdRequest.setId(new GetByIdRequest.Id());
        getByIdRequest.getId().setId(response.getId());

        port.getById(getByIdRequest);

    }

    @Test
    public void testGetByIds() throws EntityValidationFaultFaultMessage, NullifiedRoleFaultFaultMessage {

        //create 3
        List<Id> instanceIds = new ArrayList<Id>();

        for (HealthCareProvider payload : generateNewStaffs(3)) {
            CreateRequest request = new CreateRequest();
            CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
            payloadWrapper.setHealthCareProvider(payload);
            request.setHealthCareProvider(payloadWrapper);

            CreateResponse response = port.create(request);
            instanceIds.add(response.getId());
        }

        //[]
        //[1]
        //[1,2]
        //[1,2,3]
        for (int i=1; i<instanceIds.size(); i++) {
            List<Id> ids = new ArrayList<Id>();
            List<String> extensions = new ArrayList<String>();

            for (int j=0; j<i; j++) {

                String id =  instanceIds.get(j).getExtension();

                extensions.add( id );
                Ii ii = new IdConverter.HealthCareProviderIdConverter().convertToIi(Long.parseLong(id));

                ids.add(IdTransformer.INSTANCE.toXml(ii));
            }

            GetByIdsRequest request = new GetByIdsRequest();
            request.setId(new GetByIdsRequest.Id());
            request.getId().getId().addAll(ids);

            GetByIdsResponse response = port.getByIds(request);
            assertEquals( response.getHealthCareProvider().size( ) , ids.size());

            for (HealthCareProvider retrieved : response.getHealthCareProvider()) {
                String extension = retrieved.getIdentifier().getItem().get(0).getExtension();
                assertTrue(extensions.contains(extension));
            }

        }

    }



    @Test
    public void testGetByPlayerIds() throws EntityValidationFaultFaultMessage {

        //create 3 staffs
        List<Id> playerIds = new ArrayList<Id>();

        for (HealthCareProvider payload : generateNewStaffs(3)) {
            CreateRequest request = new CreateRequest();
            CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
            payloadWrapper.setHealthCareProvider(payload);
            request.setHealthCareProvider(payloadWrapper);

            CreateResponse response = port.create(request);

            Ii ii = new IdConverter.PersonIdConverter().convertToIi(Long.parseLong(payload.getPlayerIdentifier().getExtension()));

            playerIds.add(IdTransformer.INSTANCE.toXml(ii));

        }

        for (int i=1; i<playerIds.size(); i++) {

            GetByPlayerIdsRequest request = new GetByPlayerIdsRequest();
            request.setId(new GetByPlayerIdsRequest.Id());

            for (int j=0; j<i; j++) {
                request.getId().getId().add(playerIds.get(j));
            }

            GetByPlayerIdsResponse response = port.getByPlayerIds(request);
            assertEquals( i, response.getHealthCareProvider().size());

            for (HealthCareProvider retreived : response.getHealthCareProvider()) {
                String playerId = retreived.getPlayerIdentifier().getExtension();

                //check that it was requested
                boolean requested = false;

                for (Id requestedId : request.getId().getId()) {
                    requested = requestedId.getExtension().equals( playerId );
                    if (requested) {
                        break;
                    }
                }

                assertTrue(requested);
            }
        }



    }

    @Test
    public void testQuery() throws EntityValidationFaultFaultMessage, TooManyResultsFaultFaultMessage {
        List<HealthCareProvider> instances = new ArrayList<HealthCareProvider>();
        List<String> extensions = new ArrayList<String>();

        //create 2 instances in the pending state
        instances.addAll(generateNewStaffs(4));
        for (HealthCareProvider payload : generateNewStaffs(3)) {
            CreateRequest request = new CreateRequest();
            CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
            payloadWrapper.setHealthCareProvider(payload);
            request.setHealthCareProvider(payloadWrapper);

            CreateResponse response = port.create(request);
            extensions.add( response.getId().getExtension());
        }

        //update 2 instances to the active state
        for (int i=0; i<2; i++) {
            HealthCareProvider instance = instances.get(i);
            UpdateStatusRequest request = new UpdateStatusRequest();

            UpdateStatusRequest.TargetId targetId = new UpdateStatusRequest.TargetId();
            String id = extensions.get(i);
            Ii ii = new IdConverter.HealthCareProviderIdConverter().convertToIi(Long.parseLong(id));
            targetId.setId(IdTransformer.INSTANCE.toXml(ii));
            request.setTargetId(targetId);

            patchInstance(Long.parseLong(id));

            UpdateStatusRequest.StatusCode statusCode = new UpdateStatusRequest.StatusCode();
            statusCode.setCd( new Cd() );
            statusCode.getCd().setCode(RoleStatus.ACTIVE.toString());
            request.setStatusCode(statusCode);

            port.updateStatus(request);
        }

        //query for active instances
        QueryRequest request = new QueryRequest();
        QueryRequest.HealthCareProvider payloadWrapper = new QueryRequest.HealthCareProvider();

        HealthCareProvider payload = new HealthCareProvider();

        DSet<Ii> iiDSet = new DSet<Ii>();
        iiDSet.setItem(new HashSet<Ii>());
        iiDSet.getItem().add( new IdConverter.HealthCareProviderIdConverter().convertToIi( Long.parseLong(extensions.get(0)) ));
        DSETII identifier = DSETIITransformer.INSTANCE.toXml(iiDSet);
        payload.setIdentifier(identifier);

        payload.setPostalAddress(new DSETAD());
        payload.setTelecomAddress(new DSETTEL());
        CD status = new CD();
        status.setNullFlavor(NullFlavor.NI);
        //status.setCode("ACTIVE");
        payload.setStatus(status);
        II nullIdentifier = new II();
        nullIdentifier.setNullFlavor(NullFlavor.NI);

        payload.setPlayerIdentifier(nullIdentifier);
        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        QueryRequest.LimitOffset limitOffsetWrapper = new QueryRequest.LimitOffset();
        LimitOffset limitOffset = new LimitOffset();
        limitOffsetWrapper.setLimitOffset(limitOffset);
        request.setLimitOffset(limitOffsetWrapper);

        QueryResponse response = port.query(request);
        assertEquals(1, response.getHealthCareProvider().size());

        String retrievedExtension = response.getHealthCareProvider().get(0).getIdentifier().getItem().get(0).getExtension();
        assertEquals(extensions.get(0), retrievedExtension);
    }

    private void patchInstance(Long id) {
        //update bo to allow for updating status
        Transaction transaction = PoHibernateUtil.getCurrentSession().beginTransaction();

        try {
            gov.nih.nci.po.data.bo.HealthCareProvider instance
                    = (gov.nih.nci.po.data.bo.HealthCareProvider) PoHibernateUtil.getCurrentSession().get(gov.nih.nci.po.data.bo.HealthCareProvider.class, id);

            Ii ctepIdentifier = new Ii();
            ctepIdentifier.setRoot(CtepOrganizationImporter.CTEP_ORG_ROOT);
            ctepIdentifier.setExtension("CTEP_EXTENSION");
            instance.getOtherIdentifiers().add(ctepIdentifier);


            PoHibernateUtil.getCurrentSession().save(instance);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testUpdate() throws EntityValidationFaultFaultMessage, NullifiedRoleFaultFaultMessage {
        //create an instace in the pending state
        HealthCareProvider payload = generateNewHealthCareProvider();
        CreateRequest request = new CreateRequest();
        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        CreateResponse response = port.create(request);

        //update status
        UpdateRequest updateRequest = new UpdateRequest();
        UpdateRequest.HealthCareProvider updatePayloadWrapper = new UpdateRequest.HealthCareProvider();

        HealthCareProvider updatePayload = retrieve(response.getId());
        CD status = new CD();
        status.setCode("ACTIVE");
        updatePayload.setStatus(status);

        updatePayloadWrapper.setHealthCareProvider(updatePayload);
        updateRequest.setHealthCareProvider(updatePayloadWrapper);

        UpdateResponse updateResponse = port.update(updateRequest);
        assertNotNull(updateResponse);

    }



    @Test
    public void testUpdateStatus() throws EntityValidationFaultFaultMessage {
        //create an instance in the pending state
        HealthCareProvider payload = generateNewHealthCareProvider();

        CreateRequest request = new CreateRequest();
        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
        payloadWrapper.setHealthCareProvider(payload);
        request.setHealthCareProvider(payloadWrapper);

        CreateResponse response = port.create(request);

        //update it to active
        UpdateStatusRequest updateStatusRequest = new UpdateStatusRequest();

        UpdateStatusRequest.TargetId targetId = new UpdateStatusRequest.TargetId();
        Ii ii = new IdConverter.HealthCareProviderIdConverter().convertToIi(Long.parseLong(response.getId().getExtension()));
        targetId.setId(IdTransformer.INSTANCE.toXml(ii));
        updateStatusRequest.setTargetId(targetId);

        UpdateStatusRequest.StatusCode statusCode = new UpdateStatusRequest.StatusCode();
        statusCode.setCd( new Cd() );
        statusCode.getCd().setCode("ACTIVE");
        updateStatusRequest.setStatusCode(statusCode);

        UpdateStatusResponse updateStatusResponse = port.updateStatus(updateStatusRequest);
        assertNotNull(updateStatusResponse);
    }

    @Test
    public void testValidate() {
        //validate a valid instance
        HealthCareProvider validInstance = generateNewHealthCareProvider();

        ValidateRequest validateRequest = new ValidateRequest();
        ValidateRequest.HealthCareProvider payloadWrapper = new ValidateRequest.HealthCareProvider();
        payloadWrapper.setHealthCareProvider(validInstance);
        validateRequest.setHealthCareProvider(payloadWrapper);

        ValidateResponse validateResponse = port.validate(validateRequest);

        assertEquals(0, validateResponse.getStringMap().getEntry().size());
    }

    @Test
    public void testValidateWithErrors() {
        HealthCareProvider invalidInstance = generateNewHealthCareProvider();
        invalidInstance.setPlayerIdentifier(null);

        ValidateRequest validateRequest = new ValidateRequest();
        ValidateRequest.HealthCareProvider payloadWrapper = new ValidateRequest.HealthCareProvider();
        payloadWrapper.setHealthCareProvider(invalidInstance);
        validateRequest.setHealthCareProvider(payloadWrapper);

        ValidateResponse validateResponse = port.validate(validateRequest);

        assertEquals(1, validateResponse.getStringMap().getEntry().size());

        StringMapType.Entry error = validateResponse.getStringMap().getEntry().get(0);
        assertEquals("player", error.getKey());
        assertEquals(1, error.getValue().size());
        assertEquals("must be set", error.getValue().get(0));
    }

    private List<HealthCareProvider> generateNewStaffs(int count) {
        List<HealthCareProvider> results = new ArrayList<HealthCareProvider>();

        for (int i=0; i<count; i++) {
            results.add(generateNewHealthCareProvider());
        }

        return results;
    }

    private final HealthCareProvider generateNewHealthCareProvider() {
        HealthCareProvider payload = new HealthCareProvider();

        //empty identifier
        payload.setIdentifier(new DSETII());

        II playerIdentifier = new II();
        playerIdentifier.setRoot(IdConverter.PERSON_ROOT);
        playerIdentifier.setIdentifierName(IdConverter.PERSON_IDENTIFIER_NAME);
        playerIdentifier.setExtension(Long.toString(createNewPerson()));
        payload.setPlayerIdentifier(playerIdentifier);

        II scoperIdentifier = new II();
        scoperIdentifier.setRoot(IdConverter.ORG_ROOT);
        scoperIdentifier.setIdentifierName(IdConverter.ORG_IDENTIFIER_NAME);
        scoperIdentifier.setExtension(Long.toString(createNewOrganization()));
        payload.setScoperIdentifier(scoperIdentifier);

        Address address = new Address();
        address.setCityOrMunicipality("Herndon");
        address.setCountry(USA);
        address.setPostalCode("20171");
        address.setStreetAddressLine("123 Elm St");
        address.setStateOrProvince("VA");

        DSet<Ad> dsetAd = new DSet<Ad>();
        dsetAd.setItem( new HashSet<Ad>());
        dsetAd.getItem().add(AddressConverter.SimpleConverter.convertToAd(address));
        DSETAD addressXml = DSETADTransformer.INSTANCE.toXml(dsetAd);
        payload.setPostalAddress(addressXml);


        payload.setTelecomAddress(new DSETTEL());
        //add a phonenumber
        Tel telephone = new TelPhone();
        telephone.setValue(URI.create("tel:555-555-5555"));
        TEL telephoneXml = null;
        try {
            telephoneXml = TELTransformer.INSTANCE.toXml(telephone);
        } catch (DtoTransformException e) {
            throw new RuntimeException(e);
        }

        payload.getTelecomAddress().getItem().add(telephoneXml);
        payload.getTelecomAddress().setNullFlavor(null);
        CD status = new CD();
        status.setCode("pending");
        payload.setStatus(status);

        return payload;
    }

    private HealthCareProvider retrieve(Id id) throws NullifiedRoleFaultFaultMessage {
        GetByIdRequest getByIdRequest = new GetByIdRequest();
        getByIdRequest.setId(new GetByIdRequest.Id());
        getByIdRequest.getId().setId(id);

        GetByIdResponse getByIdResponse = port.getById(getByIdRequest);

        return getByIdResponse.getHealthCareProvider();
    }

    private void store(HealthCareProvider healthCareProvider) throws EntityValidationFaultFaultMessage {
        CreateRequest request = new CreateRequest();
        CreateRequest.HealthCareProvider payloadWrapper = new CreateRequest.HealthCareProvider();
        payloadWrapper.setHealthCareProvider(healthCareProvider);
        port.create(request);
    }
}
