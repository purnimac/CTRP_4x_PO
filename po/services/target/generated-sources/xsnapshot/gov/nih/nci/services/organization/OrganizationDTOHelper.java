/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.organization.OrganizationDTO snapshot class.
 */

package gov.nih.nci.services.organization;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class OrganizationDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.Organization.class;
      if (myClass.isInstance (model)) {

        // check whether its already in the context map
        Object existingSnapshot = context.getSnapshotInstance (model, "iso");
        if (existingSnapshot != null) {
          return existingSnapshot;
        }
        else {
          gov.nih.nci.services.organization.OrganizationDTO snapshot = new gov.nih.nci.services.organization.OrganizationDTO();
          context.setSnapshotInstance (model, "iso", snapshot);  
          copyIntoSnapshot (model, snapshot, context);
          return snapshot;
        }

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.Organization");
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
      Class myClass = gov.nih.nci.services.organization.OrganizationDTO.class;
      if (myClass.isInstance (snapshot)) {
        // check whether its already in the context map
        Object existingModel = context.getModelInstance (snapshot);
        if (existingModel != null) {
          return existingModel;
        }
        else {            
          Object model = new gov.nih.nci.po.data.bo.Organization();
          context.setModelInstance (snapshot, model);
      	  copyIntoModel(snapshot, model, context);
          return model;
        }

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.organization.OrganizationDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.Organization model object into a gov.nih.nci.services.organization.OrganizationDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractOrganization.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.organization.OrganizationDTO snapshotCasted = (gov.nih.nci.services.organization.OrganizationDTO) snapshot;
    gov.nih.nci.po.data.bo.Organization modelCasted = (gov.nih.nci.po.data.bo.Organization) model;

    java.util.Date modelValStatusDate = modelCasted.getStatusDate ();

    copyModelToSnapshotStatusDate (modelValStatusDate, snapshotCasted, context);
    java.util.SortedSet modelValFamilyOrganizationRelationships = modelCasted.getFamilyOrganizationRelationships ();

    copyModelToSnapshotFamilyOrganizationRelationships (modelValFamilyOrganizationRelationships, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.Organization  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractOrganization.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.Organization modelCasted = (gov.nih.nci.po.data.bo.Organization)model;
    gov.nih.nci.services.organization.OrganizationDTO snapshotCasted = (gov.nih.nci.services.organization.OrganizationDTO)snapshot;

    gov.nih.nci.iso21090.Ts snapshotValStatusDate = snapshotCasted.getStatusDate ();

    copySnapshotToModelStatusDate (snapshotValStatusDate, modelCasted, context);
    gov.nih.nci.iso21090.DSet snapshotValFamilyOrganizationRelationships = snapshotCasted.getFamilyOrganizationRelationships ();

    copySnapshotToModelFamilyOrganizationRelationships (snapshotValFamilyOrganizationRelationships, modelCasted, context);
  }

    /**
    * Copy the statusDate from the model to the snapshot
    * @param modelVal the value of the statusDate in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotStatusDate (java.util.Date modelVal, gov.nih.nci.services.organization.OrganizationDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ts snapshotVal = snapshot.getStatusDate ();

      snapshotVal = (gov.nih.nci.iso21090.Ts) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ts.class, "gov.nih.nci.po.data.convert.DateConverter", new TransformerArgs(), context);

    snapshot.setStatusDate (snapshotVal);

  }

    /**
    * Copy the statusDate from the snapshot to the model
    * @param snapshotVal the value of the statusDate in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelStatusDate (gov.nih.nci.iso21090.Ts snapshotVal, gov.nih.nci.po.data.bo.Organization model, TransformContext context) {

    java.util.Date modelVal = model.getStatusDate ();

      modelVal = (java.util.Date) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.Date.class, "gov.nih.nci.po.data.convert.TsConverter", new TransformerArgs(), context);

    model.setStatusDate (modelVal);

  }

    /**
    * Copy the familyOrganizationRelationships from the model to the snapshot
    * @param modelVal the value of the familyOrganizationRelationships in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotFamilyOrganizationRelationships (java.util.SortedSet modelVal, gov.nih.nci.services.organization.OrganizationDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.DSet snapshotVal = snapshot.getFamilyOrganizationRelationships ();

      snapshotVal = (gov.nih.nci.iso21090.DSet) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.DSet.class, "gov.nih.nci.po.data.convert.FamilyOrganizationRelationshipConverter$SortedSetConverter", new TransformerArgs(), context);

    snapshot.setFamilyOrganizationRelationships (snapshotVal);

  }

    /**
    * Copy the familyOrganizationRelationships from the snapshot to the model
    * @param snapshotVal the value of the familyOrganizationRelationships in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelFamilyOrganizationRelationships (gov.nih.nci.iso21090.DSet snapshotVal, gov.nih.nci.po.data.bo.Organization model, TransformContext context) {

    java.util.SortedSet modelVal = model.getFamilyOrganizationRelationships ();

      modelVal = (java.util.SortedSet) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.SortedSet.class, "gov.nih.nci.po.data.convert.FamilyOrganizationRelationshipConverter$DSetConverter", new TransformerArgs(), context);

    XSnapshotPropertyUtils.setProperty (model, "familyOrganizationRelationships", modelVal);

  }

}