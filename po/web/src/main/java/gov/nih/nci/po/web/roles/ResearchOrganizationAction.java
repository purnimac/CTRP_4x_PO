/**
 * The software subject to this notice and license includes both human readable
 * source code form and machine readable, binary, object code form. The po
 * Software was developed in conjunction with the National Cancer Institute
 * (NCI) by NCI employees and 5AM Solutions, Inc. (5AM). To the extent
 * government employees are authors, any rights in such works shall be subject
 * to Title 17 of the United States Code, section 105.
 *
 * This po Software License (the License) is between NCI and You. You (or
 * Your) shall mean a person or an entity, and all other entities that control,
 * are controlled by, or are under common control with the entity. Control for
 * purposes of this definition means (i) the direct or indirect power to cause
 * the direction or management of such entity, whether by contract or otherwise,
 * or (ii) ownership of fifty percent (50%) or more of the outstanding shares,
 * or (iii) beneficial ownership of such entity.
 *
 * This License is granted provided that You agree to the conditions described
 * below. NCI grants You a non-exclusive, worldwide, perpetual, fully-paid-up,
 * no-charge, irrevocable, transferable and royalty-free right and license in
 * its rights in the po Software to (i) use, install, access, operate,
 * execute, copy, modify, translate, market, publicly display, publicly perform,
 * and prepare derivative works of the po Software; (ii) distribute and
 * have distributed to and by third parties the po Software and any
 * modifications and derivative works thereof; and (iii) sublicense the
 * foregoing rights set out in (i) and (ii) to third parties, including the
 * right to license such rights to further third parties. For sake of clarity,
 * and not by way of limitation, NCI shall have no right of accounting or right
 * of payment from You or Your sub-licensees for the rights granted under this
 * License. This License is granted at no charge to You.
 *
 * Your redistributions of the source code for the Software must retain the
 * above copyright notice, this list of conditions and the disclaimer and
 * limitation of liability of Article 6, below. Your redistributions in object
 * code form must reproduce the above copyright notice, this list of conditions
 * and the disclaimer of Article 6 in the documentation and/or other materials
 * provided with the distribution, if any.
 *
 * Your end-user documentation included with the redistribution, if any, must
 * include the following acknowledgment: This product includes software
 * developed by 5AM and the National Cancer Institute. If You do not include
 * such end-user documentation, You shall include this acknowledgment in the
 * Software itself, wherever such third-party acknowledgments normally appear.
 *
 * You may not use the names "The National Cancer Institute", "NCI", or "5AM"
 * to endorse or promote products derived from this Software. This License does
 * not authorize You to use any trademarks, service marks, trade names, logos or
 * product names of either NCI or 5AM, except as required to comply with the
 * terms of this License.
 *
 * For sake of clarity, and not by way of limitation, You may incorporate this
 * Software into Your proprietary programs and into any third party proprietary
 * programs. However, if You incorporate the Software into third party
 * proprietary programs, You agree that You are solely responsible for obtaining
 * any permission from such third parties required to incorporate the Software
 * into such third party proprietary programs and for informing Your
 * sub-licensees, including without limitation Your end-users, of their
 * obligation to secure any required permissions from such third parties before
 * incorporating the Software into such third party proprietary software
 * programs. In the event that You fail to obtain such permissions, You agree
 * to indemnify NCI for any claims against NCI by such third parties, except to
 * the extent prohibited by law, resulting from Your failure to obtain such
 * permissions.
 *
 * For sake of clarity, and not by way of limitation, You may add Your own
 * copyright statement to Your modifications and to the derivative works, and
 * You may provide additional or different license terms and conditions in Your
 * sublicenses of modifications of the Software, or any derivative works of the
 * Software as a whole, provided Your use, reproduction, and distribution of the
 * Work otherwise complies with the conditions stated in this License.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS," AND ANY EXPRESSED OR IMPLIED WARRANTIES,
 * (INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE) ARE DISCLAIMED. IN NO
 * EVENT SHALL THE NATIONAL CANCER INSTITUTE, 5AM SOLUTIONS, INC. OR THEIR
 * AFFILIATES BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package gov.nih.nci.po.web.roles;

import com.fiveamsolutions.nci.commons.search.SearchCriteria;
import com.fiveamsolutions.nci.commons.web.displaytag.PaginatedList;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import com.opensymphony.xwork2.validator.annotations.ValidationParameter;
import com.opensymphony.xwork2.validator.annotations.Validations;
import gov.nih.nci.po.data.bo.Organization;
import gov.nih.nci.po.data.bo.ResearchOrganization;
import gov.nih.nci.po.data.bo.ResearchOrganizationCR;
import gov.nih.nci.po.data.bo.ResearchOrganizationType;
import gov.nih.nci.po.data.bo.RoleStatus;
import gov.nih.nci.po.service.AnnotatedBeanSearchCriteria;
import gov.nih.nci.po.service.ResearchOrganizationServiceLocal;
import gov.nih.nci.po.service.ResearchOrganizationSortCriterion;
import gov.nih.nci.po.util.PoRegistry;
import gov.nih.nci.po.web.util.PoHttpSessionUtil;
import gov.nih.nci.po.web.util.validator.Addressable;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.exceptions.CSException;
import org.displaytag.properties.SortOrderEnum;

import javax.jms.JMSException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Action to manage ResearchOrganization(s).
 *
 * @author smatyas
 * @author Rohit Gupta
 */
public class ResearchOrganizationAction
    extends AbstractOrganizationRoleAction<ResearchOrganization, ResearchOrganizationCR,
        ResearchOrganizationServiceLocal>
    implements Addressable, Preparable {

    private static final long serialVersionUID = 1L;
    private ResearchOrganization role = new ResearchOrganization();
    private ResearchOrganization duplicateOf = new ResearchOrganization();
    private ResearchOrganizationCR cr = new ResearchOrganizationCR();
    @SuppressWarnings("deprecation")
    private ResearchOrganizationType researchOrganizationType = new ResearchOrganizationType();
    private String rootKey;


    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("PMD.SignatureDeclareThrowsException")
    public void prepare() {
        super.prepare();
        if (getRootKey() != null) {
            role = (ResearchOrganization) getSession().getAttribute(getRootKey());
        }
        if (getRole() == null) {
            setRole(new ResearchOrganization());
        }

        if (getRole().getPlayer() == null) { //if not set, then set to default
            getRole().setPlayer(getOrganization());
        }

        if (getResearchOrganizationType().getId() != null) {
            setResearchOrganizationType(PoRegistry.getInstance().getServiceLocator().getGenericService()
                    .getPersistentObject(ResearchOrganizationType.class, getResearchOrganizationType().getId()));
        } else {
            setResearchOrganizationType(getRole().getTypeCode());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String input() {
        String result = super.input();
        initializeCollections(getRole());
        initialize(getRole());
        setRootKey(PoHttpSessionUtil.addAttribute(getRole()));
        return result;
    }

    /**
     *
     * {@inheritDoc}
     * @throws CSException CSException
     */
    @Validations(
        customValidators = { @CustomValidator(type = "hibernate", fieldName = "role" ,
                parameters = { @ValidationParameter(name = "resourceKeyBase", value = "researchOrganization") }),
        @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.phone",
                message = "US and Canadian telephone numbers must match ###-###-####(x#*).") ,
        @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.fax",
                message = "US and Canadian fax numbers must match ###-###-####(x#*)."),
        @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.tty",
                message = "US and Canadian tty numbers must match ###-###-####(x#*).")
        })
    @Override
    public String add() throws JMSException, CSException {
        return super.add();
    }

    /**
     * {@inheritDoc}
     */
    @Validations(
        customValidators = { @CustomValidator(type = "hibernate", fieldName = "role" ,
                parameters = { @ValidationParameter(name = "resourceKeyBase", value = "researchOrganization") }),
        @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.phone",
                message = "US and Canadian telephone numbers must match ###-###-####(x#*).") ,
        @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.fax",
                message = "US and Canadian fax numbers must match ###-###-####(x#*)."),
        @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.tty",
                message = "US and Canadian tty numbers must match ###-###-####(x#*).")
    })
    @Override
    public String edit() throws JMSException {

        if (role.getPriorStatus() != RoleStatus.ACTIVE
                && role.getStatus() == RoleStatus.ACTIVE
                && !transitionToActiveAllowed()) {
            LOG.warn(
                    String.format(
                            "Illegal attempt to update status from %s to %s",
                            role.getPriorStatus().name(),
                            role.getStatus().name()
                    )
            );

            return ERROR;
        }

        // PO-1098 - for some reason, the duplicate of wasn't getting set properly by struts when we tried to
        // set person.duplicateOf.id directly, so we're setting it manually
        if (duplicateOf != null && duplicateOf.getId() != null) {
            role.setDuplicateOf(duplicateOf);
        }
        return super.edit();
    }

    /**
     * Override method.
     * @return input
     * @throws CSException JMSException
     */
    public String override() throws CSException {        
        User overriddenBy = getLoggedInUser();                
        getRoleService().override(role, overriddenBy);            
        return input();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected SearchCriteria<ResearchOrganization> getDuplicateCriteria() {
        ResearchOrganization dupOfBOCrit = new ResearchOrganization();
        AnnotatedBeanSearchCriteria<ResearchOrganization> duplicateOfCriteria
            = new AnnotatedBeanSearchCriteria<ResearchOrganization>(dupOfBOCrit);
        dupOfBOCrit.setPlayer(getOrganization());
        return duplicateOfCriteria;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void defaultConstructorInit() {
        setResults(new PaginatedList<ResearchOrganization>(0,
                new ArrayList<ResearchOrganization>(), PoRegistry.DEFAULT_RECORDS_PER_PAGE, 1, null,
                ResearchOrganizationSortCriterion.ID.name(), SortOrderEnum.ASCENDING));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ResearchOrganizationServiceLocal getRoleService() {
        return PoRegistry.getInstance().getServiceLocator().getResearchOrganizationService();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected SearchCriteria<ResearchOrganization> getSearchCriteria() {
        ResearchOrganization boCrit = new ResearchOrganization();
        AnnotatedBeanSearchCriteria<ResearchOrganization> criteria
            = new AnnotatedBeanSearchCriteria<ResearchOrganization>(boCrit);
        Organization player = new Organization();
        player.setId(getOrganization().getId());
        boCrit.setPlayer(player);
        return criteria;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<ResearchOrganizationSortCriterion> getSortCriterion() {
        return ResearchOrganizationSortCriterion.class;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected String getAddSuccessMessageKey() {
        return "researchorganization.create.success";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getEditSuccessMessageKey() {
        return "researchorganization.update.success";
    }


    /**
     * @return ResearchOrganizationType.code
     */
    public ResearchOrganizationType getResearchOrganizationType() {
        return researchOrganizationType;
    }

    /**
     * @param researchOrganizationType used to specified ResearchOrganizationType.code for
     *            changeResearchOrganizationType()
     */
    public void setResearchOrganizationType(ResearchOrganizationType researchOrganizationType) {
        this.researchOrganizationType = researchOrganizationType;
    }

    /**
     * @return 'changeResearchOrganizationType' result
     */
    public String changeResearchOrganizationType() {
        return "changeResearchOrganizationType";
    }

    /**
     * @return the duplicateOf
     */
    public ResearchOrganization getDuplicateOf() {
        return duplicateOf;
    }

    /**
     * @param duplicateOf the duplicateOf to set
     */
    public void setDuplicateOf(ResearchOrganization duplicateOf) {
        this.duplicateOf = duplicateOf;
    }

    /**
     * Get the ResearchOrganization.
     * @return the ResearchOrganization
     */
    public ResearchOrganization getRole() {
        return role;
    }

    /**
     * Set the ResearchOrganization to use.
     * @param role ResearchOrganization to use
     */
    public void setRole(ResearchOrganization role) {
        this.role = role;
    }

    /**
     * Get the change request.
     * @return change request
     */
    public ResearchOrganizationCR getCr() {
        return cr;
    }

    /**
     * Set the change request.
     * @param cr change request
     */
    public void setCr(ResearchOrganizationCR cr) {
        this.cr = cr;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public ResearchOrganizationCR getBaseCr() {
        return getCr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResearchOrganization getBaseRole() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBaseCr(ResearchOrganizationCR baseCr) {
        setCr(baseCr);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBaseRole(ResearchOrganization baseRole) {
        setRole(baseRole);
    }

    /**
     *
     * @return the session key of the root object (org or person)
     */
    public String getRootKey() {
        return rootKey;
    }

    /**
     *
     * @param rootKey the session key of the root object.
     */
    public void setRootKey(String rootKey) {
        PoHttpSessionUtil.validateSessionKey(rootKey);
        this.rootKey = rootKey;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isUsOrCanadaFormat() {
        return role.isUsOrCanadaAddress();
    }

    @Override
    public Collection<RoleStatus> getAvailableStatus() {
        final List<RoleStatus> result = new ArrayList<RoleStatus>();
        if (getRole().isCtepOwned()) {
            result.add(getRole().getPriorStatus());
        } else {
            result.addAll(super.getAvailableStatus());
            if (role.getPriorStatus() != RoleStatus.ACTIVE) {
                result.remove(RoleStatus.ACTIVE);
            }
        }
        // PO-8000: if there is unprocessed CR that specifies a new status
        // that's not in the list,
        // Curators are going to be completely blocked from accepting the CR. To
        // avoid this, add the new status
        // to the list of available statuses.
        if (transitionToActiveAllowed()
                && !result.contains(getCr().getStatus())) {
            result.add(getCr().getStatus());
        }
        return result;
    }

   
}
