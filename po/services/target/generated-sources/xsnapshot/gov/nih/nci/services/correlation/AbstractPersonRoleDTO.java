/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractPersonRole class.
 * <p> 
 * Please see the documentation for the original AbstractPersonRole
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractPersonRole
 */

public abstract class AbstractPersonRoleDTO 
  extends gov.nih.nci.services.correlation.AbstractBasePersonRoleDTO 
  implements Serializable {

    private static final long serialVersionUID = 2L;

  /**
   * Default constructor.
   */
  public AbstractPersonRoleDTO () { }

          private gov.nih.nci.iso21090.Ii m_playerIdentifier;

  public gov.nih.nci.iso21090.Ii getPlayerIdentifier() {
    return m_playerIdentifier;
  }

  public void setPlayerIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_playerIdentifier = obj;
  }

          private gov.nih.nci.iso21090.Ii m_scoperIdentifier;

  public gov.nih.nci.iso21090.Ii getScoperIdentifier() {
    return m_scoperIdentifier;
  }

  public void setScoperIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_scoperIdentifier = obj;
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