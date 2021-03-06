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

import gov.nih.nci.iso21090.IdentifierReliability;
import gov.nih.nci.iso21090.Ii;
import gov.nih.nci.po.data.bo.IdentifiedPerson;
import gov.nih.nci.po.data.bo.IdentifiedPersonCR;
import gov.nih.nci.po.data.bo.Organization;
import gov.nih.nci.po.data.bo.Person;
import gov.nih.nci.po.service.AnnotatedBeanSearchCriteria;
import gov.nih.nci.po.service.IdentifiedPersonServiceLocal;
import gov.nih.nci.po.service.IdentifiedPersonSortCriterion;
import gov.nih.nci.po.util.PoRegistry;
import gov.nih.nci.po.web.util.validator.Addressable;
import gov.nih.nci.security.exceptions.CSException;

import java.util.ArrayList;
import java.util.Set;

import javax.jms.JMSException;

import org.apache.commons.collections.set.ListOrderedSet;
import org.displaytag.properties.SortOrderEnum;

import com.fiveamsolutions.nci.commons.search.SearchCriteria;
import com.fiveamsolutions.nci.commons.web.displaytag.PaginatedList;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.validator.annotations.CustomValidator;
import com.opensymphony.xwork2.validator.annotations.ValidationParameter;
import com.opensymphony.xwork2.validator.annotations.Validations;

/**
 * Action to manage IdentifiedOrganization(s).
 *
 * @author smatyas
 */
public class IdentifiedPersonAction
    extends AbstractPersonRoleAction<IdentifiedPerson, IdentifiedPersonCR,
        IdentifiedPersonServiceLocal>
    implements Addressable, Preparable {

    private static final long serialVersionUID = 1L;
    private IdentifiedPerson role = new IdentifiedPerson();
    private IdentifiedPerson duplicateOf = new IdentifiedPerson();
    private IdentifiedPersonCR cr = new IdentifiedPersonCR();

    /**
     * {@inheritDoc}
     */
    @Override
    public void prepare() {
        super.prepare();
        if (getRole() == null) {
            setRole(new IdentifiedPerson());
        }

        if (getRole().getPlayer() == null) { //if not set, then set to default
            getRole().setPlayer(getPerson());
        }
        if (getRole().getScoper() == null) { //if not set, then set to default
            getRole().setScoper(new Organization());
        }
        if (getRole().getAssignedIdentifier() == null) { //if not set, then set to default
            getRole().setAssignedIdentifier(new Ii());
        }
        getRole().getAssignedIdentifier().setNullFlavor(null);
    }

    /**
     * {@inheritDoc}
     */
    public IdentifiedPerson getRole() {
        return role;
    }


    /**
     * {@inheritDoc}
     */
    public void setRole(IdentifiedPerson role) {
        this.role = role;
    }

    /**
     * {@inheritDoc}
     */
    public IdentifiedPersonCR getCr() {
        return cr;
    }

    /**
     * {@inheritDoc}
     */
    public void setCr(IdentifiedPersonCR cr) {
        this.cr = cr;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentifiedPersonCR getBaseCr() {
        return getCr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IdentifiedPerson getBaseRole() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBaseCr(IdentifiedPersonCR basecr) {
        setCr(basecr);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBaseRole(IdentifiedPerson baseRole) {
        setRole(baseRole);
    }

    /**
     * {@inheritDoc}
     * @throws CSException CSException
     */
    @Validations(
        customValidators = { @CustomValidator(type = "hibernate", fieldName = "role" ,
                parameters = { @ValidationParameter(name = "resourceKeyBase", value = "identifiedPerson") }),
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
                parameters = { @ValidationParameter(name = "resourceKeyBase", value = "identifiedPerson") }),
                @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.phone",
                        message = "US and Canadian telephone numbers must match ###-###-####(x#*).") ,
                @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.fax",
                        message = "US and Canadian fax numbers must match ###-###-####(x#*)."),
                @CustomValidator(type = USORCANADAVALIDATOR, fieldName = "role.tty",
                        message = "US and Canadian tty numbers must match ###-###-####(x#*).")
            })
    @Override
    public String edit() throws JMSException {
        // PO-1098 - for some reason, the duplicate of wasn't getting set properly by struts when we tried to
        // set person.duplicateOf.id directly, so we're setting it manually
        if (duplicateOf != null && duplicateOf.getId() != null) {
            role.setDuplicateOf(duplicateOf);
        }
        return super.edit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected SearchCriteria<IdentifiedPerson> getDuplicateCriteria() {
        IdentifiedPerson dupOfBOCrit = new IdentifiedPerson();
        AnnotatedBeanSearchCriteria<IdentifiedPerson> duplicateOfCriteria
            = new AnnotatedBeanSearchCriteria<IdentifiedPerson>(dupOfBOCrit);
        dupOfBOCrit.setPlayer(getPerson());
        return duplicateOfCriteria;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void defaultConstructorInit() {
        setResults(new PaginatedList<IdentifiedPerson>(0,
                new ArrayList<IdentifiedPerson>(), PoRegistry.DEFAULT_RECORDS_PER_PAGE, 1, null,
                IdentifiedPersonSortCriterion.ID.name(), SortOrderEnum.ASCENDING));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected IdentifiedPersonServiceLocal getRoleService() {
        return PoRegistry.getInstance().getServiceLocator().getIdentifiedPersonService();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected SearchCriteria<IdentifiedPerson> getSearchCriteria() {
        IdentifiedPerson boCrit = new IdentifiedPerson();
        AnnotatedBeanSearchCriteria<IdentifiedPerson> criteria
            = new AnnotatedBeanSearchCriteria<IdentifiedPerson>(boCrit);
        Person player = new Person();
        player.setId(getPerson().getId());
        boCrit.setPlayer(player);
        return criteria;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<IdentifiedPersonSortCriterion> getSortCriterion() {
        return IdentifiedPersonSortCriterion.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getAddSuccessMessageKey() {
        return "identifiedperson.create.success";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getEditSuccessMessageKey() {
        return "identifiedperson.update.success";
    }

    /**
     * @return the duplicateOf
     */
    public IdentifiedPerson getDuplicateOf() {
        return duplicateOf;
    }

    /**
     * @param duplicateOf the duplicateOf to set
     */
    public void setDuplicateOf(IdentifiedPerson duplicateOf) {
        this.duplicateOf = duplicateOf;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isUsOrCanadaFormat() {
        //IdentifiedPerson doesn't have an address, so this property isn't relevant
        return false;
    }

    /**
     * @return the allowable IdentifierReliability values
     */
    @SuppressWarnings("unchecked")
    public Set<IdentifierReliability> getAvailableReliability() {
        ListOrderedSet set = new ListOrderedSet();
        set.add(IdentifierReliability.UNV);
        set.add(IdentifierReliability.VRF);
        return set;
    }
}
