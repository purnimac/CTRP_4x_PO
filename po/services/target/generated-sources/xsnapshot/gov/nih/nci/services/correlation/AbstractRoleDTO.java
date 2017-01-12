/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractRole class.
 * <p> 
 * Please see the documentation for the original AbstractRole
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractRole
 */

public abstract class AbstractRoleDTO 
  extends gov.nih.nci.services.correlation.AbstractBaseRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public AbstractRoleDTO () { }

          private gov.nih.nci.iso21090.Cd m_status;

  public gov.nih.nci.iso21090.Cd getStatus() {
    return m_status;
  }

  public void setStatus(gov.nih.nci.iso21090.Cd obj) {
    m_status = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}