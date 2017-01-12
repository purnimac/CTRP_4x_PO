/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.person.AbstractPersonDTO snapshot class.
 */

package gov.nih.nci.services.person;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractPersonDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractPerson.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractPerson");
      }
    }
  }
  /**
   * Create the model for the given snapshot
   */
  public Object createModel(Object snapshot, TransformContext context) throws XSnapshotException {
    if (snapshot == null) {
      return null;
    } else {
      // check if this is actually of my type
      Class myClass = gov.nih.nci.services.person.AbstractPersonDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.person.AbstractPersonDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractPerson model object into a gov.nih.nci.services.person.AbstractPersonDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    gov.nih.nci.services.person.AbstractPersonDTO snapshotCasted = (gov.nih.nci.services.person.AbstractPersonDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractPerson modelCasted = (gov.nih.nci.po.data.bo.AbstractPerson) model;

    java.lang.Long modelValIdentifier = modelCasted.getId ();

    copyModelToSnapshotIdentifier (modelValIdentifier, snapshotCasted, context);
    gov.nih.nci.po.data.bo.Address modelValPostalAddress = modelCasted.getPostalAddress ();

    copyModelToSnapshotPostalAddress (modelValPostalAddress, snapshotCasted, context);
    gov.nih.nci.po.data.bo.EntityStatus modelValStatusCode = modelCasted.getStatusCode ();

    copyModelToSnapshotStatusCode (modelValStatusCode, snapshotCasted, context);
    gov.nih.nci.po.data.bo.PersonSex modelValSexCode = modelCasted.getSexCode ();

    copyModelToSnapshotSexCode (modelValSexCode, snapshotCasted, context);
    java.util.Set modelValRaceCode = modelCasted.getRaceCode ();

    copyModelToSnapshotRaceCode (modelValRaceCode, snapshotCasted, context);
    java.util.Set modelValEthnicGroupCode = modelCasted.getEthnicGroupCode ();

    copyModelToSnapshotEthnicGroupCode (modelValEthnicGroupCode, snapshotCasted, context);
    java.util.Date modelValBirthDate = modelCasted.getBirthDate ();

    copyModelToSnapshotBirthDate (modelValBirthDate, snapshotCasted, context);
    java.util.Date modelValStatusDate = modelCasted.getStatusDate ();

    copyModelToSnapshotStatusDate (modelValStatusDate, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractPerson  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {

    gov.nih.nci.po.data.bo.AbstractPerson modelCasted = (gov.nih.nci.po.data.bo.AbstractPerson)model;
    gov.nih.nci.services.person.AbstractPersonDTO snapshotCasted = (gov.nih.nci.services.person.AbstractPersonDTO)snapshot;

    gov.nih.nci.iso21090.Ii snapshotValIdentifier = snapshotCasted.getIdentifier ();

    copySnapshotToModelIdentifier (snapshotValIdentifier, modelCasted, context);
    gov.nih.nci.iso21090.Ad snapshotValPostalAddress = snapshotCasted.getPostalAddress ();

    copySnapshotToModelPostalAddress (snapshotValPostalAddress, modelCasted, context);
    gov.nih.nci.iso21090.Cd snapshotValStatusCode = snapshotCasted.getStatusCode ();

    copySnapshotToModelStatusCode (snapshotValStatusCode, modelCasted, context);
    gov.nih.nci.iso21090.Cd snapshotValSexCode = snapshotCasted.getSexCode ();

    copySnapshotToModelSexCode (snapshotValSexCode, modelCasted, context);
    gov.nih.nci.iso21090.DSet snapshotValRaceCode = snapshotCasted.getRaceCode ();

    copySnapshotToModelRaceCode (snapshotValRaceCode, modelCasted, context);
    gov.nih.nci.iso21090.DSet snapshotValEthnicGroupCode = snapshotCasted.getEthnicGroupCode ();

    copySnapshotToModelEthnicGroupCode (snapshotValEthnicGroupCode, modelCasted, context);
    gov.nih.nci.iso21090.Ts snapshotValBirthDate = snapshotCasted.getBirthDate ();

    copySnapshotToModelBirthDate (snapshotValBirthDate, modelCasted, context);
    gov.nih.nci.iso21090.Ts snapshotValStatusDate = snapshotCasted.getStatusDate ();

    copySnapshotToModelStatusDate (snapshotValStatusDate, modelCasted, context);
  }

    /**
    * Copy the identifier from the model to the snapshot
    * @param modelVal the value of the identifier in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotIdentifier (java.lang.Long modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getIdentifier ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.IdConverter$PersonIdConverter", new TransformerArgs(), context);

    snapshot.setIdentifier (snapshotVal);

  }

    /**
    * Copy the identifier from the snapshot to the model
    * @param snapshotVal the value of the identifier in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelIdentifier (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    java.lang.Long modelVal = model.getId ();

      modelVal = (java.lang.Long) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.Long.class, "gov.nih.nci.po.data.convert.IiConverter", new TransformerArgs(), context);

    model.setId (modelVal);

  }

    /**
    * Copy the postalAddress from the model to the snapshot
    * @param modelVal the value of the postalAddress in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotPostalAddress (gov.nih.nci.po.data.bo.Address modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ad snapshotVal = snapshot.getPostalAddress ();

      snapshotVal = (gov.nih.nci.iso21090.Ad) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ad.class, "gov.nih.nci.po.data.convert.AddressConverter$SimpleConverter", new TransformerArgs(), context);

    snapshot.setPostalAddress (snapshotVal);

  }

    /**
    * Copy the postalAddress from the snapshot to the model
    * @param snapshotVal the value of the postalAddress in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelPostalAddress (gov.nih.nci.iso21090.Ad snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    gov.nih.nci.po.data.bo.Address modelVal = model.getPostalAddress ();

      modelVal = (gov.nih.nci.po.data.bo.Address) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.Address.class, "gov.nih.nci.po.data.convert.AdConverter$SimpleConverter", new TransformerArgs(), context);

    model.setPostalAddress (modelVal);

  }

    /**
    * Copy the statusCode from the model to the snapshot
    * @param modelVal the value of the statusCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotStatusCode (gov.nih.nci.po.data.bo.EntityStatus modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getStatusCode ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.StatusCodeConverter$EnumConverter", new TransformerArgs(), context);

    snapshot.setStatusCode (snapshotVal);

  }

    /**
    * Copy the statusCode from the snapshot to the model
    * @param snapshotVal the value of the statusCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelStatusCode (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    gov.nih.nci.po.data.bo.EntityStatus modelVal = model.getStatusCode ();

      modelVal = (gov.nih.nci.po.data.bo.EntityStatus) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.EntityStatus.class, "gov.nih.nci.po.data.convert.StatusCodeConverter$CdConverter", new TransformerArgs(), context);

    model.setStatusCode (modelVal);

  }

    /**
    * Copy the sexCode from the model to the snapshot
    * @param modelVal the value of the sexCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotSexCode (gov.nih.nci.po.data.bo.PersonSex modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getSexCode ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.SexCodeConverter$EnumConverter", new TransformerArgs(), context);

    snapshot.setSexCode (snapshotVal);

  }

    /**
    * Copy the sexCode from the snapshot to the model
    * @param snapshotVal the value of the sexCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelSexCode (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    gov.nih.nci.po.data.bo.PersonSex modelVal = model.getSexCode ();

      modelVal = (gov.nih.nci.po.data.bo.PersonSex) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.PersonSex.class, "gov.nih.nci.po.data.convert.SexCodeConverter$CdConverter", new TransformerArgs(), context);

    model.setSexCode (modelVal);

  }

    /**
    * Copy the raceCode from the model to the snapshot
    * @param modelVal the value of the raceCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotRaceCode (java.util.Set modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.DSet snapshotVal = snapshot.getRaceCode ();

      snapshotVal = (gov.nih.nci.iso21090.DSet) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.DSet.class, "gov.nih.nci.po.data.convert.RaceCodeConverter$EnumConverter", new TransformerArgs(), context);

    snapshot.setRaceCode (snapshotVal);

  }

    /**
    * Copy the raceCode from the snapshot to the model
    * @param snapshotVal the value of the raceCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelRaceCode (gov.nih.nci.iso21090.DSet snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    java.util.Set modelVal = model.getRaceCode ();

      modelVal = (java.util.Set) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.Set.class, "gov.nih.nci.po.data.convert.RaceCodeConverter$DSetConverter", new TransformerArgs(), context);

    model.setRaceCode (modelVal);

  }

    /**
    * Copy the ethnicGroupCode from the model to the snapshot
    * @param modelVal the value of the ethnicGroupCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotEthnicGroupCode (java.util.Set modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.DSet snapshotVal = snapshot.getEthnicGroupCode ();

      snapshotVal = (gov.nih.nci.iso21090.DSet) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.DSet.class, "gov.nih.nci.po.data.convert.EthnicGroupCodeConverter$EnumConverter", new TransformerArgs(), context);

    snapshot.setEthnicGroupCode (snapshotVal);

  }

    /**
    * Copy the ethnicGroupCode from the snapshot to the model
    * @param snapshotVal the value of the ethnicGroupCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelEthnicGroupCode (gov.nih.nci.iso21090.DSet snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    java.util.Set modelVal = model.getEthnicGroupCode ();

      modelVal = (java.util.Set) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.Set.class, "gov.nih.nci.po.data.convert.EthnicGroupCodeConverter$DSetConverter", new TransformerArgs(), context);

    model.setEthnicGroupCode (modelVal);

  }

    /**
    * Copy the birthDate from the model to the snapshot
    * @param modelVal the value of the birthDate in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotBirthDate (java.util.Date modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ts snapshotVal = snapshot.getBirthDate ();

      snapshotVal = (gov.nih.nci.iso21090.Ts) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ts.class, "gov.nih.nci.po.data.convert.DateConverter", new TransformerArgs(), context);

    snapshot.setBirthDate (snapshotVal);

  }

    /**
    * Copy the birthDate from the snapshot to the model
    * @param snapshotVal the value of the birthDate in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelBirthDate (gov.nih.nci.iso21090.Ts snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    java.util.Date modelVal = model.getBirthDate ();

      modelVal = (java.util.Date) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.Date.class, "gov.nih.nci.po.data.convert.TsConverter", new TransformerArgs(), context);

    model.setBirthDate (modelVal);

  }

    /**
    * Copy the statusDate from the model to the snapshot
    * @param modelVal the value of the statusDate in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotStatusDate (java.util.Date modelVal, gov.nih.nci.services.person.AbstractPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ts snapshotVal = snapshot.getStatusDate ();

      snapshotVal = (gov.nih.nci.iso21090.Ts) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ts.class, "gov.nih.nci.po.data.convert.DateConverter", new TransformerArgs(), context);

    snapshot.setStatusDate (snapshotVal);

  }

    /**
    * Copy the statusDate from the snapshot to the model
    * @param snapshotVal the value of the statusDate in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelStatusDate (gov.nih.nci.iso21090.Ts snapshotVal, gov.nih.nci.po.data.bo.AbstractPerson model, TransformContext context) {

    java.util.Date modelVal = model.getStatusDate ();

      modelVal = (java.util.Date) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.Date.class, "gov.nih.nci.po.data.convert.TsConverter", new TransformerArgs(), context);

    model.setStatusDate (modelVal);

  }

}