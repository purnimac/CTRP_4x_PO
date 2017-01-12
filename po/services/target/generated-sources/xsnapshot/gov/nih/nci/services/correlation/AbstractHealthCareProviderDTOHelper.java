/**
 * Auto-generated file.  Do not edit.
 * 
 * This is the helper class for the gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO snapshot class.
 */

package gov.nih.nci.services.correlation;

import java.util.*;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.CollectionUtils;

import net.sf.xsnapshot.*;
import net.sf.xsnapshot.support.*;

public class AbstractHealthCareProviderDTOHelper implements SnapshotHelper {
  /**
   *  Creates the snapshot object based on the model object given. This method should
   * not be called directly. Instead, call createSnapshot(Object).
   */
  public Object createSnapshot(Object model, TransformContext context) throws XSnapshotException {
    if (model == null) {
      return null;
    } else {
      Class myClass = gov.nih.nci.po.data.bo.AbstractHealthCareProvider.class;
      if (myClass.isInstance (model)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("model object is of class " + model.getClass () + " which is not a subclass of gov.nih.nci.po.data.bo.AbstractHealthCareProvider");
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
      Class myClass = gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO.class;
      if (myClass.isInstance (snapshot)) {

        // cannot happen: there cannot be a concrete instance of an 
        // abstract class
        throw new IllegalStateException ("Concrete instance of an abstract class found, or helper called directly");

      } else {
         throw new IllegalArgumentException ("snapshot object is of class " + snapshot.getClass () + " which is not a subclass of gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO");
      }
    }     
  }

  /**
    * Copies a gov.nih.nci.po.data.bo.AbstractHealthCareProvider model object into a gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO snapshot object
    * @param model the model object
    * @param snapshot the snapshot object
    */
  public void copyIntoSnapshot (Object model, Object snapshot, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoSnapshot. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractPersonRole.class, "iso");
    parentSnapshotHelper.copyIntoSnapshot (model, snapshot, context);
    gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO) snapshot;
    gov.nih.nci.po.data.bo.AbstractHealthCareProvider modelCasted = (gov.nih.nci.po.data.bo.AbstractHealthCareProvider) model;

    java.lang.String modelValCertificateLicenseText = modelCasted.getCertificateLicenseText ();

    copyModelToSnapshotCertificateLicenseText (modelValCertificateLicenseText, snapshotCasted, context);
  }
  /**
    * Copies a XDtXSnapshot:snapshotClass/> snapshot object into a gov.nih.nci.po.data.bo.AbstractHealthCareProvider  model object
    * Warning: not an exact inverse of copyIntoSnapshot
    * @param snapshot the snapshot object
    * @param model the model object
    */  
  public void copyIntoModel(Object snapshot, Object model, TransformContext context) throws XSnapshotException {
    // this class extends from a snapshot, so we also need to call the helper 
    // for the parent snapshot's copyIntoModel. Do that first
    SnapshotHelper parentSnapshotHelper = context.getHelperForModelClass (gov.nih.nci.po.data.bo.AbstractPersonRole.class, "iso");
    parentSnapshotHelper.copyIntoModel (snapshot, model, context);

    gov.nih.nci.po.data.bo.AbstractHealthCareProvider modelCasted = (gov.nih.nci.po.data.bo.AbstractHealthCareProvider)model;
    gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO snapshotCasted = (gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO)snapshot;

    gov.nih.nci.iso21090.St snapshotValCertificateLicenseText = snapshotCasted.getCertificateLicenseText ();

    copySnapshotToModelCertificateLicenseText (snapshotValCertificateLicenseText, modelCasted, context);
  }

    /**
    * Copy the certificateLicenseText from the model to the snapshot
    * @param modelVal the value of the certificateLicenseText in the model
    * @param snapshot the snapshot instance to copy the value into
    */
  protected void copyModelToSnapshotCertificateLicenseText (java.lang.String modelVal, gov.nih.nci.services.correlation.AbstractHealthCareProviderDTO snapshot, TransformContext context) {

    gov.nih.nci.iso21090.St snapshotVal = snapshot.getCertificateLicenseText ();

      snapshotVal = (gov.nih.nci.iso21090.St) TransformUtils.transformObject  (TransformUtils.toObject (modelVal), gov.nih.nci.iso21090.St.class, "gov.nih.nci.po.data.convert.StringConverter", new TransformerArgs(), context);

    snapshot.setCertificateLicenseText (snapshotVal);

  }

    /**
    * Copy the certificateLicenseText from the snapshot to the model
    * @param snapshotVal the value of the certificateLicenseText in the snapshot
    * @param model the model instance to copy the value into
    */    
  protected void copySnapshotToModelCertificateLicenseText (gov.nih.nci.iso21090.St snapshotVal, gov.nih.nci.po.data.bo.AbstractHealthCareProvider model, TransformContext context) {

    java.lang.String modelVal = model.getCertificateLicenseText ();

      modelVal = (java.lang.String) TransformUtils.transformObject  (TransformUtils.toObject (snapshotVal), java.lang.String.class, "gov.nih.nci.po.data.convert.StConverter", new TransformerArgs(), context);

    model.setCertificateLicenseText (modelVal);

  }

}