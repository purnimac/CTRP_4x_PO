/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractOversightCommittee class.
 * <p> 
 * Please see the documentation for the original AbstractOversightCommittee
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractOversightCommittee
 */

public abstract class AbstractOversightCommitteeDTO 
  extends gov.nih.nci.services.correlation.AbstractOrganizationRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public AbstractOversightCommitteeDTO () { }

          private gov.nih.nci.iso21090.Cd m_typeCode;

  public gov.nih.nci.iso21090.Cd getTypeCode() {
    return m_typeCode;
  }

  public void setTypeCode(gov.nih.nci.iso21090.Cd obj) {
    m_typeCode = obj;
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