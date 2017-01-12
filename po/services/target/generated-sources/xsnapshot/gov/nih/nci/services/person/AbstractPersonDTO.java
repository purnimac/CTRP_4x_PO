/*
 * Auto-generated file.  Do not edit.
 */
package gov.nih.nci.services.person;

import java.io.Serializable;
import java.util.*;

/**
 * This is the "iso" snapshot auto-generated from the 
 * AbstractPerson class.
 * <p> 
 * Please see the documentation for the original AbstractPerson
 * class for documentation of each individual attribute.
 * @see gov.nih.nci.po.data.bo.AbstractPerson
 */

public abstract class AbstractPersonDTO 
  extends gov.nih.nci.services.person.BasePersonDTO 
  implements Serializable {

    private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public AbstractPersonDTO () { }

          private gov.nih.nci.iso21090.Ii m_identifier;

  public gov.nih.nci.iso21090.Ii getIdentifier() {
    return m_identifier;
  }

  public void setIdentifier(gov.nih.nci.iso21090.Ii obj) {
    m_identifier = obj;
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

          private gov.nih.nci.iso21090.Cd m_sexCode;

  public gov.nih.nci.iso21090.Cd getSexCode() {
    return m_sexCode;
  }

  public void setSexCode(gov.nih.nci.iso21090.Cd obj) {
    m_sexCode = obj;
  }

          private gov.nih.nci.iso21090.DSet m_raceCode;

  public gov.nih.nci.iso21090.DSet getRaceCode() {
    return m_raceCode;
  }

  public void setRaceCode(gov.nih.nci.iso21090.DSet obj) {
    m_raceCode = obj;
  }

          private gov.nih.nci.iso21090.DSet m_ethnicGroupCode;

  public gov.nih.nci.iso21090.DSet getEthnicGroupCode() {
    return m_ethnicGroupCode;
  }

  public void setEthnicGroupCode(gov.nih.nci.iso21090.DSet obj) {
    m_ethnicGroupCode = obj;
  }

          private gov.nih.nci.iso21090.Ts m_birthDate;

  public gov.nih.nci.iso21090.Ts getBirthDate() {
    return m_birthDate;
  }

  public void setBirthDate(gov.nih.nci.iso21090.Ts obj) {
    m_birthDate = obj;
  }

          private gov.nih.nci.iso21090.Ts m_statusDate;

  public gov.nih.nci.iso21090.Ts getStatusDate() {
    return m_statusDate;
  }

  public void setStatusDate(gov.nih.nci.iso21090.Ts obj) {
    m_statusDate = obj;
  }

// equals, hashcode, toString

// additional code from merge file for this model class

// additional code from merge file for this snapshot 

// wrapper methods for operations on snapshots that cast arguments
// appropriately

}