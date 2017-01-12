/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.organization;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractOrganization class.
 * <p> 
 * Please see the documentation for the original AbstractOrganization
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractOrganization
 */

public abstract class AbstractOrganizationDTO 
  extends gov.nih.nci.services.organization.BaseOrganizationDTO 
  implements Serializable {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public AbstractOrganizationDTO () { }

          private gov.nih.nci.iso21090.Ii m_identifier;

  public gov.nih.nci.iso21090.Ii getIdentifier() {
    return m_identifier;
  }

  public void setIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_identifier = obj;
  }

          private gov.nih.nci.iso21090.EnOn m_name;

  public gov.nih.nci.iso21090.EnOn getName() {
    return m_name;
  }

  public void setName(gov.nih.nci.iso21090.EnOn obj) {
    m_name = obj;
  }

          private gov.nih.nci.iso21090.Ad m_postalAddress;

  public gov.nih.nci.iso21090.Ad getPostalAddress() {
    return m_postalAddress;
  }

  public void setPostalAddress(gov.nih.nci.iso21090.Ad obj) {
    m_postalAddress = obj;
  }

          private gov.nih.nci.iso21090.Cd m_statusCode;

  public gov.nih.nci.iso21090.Cd getStatusCode() {
    return m_statusCode;
  }

  public void setStatusCode(gov.nih.nci.iso21090.Cd obj) {
    m_statusCode = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}