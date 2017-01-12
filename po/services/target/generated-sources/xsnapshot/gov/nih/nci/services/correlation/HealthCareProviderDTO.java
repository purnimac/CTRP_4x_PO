/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.correlation;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * HealthCareProvider class.
 * <p> 
 * Please see the documentation for the original HealthCareProvider
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.HealthCareProvider
 */

public  class HealthCareProviderDTO 
  extends gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO 
  implements Serializable, gov.nih.nci.services.CorrelationDto {

    private static final long serialVersionUID = 2L;

  /**
   * Default constructor.
   */
  public HealthCareProviderDTO () { }

          private gov.nih.nci.iso21090.Ii m_duplicateOf;

  public gov.nih.nci.iso21090.Ii getDuplicateOf() {
    return m_duplicateOf;
  }

  public void setDuplicateOf(gov.nih.nci.iso21090.Ii obj) {
    m_duplicateOf = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}