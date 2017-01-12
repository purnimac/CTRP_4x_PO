/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractIdentifiedPerson class.
 * <p> 
 * Please see the documentation for the original AbstractIdentifiedPerson
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractIdentifiedPerson
 */

public abstract class AbstractIdentifiedPersonDTO 
  extends gov.nih.nci.services.correlation.AbstractIdentifiedEntityDTO 
  implements Serializable {

    private static final long serialVersionUID = 2L;

  /**
   * Default constructor.
   */
  public AbstractIdentifiedPersonDTO () { }

          private gov.nih.nci.iso21090.Ii m_playerIdentifier;

  public gov.nih.nci.iso21090.Ii getPlayerIdentifier() {
    return m_playerIdentifier;
  }

  public void setPlayerIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_playerIdentifier = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}