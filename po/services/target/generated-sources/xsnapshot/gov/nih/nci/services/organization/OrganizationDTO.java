/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.organization;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * Organization class.
 * <p> 
 * Please see the documentation for the original Organization
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.Organization
 */

public  class OrganizationDTO 
  extends gov.nih.nci.services.organization.AbstractOrganizationDTO 
  implements Serializable {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public OrganizationDTO () { }

          private gov.nih.nci.iso21090.Ts m_statusDate;

  public gov.nih.nci.iso21090.Ts getStatusDate() {
    return m_statusDate;
  }

  public void setStatusDate(gov.nih.nci.iso21090.Ts obj) {
    m_statusDate = obj;
  }

          private gov.nih.nci.iso21090.DSet m_familyOrganizationRelationships;

  public gov.nih.nci.iso21090.DSet getFamilyOrganizationRelationships() {
    return m_familyOrganizationRelationships;
  }

  public void setFamilyOrganizationRelationships(gov.nih.nci.iso21090.DSet obj) {
    m_familyOrganizationRelationships = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}