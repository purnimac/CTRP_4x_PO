/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractEnhancedOrganizationRoleDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole");
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
      Class myClass = gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole model object into a gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractOrganizationRole.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole modelCasted = (gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole) model;

    java.lang.String modelValName = modelCasted.getName ();

    copyModelToSnapshotName (modelValName, snapshotCasted, context);
    java.util.Set modelValPostalAddress = modelCasted.getPostalAddresses ();

    copyModelToSnapshotPostalAddress (modelValPostalAddress, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractOrganizationRole.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole modelCasted = (gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole)model;
    gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO)snapshot;

    gov.nih.nci.iso21090.EnOn snapshotValName = snapshotCasted.getName ();

    copySnapshotToModelName (snapshotValName, modelCasted, context);
    gov.nih.nci.iso21090.DSet snapshotValPostalAddress = snapshotCasted.getPostalAddress ();

    copySnapshotToModelPostalAddress (snapshotValPostalAddress, modelCasted, context);
  }

    /**
    * Copy the name from the model to the snapshot
    * @param modelVal the value of the name in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotName (java.lang.String modelVal, gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.EnOn snapshotVal = snapshot.getName ();

      snapshotVal = (gov.nih.nci.iso21090.EnOn) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.EnOn.class, "gov.nih.nci.po.data.convert.StringConverter", new TransformerArgs(), context);

    snapshot.setName (snapshotVal);

  }

    /**
    * Copy the name from the snapshot to the model
    * @param snapshotVal the value of the name in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelName (gov.nih.nci.iso21090.EnOn snapshotVal, gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole model, TransformContext context) {

    java.lang.String modelVal = model.getName ();

      modelVal = (java.lang.String) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.String.class, "gov.nih.nci.po.data.convert.EnConverter", new TransformerArgs(), context);

    model.setName (modelVal);

  }

    /**
    * Copy the postalAddress from the model to the snapshot
    * @param modelVal the value of the postalAddress in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotPostalAddress (java.util.Set modelVal, gov.nih.nci.services.correlation.AbstractEnhancedOrganizationRoleDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.DSet snapshotVal = snapshot.getPostalAddress ();

      snapshotVal = (gov.nih.nci.iso21090.DSet) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.DSet.class, "gov.nih.nci.po.data.convert.AddressConverter$SetConverter", new TransformerArgs(), context);

    snapshot.setPostalAddress (snapshotVal);

  }

    /**
    * Copy the postalAddress from the snapshot to the model
    * @param snapshotVal the value of the postalAddress in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelPostalAddress (gov.nih.nci.iso21090.DSet snapshotVal, gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole model, TransformContext context) {

    java.util.Set modelVal = model.getPostalAddresses ();

      modelVal = (java.util.Set) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.util.Set.class, "gov.nih.nci.po.data.convert.AdConverter$DSetConverter", new TransformerArgs(), context);

    model.setPostalAddresses (modelVal);

  }

}