/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractEnhancedOrganizationRole class.
 * <p> 
 * Please see the documentation for the original AbstractEnhancedOrganizationRole
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole
 */

public abstract class AbstractEnhancedOrganizationRoleDTO 
  extends gov.nih.nci.services.correlation.AbstractBaseEnhancedOrganizationRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 2L;

  /**
   * Default constructor.
   */
  public AbstractEnhancedOrganizationRoleDTO () { }

          private gov.nih.nci.iso21090.EnOn m_name;

  public gov.nih.nci.iso21090.EnOn getName() {
    return m_name;
  }

  public void setName(gov.nih.nci.iso21090.EnOn obj) {
    m_name = obj;
  }

          private gov.nih.nci.iso21090.DSet m_postalAddress;

  public gov.nih.nci.iso21090.DSet getPostalAddress() {
    return m_postalAddress;
  }

  public void setPostalAddress(gov.nih.nci.iso21090.DSet obj) {
    m_postalAddress = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}