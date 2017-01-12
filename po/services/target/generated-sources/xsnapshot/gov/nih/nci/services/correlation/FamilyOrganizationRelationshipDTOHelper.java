/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class FamilyOrganizationRelationshipDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.FamilyOrganizationRelationship.class;
      if (myClass.isInstance (model)) {

        // check whether its already in the context map
        Object existingSnapshot = context.getSnapshotInstance (model, "iso");
        if (existingSnapshot != null) {
          return existingSnapshot;
        }
        else {
          gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot = new gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO();
          context.setSnapshotInstance (model, "iso", snapshot);  
          copyIntoSnapshot (model, snapshot, context);
          return snapshot;
        }

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.FamilyOrganizationRelationship");
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
      Class myClass = gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO.class;
      if (myClass.isInstance (snapshot)) {
        // check whether its already in the context map
        Object existingModel = context.getModelInstance (snapshot);
        if (existingModel != null) {
          return existingModel;
        }
        else {            
          Object model = new gov.nih.nci.po.data.bo.FamilyOrganizationRelationship();
          context.setModelInstance (snapshot, model);
      	  copyIntoModel(snapshot, model, context);
          return model;
        }

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.FamilyOrganizationRelationship model object into a gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshotCasted = (gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO) snapshot;
    gov.nih.nci.po.data.bo.FamilyOrganizationRelationship modelCasted = (gov.nih.nci.po.data.bo.FamilyOrganizationRelationship) model;

    java.lang.Long modelValIdentifier = modelCasted.getId ();

    copyModelToSnapshotIdentifier (modelValIdentifier, snapshotCasted, context);
    gov.nih.nci.po.data.bo.Family modelValFamilyIdentifier = modelCasted.getFamily ();

    copyModelToSnapshotFamilyIdentifier (modelValFamilyIdentifier, snapshotCasted, context);
    gov.nih.nci.po.data.bo.Organization modelValOrgIdentifier = modelCasted.getOrganization ();

    copyModelToSnapshotOrgIdentifier (modelValOrgIdentifier, snapshotCasted, context);
    gov.nih.nci.po.data.bo.FamilyFunctionalType modelValFunctionalType = modelCasted.getFunctionalType ();

    copyModelToSnapshotFunctionalType (modelValFunctionalType, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.FamilyOrganizationRelationship  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {

    gov.nih.nci.po.data.bo.FamilyOrganizationRelationship modelCasted = (gov.nih.nci.po.data.bo.FamilyOrganizationRelationship)model;
    gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshotCasted = (gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO)snapshot;

    gov.nih.nci.iso21090.Ii snapshotValIdentifier = snapshotCasted.getIdentifier ();

    copySnapshotToModelIdentifier (snapshotValIdentifier, modelCasted, context);
    gov.nih.nci.iso21090.Ii snapshotValFamilyIdentifier = snapshotCasted.getFamilyIdentifier ();

    copySnapshotToModelFamilyIdentifier (snapshotValFamilyIdentifier, modelCasted, context);
    gov.nih.nci.iso21090.Ii snapshotValOrgIdentifier = snapshotCasted.getOrgIdentifier ();

    copySnapshotToModelOrgIdentifier (snapshotValOrgIdentifier, modelCasted, context);
    gov.nih.nci.iso21090.Cd snapshotValFunctionalType = snapshotCasted.getFunctionalType ();

    copySnapshotToModelFunctionalType (snapshotValFunctionalType, modelCasted, context);
  }

    /**
    * Copy the identifier from the model to the snapshot
    * @param modelVal the value of the identifier in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotIdentifier (java.lang.Long modelVal, gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getIdentifier ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.IdConverter$FamilyOrganizationRelationshipIdConverter", new TransformerArgs(), context);

    snapshot.setIdentifier (snapshotVal);

  }

    /**
    * Copy the identifier from the snapshot to the model
    * @param snapshotVal the value of the identifier in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelIdentifier (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.FamilyOrganizationRelationship model, TransformContext context) {

    java.lang.Long modelVal = model.getId ();

      modelVal = (java.lang.Long) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.Long.class, "gov.nih.nci.po.data.convert.IiConverter", new TransformerArgs(), context);

    model.setId (modelVal);

  }

    /**
    * Copy the familyIdentifier from the model to the snapshot
    * @param modelVal the value of the familyIdentifier in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotFamilyIdentifier (gov.nih.nci.po.data.bo.Family modelVal, gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getFamilyIdentifier ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.PersistentObjectConverter$PersistentFamilyConverter", new TransformerArgs(), context);

    snapshot.setFamilyIdentifier (snapshotVal);

  }

    /**
    * Copy the familyIdentifier from the snapshot to the model
    * @param snapshotVal the value of the familyIdentifier in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelFamilyIdentifier (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.FamilyOrganizationRelationship model, TransformContext context) {

    gov.nih.nci.po.data.bo.Family modelVal = model.getFamily ();

      modelVal = (gov.nih.nci.po.data.bo.Family) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.Family.class, "gov.nih.nci.po.data.convert.IiConverter", new TransformerArgs(), context);

    model.setFamily (modelVal);

  }

    /**
    * Copy the orgIdentifier from the model to the snapshot
    * @param modelVal the value of the orgIdentifier in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotOrgIdentifier (gov.nih.nci.po.data.bo.Organization modelVal, gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getOrgIdentifier ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.PersistentObjectConverter$PersistentOrgConverter", new TransformerArgs(), context);

    snapshot.setOrgIdentifier (snapshotVal);

  }

    /**
    * Copy the orgIdentifier from the snapshot to the model
    * @param snapshotVal the value of the orgIdentifier in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelOrgIdentifier (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.FamilyOrganizationRelationship model, TransformContext context) {

    gov.nih.nci.po.data.bo.Organization modelVal = model.getOrganization ();

      modelVal = (gov.nih.nci.po.data.bo.Organization) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.Organization.class, "gov.nih.nci.po.data.convert.IiConverter", new TransformerArgs(), context);

    model.setOrganization (modelVal);

  }

    /**
    * Copy the functionalType from the model to the snapshot
    * @param modelVal the value of the functionalType in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotFunctionalType (gov.nih.nci.po.data.bo.FamilyFunctionalType modelVal, gov.nih.nci.services.correlation.FamilyOrganizationRelationshipDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getFunctionalType ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.FamilyFunctionalTypeConverter$EnumConverter", new TransformerArgs(), context);

    snapshot.setFunctionalType (snapshotVal);

  }

    /**
    * Copy the functionalType from the snapshot to the model
    * @param snapshotVal the value of the functionalType in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelFunctionalType (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.FamilyOrganizationRelationship model, TransformContext context) {

    gov.nih.nci.po.data.bo.FamilyFunctionalType modelVal = model.getFunctionalType ();

      modelVal = (gov.nih.nci.po.data.bo.FamilyFunctionalType) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.FamilyFunctionalType.class, "gov.nih.nci.po.data.convert.FamilyFunctionalTypeConverter$CdConverter", new TransformerArgs(), context);

    model.setFunctionalType (modelVal);

  }

}