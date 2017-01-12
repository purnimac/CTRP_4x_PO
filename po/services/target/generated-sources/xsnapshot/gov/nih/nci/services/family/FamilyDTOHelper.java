/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.family.FamilyDTO snapshot class.
 */

package gov.nih.nci.services.family;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class FamilyDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.Family.class;
      if (myClass.isInstance (model)) {

        // check whether its already in the context map
        Object existingSnapshot = context.getSnapshotInstance (model, "iso");
        if (existingSnapshot != null) {
          return existingSnapshot;
        }
        else {
          gov.nih.nci.services.family.FamilyDTO snapshot = new gov.nih.nci.services.family.FamilyDTO();
          context.setSnapshotInstance (model, "iso", snapshot);  
          copyIntoSnapshot (model, snapshot, context);
          return snapshot;
        }

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.Family");
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
      Class myClass = gov.nih.nci.services.family.FamilyDTO.class;
      if (myClass.isInstance (snapshot)) {
        // check whether its already in the context map
        Object existingModel = context.getModelInstance (snapshot);
        if (existingModel != null) {
          return existingModel;
        }
        else {            
          Object model = new gov.nih.nci.po.data.bo.Family();
          context.setModelInstance (snapshot, model);
      	  copyIntoModel(snapshot, model, context);
          return model;
        }

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.family.FamilyDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.Family model object into a gov.nih.nci.services.family.FamilyDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    gov.nih.nci.services.family.FamilyDTO snapshotCasted = (gov.nih.nci.services.family.FamilyDTO) snapshot;
    gov.nih.nci.po.data.bo.Family modelCasted = (gov.nih.nci.po.data.bo.Family) model;

    java.lang.Long modelValIdentifier = modelCasted.getId ();

    copyModelToSnapshotIdentifier (modelValIdentifier, snapshotCasted, context);
    java.lang.String modelValName = modelCasted.getName ();

    copyModelToSnapshotName (modelValName, snapshotCasted, context);
    gov.nih.nci.po.data.bo.FamilyStatus modelValStatusCode = modelCasted.getStatusCode ();

    copyModelToSnapshotStatusCode (modelValStatusCode, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.Family  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {

    gov.nih.nci.po.data.bo.Family modelCasted = (gov.nih.nci.po.data.bo.Family)model;
    gov.nih.nci.services.family.FamilyDTO snapshotCasted = (gov.nih.nci.services.family.FamilyDTO)snapshot;

    gov.nih.nci.iso21090.Ii snapshotValIdentifier = snapshotCasted.getIdentifier ();

    copySnapshotToModelIdentifier (snapshotValIdentifier, modelCasted, context);
    gov.nih.nci.iso21090.EnOn snapshotValName = snapshotCasted.getName ();

    copySnapshotToModelName (snapshotValName, modelCasted, context);
    gov.nih.nci.iso21090.Cd snapshotValStatusCode = snapshotCasted.getStatusCode ();

    copySnapshotToModelStatusCode (snapshotValStatusCode, modelCasted, context);
  }

    /**
    * Copy the identifier from the model to the snapshot
    * @param modelVal the value of the identifier in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotIdentifier (java.lang.Long modelVal, gov.nih.nci.services.family.FamilyDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getIdentifier ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.IdConverter$FamilyIdConverter", new TransformerArgs(), context);

    snapshot.setIdentifier (snapshotVal);

  }

    /**
    * Copy the identifier from the snapshot to the model
    * @param snapshotVal the value of the identifier in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelIdentifier (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.Family model, TransformContext context) {

    java.lang.Long modelVal = model.getId ();

      modelVal = (java.lang.Long) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.Long.class, "gov.nih.nci.po.data.convert.IiConverter", new TransformerArgs(), context);

    model.setId (modelVal);

  }

    /**
    * Copy the name from the model to the snapshot
    * @param modelVal the value of the name in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotName (java.lang.String modelVal, gov.nih.nci.services.family.FamilyDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.EnOn snapshotVal = snapshot.getName ();

      snapshotVal = (gov.nih.nci.iso21090.EnOn) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.EnOn.class, "gov.nih.nci.po.data.convert.StringConverter", new TransformerArgs(), context);

    snapshot.setName (snapshotVal);

  }

    /**
    * Copy the name from the snapshot to the model
    * @param snapshotVal the value of the name in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelName (gov.nih.nci.iso21090.EnOn snapshotVal, gov.nih.nci.po.data.bo.Family model, TransformContext context) {

    java.lang.String modelVal = model.getName ();

      modelVal = (java.lang.String) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.String.class, "gov.nih.nci.po.data.convert.EnConverter", new TransformerArgs(), context);

    model.setName (modelVal);

  }

    /**
    * Copy the statusCode from the model to the snapshot
    * @param modelVal the value of the statusCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotStatusCode (gov.nih.nci.po.data.bo.FamilyStatus modelVal, gov.nih.nci.services.family.FamilyDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getStatusCode ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.FamilyStatusCodeConverter$EnumConverter", new TransformerArgs(), context);

    snapshot.setStatusCode (snapshotVal);

  }

    /**
    * Copy the statusCode from the snapshot to the model
    * @param snapshotVal the value of the statusCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelStatusCode (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.Family model, TransformContext context) {

    gov.nih.nci.po.data.bo.FamilyStatus modelVal = model.getStatusCode ();

      modelVal = (gov.nih.nci.po.data.bo.FamilyStatus) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.FamilyStatus.class, "gov.nih.nci.po.data.convert.FamilyStatusCodeConverter$CdConverter", new TransformerArgs(), context);

    model.setStatusCode (modelVal);

  }

}