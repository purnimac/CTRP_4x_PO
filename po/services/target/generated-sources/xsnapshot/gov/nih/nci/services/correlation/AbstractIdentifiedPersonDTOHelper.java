/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractIdentifiedPersonDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractIdentifiedPerson.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractIdentifiedPerson");
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
      Class myClass = gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractIdentifiedPerson model object into a gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractIdentifiedEntity.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractIdentifiedPerson modelCasted = (gov.nih.nci.po.data.bo.AbstractIdentifiedPerson) model;

    gov.nih.nci.po.data.bo.Person modelValPlayerIdentifier = modelCasted.getPlayer ();

    copyModelToSnapshotPlayerIdentifier (modelValPlayerIdentifier, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractIdentifiedPerson  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractIdentifiedEntity.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.AbstractIdentifiedPerson modelCasted = (gov.nih.nci.po.data.bo.AbstractIdentifiedPerson)model;
    gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO)snapshot;

    gov.nih.nci.iso21090.Ii snapshotValPlayerIdentifier = snapshotCasted.getPlayerIdentifier ();

    copySnapshotToModelPlayerIdentifier (snapshotValPlayerIdentifier, modelCasted, context);
  }

    /**
    * Copy the playerIdentifier from the model to the snapshot
    * @param modelVal the value of the playerIdentifier in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotPlayerIdentifier (gov.nih.nci.po.data.bo.Person modelVal, gov.nih.nci.services.correlation.AbstractIdentifiedPersonDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Ii snapshotVal = snapshot.getPlayerIdentifier ();

      snapshotVal = (gov.nih.nci.iso21090.Ii) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Ii.class, "gov.nih.nci.po.data.convert.PersistentObjectConverter$PersistentPersonConverter", new TransformerArgs(), context);

    snapshot.setPlayerIdentifier (snapshotVal);

  }

    /**
    * Copy the playerIdentifier from the snapshot to the model
    * @param snapshotVal the value of the playerIdentifier in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelPlayerIdentifier (gov.nih.nci.iso21090.Ii snapshotVal, gov.nih.nci.po.data.bo.AbstractIdentifiedPerson model, TransformContext context) {

    gov.nih.nci.po.data.bo.Person modelVal = model.getPlayer ();

      modelVal = (gov.nih.nci.po.data.bo.Person) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.Person.class, "gov.nih.nci.po.data.convert.IiConverter", new TransformerArgs(), context);

    model.setPlayer (modelVal);

  }

}