/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractOrganizationalContact class.
 * <p> 
 * Please see the documentation for the original AbstractOrganizationalContact
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractOrganizationalContact
 */

public abstract class AbstractOrganizationalContactDTO 
  extends gov.nih.nci.services.correlation.AbstractPersonRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 3L;

  /**
   * Default constructor.
   */
  public AbstractOrganizationalContactDTO () { }

          private gov.nih.nci.iso21090.Cd m_typeCode;

  public gov.nih.nci.iso21090.Cd getTypeCode() {
    return m_typeCode;
  }

  public void setTypeCode(gov.nih.nci.iso21090.Cd obj) {
    m_typeCode = obj;
  }

          private gov.nih.nci.iso21090.St m_title;

  public gov.nih.nci.iso21090.St getTitle() {
    return m_title;
  }

  public void setTitle(gov.nih.nci.iso21090.St obj) {
    m_title = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}