/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * FamilyOrganizationRelationship class.
 * <p> 
 * Please see the documentation for the original FamilyOrganizationRelationship
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.FamilyOrganizationRelationship
 */

public  class FamilyOrganizationRelationshipDTO 
  extends java.lang.Object 
  implements Serializable, gov.nih.nci.services.PoDto {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public FamilyOrganizationRelationshipDTO () { }

          private gov.nih.nci.iso21090.Ii m_identifier;

  public gov.nih.nci.iso21090.Ii getIdentifier() {
    return m_identifier;
  }

  public void setIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_identifier = obj;
  }

          private gov.nih.nci.iso21090.Ii m_familyIdentifier;

  public gov.nih.nci.iso21090.Ii getFamilyIdentifier() {
    return m_familyIdentifier;
  }

  public void setFamilyIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_familyIdentifier = obj;
  }

          private gov.nih.nci.iso21090.Ii m_orgIdentifier;

  public gov.nih.nci.iso21090.Ii getOrgIdentifier() {
    return m_orgIdentifier;
  }

  public void setOrgIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_orgIdentifier = obj;
  }

          private gov.nih.nci.iso21090.Cd m_functionalType;

  public gov.nih.nci.iso21090.Cd getFunctionalType() {
    return m_functionalType;
  }

  public void setFunctionalType(gov.nih.nci.iso21090.Cd obj) {
    m_functionalType = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}