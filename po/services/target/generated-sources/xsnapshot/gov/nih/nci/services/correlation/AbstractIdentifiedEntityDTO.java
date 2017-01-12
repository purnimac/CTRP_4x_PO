/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractIdentifiedEntity class.
 * <p> 
 * Please see the documentation for the original AbstractIdentifiedEntity
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractIdentifiedEntity
 */

public abstract class AbstractIdentifiedEntityDTO 
  extends gov.nih.nci.services.correlation.AbstractRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 2L;

  /**
   * Default constructor.
   */
  public AbstractIdentifiedEntityDTO () { }

          private gov.nih.nci.iso21090.Ii m_scoperIdentifier;

  public gov.nih.nci.iso21090.Ii getScoperIdentifier() {
    return m_scoperIdentifier;
  }

  public void setScoperIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_scoperIdentifier = obj;
  }

          private gov.nih.nci.iso21090.Ii m_assignedId;

  public gov.nih.nci.iso21090.Ii getAssignedId() {
    return m_assignedId;
  }

  public void setAssignedId(gov.nih.nci.iso21090.Ii obj) {
    m_assignedId = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}