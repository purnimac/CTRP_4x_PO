/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractResearchOrganization class.
 * <p> 
 * Please see the documentation for the original AbstractResearchOrganization
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractResearchOrganization
 */

public abstract class AbstractResearchOrganizationDTO 
  extends gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public AbstractResearchOrganizationDTO () { }

          private gov.nih.nci.iso21090.Cd m_fundingMechanism;

  public gov.nih.nci.iso21090.Cd getFundingMechanism() {
    return m_fundingMechanism;
  }

  public void setFundingMechanism(gov.nih.nci.iso21090.Cd obj) {
    m_fundingMechanism = obj;
  }

          private gov.nih.nci.iso21090.Cd m_typeCode;

  public gov.nih.nci.iso21090.Cd getTypeCode() {
    return m_typeCode;
  }

  public void setTypeCode(gov.nih.nci.iso21090.Cd obj) {
    m_typeCode = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}