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
package gov.nih.nci.po.web.curation;

import gov.nih.nci.po.data.bo.OrganizationRelationship;
import gov.nih.nci.po.util.PoRegistry;
import gov.nih.nci.po.web.util.PoHttpSessionUtil;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.fiveamsolutions.nci.commons.web.struts2.action.ActionHelper;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.Validateable;
import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

/**
 * Action class to handle curation of organization relationships.
 *
 * @author Abraham J. Evans-EL <aevansel@5amsolutions.com>
 */
public class CurateOrganizationRelationshipAction extends ActionSupport implements Preparable, Validateable {
    private static final long serialVersionUID = 1L;
    private String rootKey;
    private OrganizationRelationship orgRelationship = new OrganizationRelationship();
    private OrganizationRelationship newOrgRelationship = new OrganizationRelationship();
    private boolean passedValidation = false;

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate() {
        super.validate();
        if (getOrgRelationship().getEndDate() == null) {
            addFieldError("orgRelationship.endDate", getText("errors.required", new String[] {"End Date"}));
        }
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("PMD.SignatureDeclareThrowsException")
    public void prepare() throws Exception {
        if (StringUtils.isNotEmpty(getRootKey())) {
            setOrgRelationship((OrganizationRelationship) PoHttpSessionUtil.getSession().getAttribute(getRootKey()));
        }
    }

    /**
     * Loads the organization relationship in preparation for changing it.
     * @return input
     */
    @Override
    public String input() {
        setOrgRelationship(PoRegistry.getOrganizationRelationshipService().getById(getOrgRelationship().getId()));
        setRootKey(PoHttpSessionUtil.addAttribute(getOrgRelationship()));

        getNewOrgRelationship().setStartDate(new Date());
        getNewOrgRelationship().setFamily(getOrgRelationship().getFamily());
        getNewOrgRelationship().setOrganization(getOrgRelationship().getOrganization());
        getNewOrgRelationship().setRelatedOrganization(getOrgRelationship().getRelatedOrganization());
        return INPUT;
    }

    /**
     * Creates the new organization relationship, making the old relationship inactive.
     * @return success
     */
    @Validations(customValidators = @CustomValidator(type = "hibernate", fieldName = "orgRelationship"))
    public String update() {
        
        if (getOrgRelationship().getEndDate().after(
                getNewOrgRelationship().getStartDate())) {
            addFieldError("newOrgRelationship.startDate",
                    "Start date for new relationship is before end date of old relationship.");
            setPassedValidation(false);
            return SUCCESS; 
        }
        
        PoRegistry.getOrganizationRelationshipService().updateEntity(getOrgRelationship());
        OrganizationRelationship related =
            PoRegistry.getOrganizationRelationshipService().getActiveOrganizationRelationship(
                    getOrgRelationship().getFamily().getId(), getOrgRelationship().getRelatedOrganization().getId(),
                    getOrgRelationship().getOrganization().getId());
        related.setEndDate(getOrgRelationship().getEndDate());

        PoRegistry.getOrganizationRelationshipService().updateEntity(related);

        getNewOrgRelationship().setFamily(getOrgRelationship().getFamily());
        getNewOrgRelationship().setOrganization(getOrgRelationship().getOrganization());
        getNewOrgRelationship().setRelatedOrganization(getOrgRelationship().getRelatedOrganization());

        PoRegistry.getOrganizationRelationshipService().create(getNewOrgRelationship());
        setPassedValidation(true);
        ActionHelper.saveMessage(getText("organizationRelationship.change.success"));
        return SUCCESS;
    }

    /**
     * @return the rootKey
     */
    public String getRootKey() {
        return rootKey;
    }

    /**
     * @param rootKey the rootKey to set
     */
    public void setRootKey(String rootKey) {
        this.rootKey = rootKey;
    }

    /**
     * @return the orgRelationship
     */
    public OrganizationRelationship getOrgRelationship() {
        return orgRelationship;
    }

    /**
     * @param orgRelationship the orgRelationship to set
     */
    public void setOrgRelationship(OrganizationRelationship orgRelationship) {
        this.orgRelationship = orgRelationship;
    }

    /**
     * @return the newOrgRelationship
     */
    public OrganizationRelationship getNewOrgRelationship() {
        return newOrgRelationship;
    }

    /**
     * @param newOrgRelationship the newOrgRelationship to set
     */
    public void setNewOrgRelationship(OrganizationRelationship newOrgRelationship) {
        this.newOrgRelationship = newOrgRelationship;
    }

    /**
     * @return the passedValidation
     */
    public boolean isPassedValidation() {
        return passedValidation;
    }

    /**
     * @param passedValidation the passedValidation to set
     */
    public void setPassedValidation(boolean passedValidation) {
        this.passedValidation = passedValidation;
    }
}