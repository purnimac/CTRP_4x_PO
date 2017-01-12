/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractResearchOrganizationDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractResearchOrganization.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractResearchOrganization");
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
      Class myClass = gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractResearchOrganization model object into a gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractResearchOrganization modelCasted = (gov.nih.nci.po.data.bo.AbstractResearchOrganization) model;

    gov.nih.nci.po.data.bo.FundingMechanism modelValFundingMechanism = modelCasted.getFundingMechanism ();

    copyModelToSnapshotFundingMechanism (modelValFundingMechanism, snapshotCasted, context);
    gov.nih.nci.po.data.bo.ResearchOrganizationType modelValTypeCode = modelCasted.getTypeCode ();

    copyModelToSnapshotTypeCode (modelValTypeCode, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractResearchOrganization  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractEnhancedOrganizationRole.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.AbstractResearchOrganization modelCasted = (gov.nih.nci.po.data.bo.AbstractResearchOrganization)model;
    gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO)snapshot;

    gov.nih.nci.iso21090.Cd snapshotValFundingMechanism = snapshotCasted.getFundingMechanism ();

    copySnapshotToModelFundingMechanism (snapshotValFundingMechanism, modelCasted, context);
    gov.nih.nci.iso21090.Cd snapshotValTypeCode = snapshotCasted.getTypeCode ();

    copySnapshotToModelTypeCode (snapshotValTypeCode, modelCasted, context);
  }

    /**
    * Copy the fundingMechanism from the model to the snapshot
    * @param modelVal the value of the fundingMechanism in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotFundingMechanism (gov.nih.nci.po.data.bo.FundingMechanism modelVal, gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getFundingMechanism ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.GenericTypeCodeConverter", new TransformerArgs(), context);

    snapshot.setFundingMechanism (snapshotVal);

  }

    /**
    * Copy the fundingMechanism from the snapshot to the model
    * @param snapshotVal the value of the fundingMechanism in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelFundingMechanism (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.AbstractResearchOrganization model, TransformContext context) {

    gov.nih.nci.po.data.bo.FundingMechanism modelVal = model.getFundingMechanism ();

      modelVal = (gov.nih.nci.po.data.bo.FundingMechanism) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.FundingMechanism.class, "gov.nih.nci.po.data.convert.CdConverter", new TransformerArgs(), context);

    model.setFundingMechanism (modelVal);

  }

    /**
    * Copy the typeCode from the model to the snapshot
    * @param modelVal the value of the typeCode in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotTypeCode (gov.nih.nci.po.data.bo.ResearchOrganizationType modelVal, gov.nih.nci.services.correlation.AbstractResearchOrganizationDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.Cd snapshotVal = snapshot.getTypeCode ();

      snapshotVal = (gov.nih.nci.iso21090.Cd) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.Cd.class, "gov.nih.nci.po.data.convert.GenericTypeCodeConverter", new TransformerArgs(), context);

    snapshot.setTypeCode (snapshotVal);

  }

    /**
    * Copy the typeCode from the snapshot to the model
    * @param snapshotVal the value of the typeCode in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelTypeCode (gov.nih.nci.iso21090.Cd snapshotVal, gov.nih.nci.po.data.bo.AbstractResearchOrganization model, TransformContext context) {

    gov.nih.nci.po.data.bo.ResearchOrganizationType modelVal = model.getTypeCode ();

      modelVal = (gov.nih.nci.po.data.bo.ResearchOrganizationType) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), gov.nih.nci.po.data.bo.ResearchOrganizationType.class, "gov.nih.nci.po.data.convert.CdConverter", new TransformerArgs(), context);

    model.setTypeCode (modelVal);

  }

}