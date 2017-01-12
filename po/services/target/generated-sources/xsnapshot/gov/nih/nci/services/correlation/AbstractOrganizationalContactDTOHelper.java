/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractOrganizationalContactDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractOrganizationalContact.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractOrganizationalContact");
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
      Class myClass = gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractOrganizationalContact model object into a gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractPersonRole.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractOrganizationalContact modelCasted = (gov.nih.nci.po.data.bo.AbstractOrganizationalContact) model;

    gov.nih.nci.po.data.bo.OrganizationalContactType modelValTypeCode = modelCasted.getType ();

    copyModelToSnapshotTypeCode (modelValTypeCode, snapshotCasted, context);
    java.lang.String modelValTitle = modelCasted.getTitle ();

    copyModelToSnapshotTitle (modelValTitle, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractOrganizationalContact  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractPersonRole.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.AbstractOrganizationalContact modelCasted = (gov.nih.nci.po.data.bo.AbstractOrganizationalContact)model;
    gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO)snapshot;

    gov.nih.nci.iso21090.Cd snapshotValTypeCode = snapshotCasted.getTypeCode ();

    copySnapshotToModelTypeCode (snapshotValTypeCode, modelCasted, context);
    gov.nih.nci.iso21090.St snapshotValTitle = snapshotCasted.getTitle ();

    copySnapshotToModelTitle (snapshotValTitle, modelCasted, context);
  }

    /**
    * Copy the typeCode from the model to the snapshot
    * @param modelVal the value of the typeCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotTypeCode (gov.nih.nci.po.data.bo.OrganizationalContactType modelVal, gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getTypeCode ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.GenericTypeCodeConverter", new TransformerArgs(), context);

    snapshot.setTypeCode (snapshotVal);

  }

    /**
    * Copy the typeCode from the snapshot to the model
    * @param snapshotVal the value of the typeCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelTypeCode (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.AbstractOrganizationalContact model, TransformContext context) {

    gov.nih.nci.po.data.bo.OrganizationalContactType modelVal = model.getType ();

      modelVal = (gov.nih.nci.po.data.bo.OrganizationalContactType) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.OrganizationalContactType.class, "gov.nih.nci.po.data.convert.CdConverter", new TransformerArgs(), context);

    model.setType (modelVal);

  }

    /**
    * Copy the title from the model to the snapshot
    * @param modelVal the value of the title in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotTitle (java.lang.String modelVal, gov.nih.nci.services.correlation.AbstractOrganizationalContactDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.St snapshotVal = snapshot.getTitle ();

      snapshotVal = (gov.nih.nci.iso21090.St) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.St.class, "gov.nih.nci.po.data.convert.StringConverter", new TransformerArgs(), context);

    snapshot.setTitle (snapshotVal);

  }

    /**
    * Copy the title from the snapshot to the model
    * @param snapshotVal the value of the title in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelTitle (gov.nih.nci.iso21090.St snapshotVal, gov.nih.nci.po.data.bo.AbstractOrganizationalContact model, TransformContext context) {

    java.lang.String modelVal = model.getTitle ();

      modelVal = (java.lang.String) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.String.class, "gov.nih.nci.po.data.convert.StConverter", new TransformerArgs(), context);

    model.setTitle (modelVal);

  }

}