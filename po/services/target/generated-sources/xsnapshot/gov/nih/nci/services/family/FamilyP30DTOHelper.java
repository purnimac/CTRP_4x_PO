/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.family.FamilyP30DTO snapshot class.
 */

package gov.nih.nci.services.family;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class FamilyP30DTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.FamilyP30.class;
      if (myClass.isInstance (model)) {

        // check whether its already in the context map
        Object existingSnapshot = context.getSnapshotInstance (model, "iso");
        if (existingSnapshot != null) {
          return existingSnapshot;
        }
        else {
          gov.nih.nci.services.family.FamilyP30DTO snapshot = new gov.nih.nci.services.family.FamilyP30DTO();
          context.setSnapshotInstance (model, "iso", snapshot);  
          copyIntoSnapshot (model, snapshot, context);
          return snapshot;
        }

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.FamilyP30");
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
      Class myClass = gov.nih.nci.services.family.FamilyP30DTO.class;
      if (myClass.isInstance (snapshot)) {
        // check whether its already in the context map
        Object existingModel = context.getModelInstance (snapshot);
        if (existingModel != null) {
          return existingModel;
        }
        else {            
          Object model = new gov.nih.nci.po.data.bo.FamilyP30();
          context.setModelInstance (snapshot, model);
      	  copyIntoModel(snapshot, model, context);
          return model;
        }

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.family.FamilyP30DTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.FamilyP30 model object into a gov.nih.nci.services.family.FamilyP30DTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    gov.nih.nci.services.family.FamilyP30DTO snapshotCasted = (gov.nih.nci.services.family.FamilyP30DTO) snapshot;
    gov.nih.nci.po.data.bo.FamilyP30 modelCasted = (gov.nih.nci.po.data.bo.FamilyP30) model;

    java.lang.String modelValSerialNumber = modelCasted.getSerialNumber ();

    copyModelToSnapshotSerialNumber (modelValSerialNumber, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.FamilyP30  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {

    gov.nih.nci.po.data.bo.FamilyP30 modelCasted = (gov.nih.nci.po.data.bo.FamilyP30)model;
    gov.nih.nci.services.family.FamilyP30DTO snapshotCasted = (gov.nih.nci.services.family.FamilyP30DTO)snapshot;

    gov.nih.nci.iso21090.EnOn snapshotValSerialNumber = snapshotCasted.getSerialNumber ();

    copySnapshotToModelSerialNumber (snapshotValSerialNumber, modelCasted, context);
  }

    /**
    * Copy the serialNumber from the model to the snapshot
    * @param modelVal the value of the serialNumber in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotSerialNumber (java.lang.String modelVal, gov.nih.nci.services.family.FamilyP30DTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.EnOn snapshotVal = snapshot.getSerialNumber ();

      snapshotVal = (gov.nih.nci.iso21090.EnOn) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.EnOn.class, "gov.nih.nci.po.data.convert.StringConverter", new TransformerArgs(), context);

    snapshot.setSerialNumber (snapshotVal);

  }

    /**
    * Copy the serialNumber from the snapshot to the model
    * @param snapshotVal the value of the serialNumber in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelSerialNumber (gov.nih.nci.iso21090.EnOn snapshotVal, gov.nih.nci.po.data.bo.FamilyP30 model, TransformContext context) {

    java.lang.String modelVal = model.getSerialNumber ();

      modelVal = (java.lang.String) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.String.class, "gov.nih.nci.po.data.convert.EnConverter", new TransformerArgs(), context);

    model.setSerialNumber (modelVal);

  }

}