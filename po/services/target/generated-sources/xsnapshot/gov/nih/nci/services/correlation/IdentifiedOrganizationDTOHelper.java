/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.IdentifiedOrganizationDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class IdentifiedOrganizationDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.IdentifiedOrganization.class;
      if (myClass.isInstance (model)) {

        // check whether its already in the context map
        Object existingSnapshot = context.getSnapshotInstance (model, "iso");
        if (existingSnapshot != null) {
          return existingSnapshot;
        }
        else {
          gov.nih.nci.services.correlation.IdentifiedOrganizationDTO snapshot = new gov.nih.nci.services.correlation.IdentifiedOrganizationDTO();
          context.setSnapshotInstance (model, "iso", snapshot);  
          copyIntoSnapshot (model, snapshot, context);
          return snapshot;
        }

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.IdentifiedOrganization");
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
      Class myClass = gov.nih.nci.services.correlation.IdentifiedOrganizationDTO.class;
      if (myClass.isInstance (snapshot)) {
        // check whether its already in the context map
        Object existingModel = context.getModelInstance (snapshot);
        if (existingModel != null) {
          return existingModel;
        }
        else {            
          Object model = new gov.nih.nci.po.data.bo.IdentifiedOrganization();
          context.setModelInstance (snapshot, model);
      	  copyIntoModel(snapshot, model, context);
          return model;
        }

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.IdentifiedOrganizationDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.IdentifiedOrganization model object into a gov.nih.nci.services.correlation.IdentifiedOrganizationDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractIdentifiedOrganization.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.correlation.IdentifiedOrganizationDTO snapshotCasted = (gov.nih.nci.services.correlation.IdentifiedOrganizationDTO) snapshot;
    gov.nih.nci.po.data.bo.IdentifiedOrganization modelCasted = (gov.nih.nci.po.data.bo.IdentifiedOrganization) model;

    gov.nih.nci.po.data.bo.IdentifiedOrganization modelValDuplicateOf = modelCasted.getDuplicateOf ();

    copyModelToSnapshotDuplicateOf (modelValDuplicateOf, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.IdentifiedOrganization  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractIdentifiedOrganization.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.IdentifiedOrganization modelCasted = (gov.nih.nci.po.data.bo.IdentifiedOrganization)model;
    gov.nih.nci.services.correlation.IdentifiedOrganizationDTO snapshotCasted = (gov.nih.nci.services.correlation.IdentifiedOrganizationDTO)snapshot;

    gov.nih.nci.iso21090.Ii snapshotValDuplicateOf = snapshotCasted.getDuplicateOf ();

    copySnapshotToModelDuplicateOf (snapshotValDuplicateOf, modelCasted, context);
  }

    /**
    * Copy the duplicateOf from the model to the snapshot
    * @param modelVal the value of the duplicateOf in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotDuplicateOf (gov.nih.nci.po.data.bo.IdentifiedOrganization modelVal, gov.nih.nci.services.correlation.IdentifiedOrganizationDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getDuplicateOf ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.PersistentObjectConverter$PersistentIOConverter", new TransformerArgs(), context);

    snapshot.setDuplicateOf (snapshotVal);

  }

    /**
    * Copy the duplicateOf from the snapshot to the model
    * @param snapshotVal the value of the duplicateOf in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelDuplicateOf (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.IdentifiedOrganization model, TransformContext context) {

    gov.nih.nci.po.data.bo.IdentifiedOrganization modelVal = model.getDuplicateOf ();

      modelVal = (gov.nih.nci.po.data.bo.IdentifiedOrganization) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.IdentifiedOrganization.class, "gov.nih.nci.po.data.convert.IiConverter$CorrelationIiConverter", new TransformerArgs(), context);

    model.setDuplicateOf (modelVal);

  }

}