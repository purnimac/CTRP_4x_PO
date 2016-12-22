package gov.nih.nci.po.webservices.service.bo;

import gov.nih.nci.po.data.bo.AbstractIdentifiedEntity;
import gov.nih.nci.po.data.bo.AbstractIdentifiedOrganization;
import gov.nih.nci.po.data.bo.AbstractRole;
import gov.nih.nci.po.data.bo.IdentifiedOrganization;
import gov.nih.nci.po.data.bo.IdentifiedOrganizationCR;
import gov.nih.nci.po.data.bo.Organization;
import gov.nih.nci.po.data.bo.RoleStatus;
import gov.nih.nci.po.service.EntityValidationException;
import gov.nih.nci.po.service.GenericStructrualRoleCRServiceLocal;
import gov.nih.nci.po.service.GenericStructrualRoleServiceLocal;
import gov.nih.nci.po.webservices.service.bridg.ModelUtils;
import gov.nih.nci.security.authorization.domainobjects.User;
import org.junit.Test;

import javax.jms.JMSException;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Jason Aliyetti <jason.aliyetti@semanticbits.com>
 */
public class IdentifiedOrganizationBoServiceTest extends AbstractRoleBoServiceTest<IdentifiedOrganization, IdentifiedOrganizationCR> {
    @Override
    protected void initServiceUnderTest() {
        this.service = new IdentifiedOrganizationBoService();
    }

    @Override
    protected IdentifiedOrganization getBasicModel() {
        return ModelUtils.getBasicIdentifiedOrganization();
    }

    @Override
    protected GenericStructrualRoleServiceLocal<IdentifiedOrganization> getEjbService() {
        return serviceLocator.getIdentifiedOrganizationService();
    }

    @Override
    protected GenericStructrualRoleCRServiceLocal<IdentifiedOrganizationCR> getCrService() {
        return serviceLocator.getIdentifiedOrganizationCRService();
    }

    /*
     * Override tests
     */
    @Test
    public void testUpdateOwnOverridden() throws JMSException, EntityValidationException {
        User otherUser = new User();
        otherUser.setLoginName("otherUser");

        IdentifiedOrganization currentInstance = getBasicModel();
        ((AbstractRole) currentInstance).setId(1L);
        ((AbstractRole) currentInstance).setCreatedBy(me);
        ((AbstractIdentifiedOrganization) currentInstance).setOverriddenBy(otherUser);

        IdentifiedOrganization updatedInstance = getBasicModel();
        ((AbstractRole) updatedInstance).setId(1L);
        updatedInstance.setStatus(RoleStatus.NULLIFIED);

        when(getEjbService().getById(1L))
                .thenReturn(currentInstance);


        if (currentInstance instanceof AbstractIdentifiedEntity) {
            Organization organization = ((AbstractIdentifiedEntity)updatedInstance).getScoper();
            organization.setId(2L);
            when(serviceLocator.getOrganizationService().getById(2L))
                    .thenReturn(organization);
        }

        service.curate(updatedInstance);

        verify(getEjbService(), never()).curate(updatedInstance);
        verify(getCrService()).create((IdentifiedOrganizationCR)any());

    }

    @Test
    public void testUpdateOverriddenWithNoChange() throws JMSException, EntityValidationException {
        User otherUser = new User();
        otherUser.setLoginName("otherUser");

        IdentifiedOrganization currentInstance = getBasicModel();
        ((AbstractRole) currentInstance).setId(1L);
        ((AbstractRole) currentInstance).setCreatedBy(me);
        ((AbstractIdentifiedOrganization) currentInstance).setOverriddenBy(otherUser);

        IdentifiedOrganization updatedInstance = getBasicModel();
        ((AbstractRole) updatedInstance).setId(1L);

        when(getEjbService().getById(1L))
                .thenReturn(currentInstance);


        if (currentInstance instanceof AbstractIdentifiedEntity) {
            Organization organization = ((AbstractIdentifiedEntity)updatedInstance).getScoper();
            organization.setId(2L);
            when(serviceLocator.getOrganizationService().getById(2L))
                    .thenReturn(organization);
        }

        service.curate(updatedInstance);

        verify(getEjbService(), never()).curate(updatedInstance);
        verify(getCrService(), never()).create((IdentifiedOrganizationCR)any());
    }
}
