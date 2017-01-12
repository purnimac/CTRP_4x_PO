/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.person.PersonDTO snapshot class.
 */

package gov.nih.nci.services.person;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class PersonDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.Person.class;
      if (myClass.isInstance (model)) {

        // check whether its already in the context map
        Object existingSnapshot = context.getSnapshotInstance (model, "iso");
        if (existingSnapshot != null) {
          return existingSnapshot;
        }
        else {
          gov.nih.nci.services.person.PersonDTO snapshot = new gov.nih.nci.services.person.PersonDTO();
          context.setSnapshotInstance (model, "iso", snapshot);  
          copyIntoSnapshot (model, snapshot, context);
          return snapshot;
        }

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.Person");
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
      Class myClass = gov.nih.nci.services.person.PersonDTO.class;
      if (myClass.isInstance (snapshot)) {
        // check whether its already in the context map
        Object existingModel = context.getModelInstance (snapshot);
        if (existingModel != null) {
          return existingModel;
        }
        else {            
          Object model = new gov.nih.nci.po.data.bo.Person();
          context.setModelInstance (snapshot, model);
      	  copyIntoModel(snapshot, model, context);
          return model;
        }

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.person.PersonDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.Person model object into a gov.nih.nci.services.person.PersonDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractPerson.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.person.PersonDTO snapshotCasted = (gov.nih.nci.services.person.PersonDTO) snapshot;
    gov.nih.nci.po.data.bo.Person modelCasted = (gov.nih.nci.po.data.bo.Person) model;

  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.Person  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractPerson.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.Person modelCasted = (gov.nih.nci.po.data.bo.Person)model;
    gov.nih.nci.services.person.PersonDTO snapshotCasted = (gov.nih.nci.services.person.PersonDTO)snapshot;

  }

}