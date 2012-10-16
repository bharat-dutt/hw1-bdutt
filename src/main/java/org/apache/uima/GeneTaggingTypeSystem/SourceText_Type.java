
/* First created by JCasGen Wed Oct 10 18:59:04 EDT 2012 */
package org.apache.uima.GeneTaggingTypeSystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 16 12:52:26 EDT 2012
 * @generated */
public class SourceText_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SourceText_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SourceText_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SourceText(addr, SourceText_Type.this);
  			   SourceText_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SourceText(addr, SourceText_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SourceText.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.GeneTaggingTypeSystem.SourceText");
 
  /** @generated */
  final Feature casFeat_SentenceID;
  /** @generated */
  final int     casFeatCode_SentenceID;
  /** @generated */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "org.apache.uima.GeneTaggingTypeSystem.SourceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceID);
  }
  /** @generated */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "org.apache.uima.GeneTaggingTypeSystem.SourceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SourceText;
  /** @generated */
  final int     casFeatCode_SourceText;
  /** @generated */ 
  public String getSourceText(int addr) {
        if (featOkTst && casFeat_SourceText == null)
      jcas.throwFeatMissing("SourceText", "org.apache.uima.GeneTaggingTypeSystem.SourceText");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SourceText);
  }
  /** @generated */    
  public void setSourceText(int addr, String v) {
        if (featOkTst && casFeat_SourceText == null)
      jcas.throwFeatMissing("SourceText", "org.apache.uima.GeneTaggingTypeSystem.SourceText");
    ll_cas.ll_setStringValue(addr, casFeatCode_SourceText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SourceText_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceID = jcas.getRequiredFeatureDE(casType, "SentenceID", "uima.cas.String", featOkTst);
    casFeatCode_SentenceID  = (null == casFeat_SentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceID).getCode();

 
    casFeat_SourceText = jcas.getRequiredFeatureDE(casType, "SourceText", "uima.cas.String", featOkTst);
    casFeatCode_SourceText  = (null == casFeat_SourceText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SourceText).getCode();

  }
}



    