/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.AbstractRoleDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractRoleDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractRole.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractRole");
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
      Class myClass = gov.nih.nci.services.correlation.AbstractRoleDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.AbstractRoleDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractRole model object into a gov.nih.nci.services.correlation.AbstractRoleDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    gov.nih.nci.services.correlation.AbstractRoleDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractRoleDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractRole modelCasted = (gov.nih.nci.po.data.bo.AbstractRole) model;

    gov.nih.nci.po.data.bo.RoleStatus modelValStatus = modelCasted.getStatus ();

    copyModelToSnapshotStatus (modelValStatus, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractRole  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {

    gov.nih.nci.po.data.bo.AbstractRole modelCasted = (gov.nih.nci.po.data.bo.AbstractRole)model;
    gov.nih.nci.services.correlation.AbstractRoleDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractRoleDTO)snapshot;

    gov.nih.nci.iso21090.Cd snapshotValStatus = snapshotCasted.getStatus ();

    copySnapshotToModelStatus (snapshotValStatus, modelCasted, context);
  }

    /**
    * Copy the status from the model to the snapshot
    * @param modelVal the value of the status in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotStatus (gov.nih.nci.po.data.bo.RoleStatus modelVal, gov.nih.nci.services.correlation.AbstractRoleDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getStatus ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.RoleStatusConverter", new TransformerArgs(), context);

    snapshot.setStatus (snapshotVal);

  }

    /**
    * Copy the status from the snapshot to the model
    * @param snapshotVal the value of the status in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelStatus (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.AbstractRole model, TransformContext context) {

    gov.nih.nci.po.data.bo.RoleStatus modelVal = model.getStatus ();

      modelVal = (gov.nih.nci.po.data.bo.RoleStatus) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.RoleStatus.class, "gov.nih.nci.po.data.convert.CdConverter", new TransformerArgs(), context);

    model.setStatus (modelVal);

  }

}