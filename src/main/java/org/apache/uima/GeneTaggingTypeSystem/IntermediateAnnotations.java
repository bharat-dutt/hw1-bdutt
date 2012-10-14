

/* First created by JCasGen Wed Oct 10 23:23:49 EDT 2012 */
package org.apache.uima.GeneTaggingTypeSystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sat Oct 13 19:28:07 EDT 2012
 * XML source: C:/eclipse/Workspace/hw1-bdutt/Descriptor/GeneTaggingSystemBioAE.xml
 * @generated */
public class IntermediateAnnotations extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(IntermediateAnnotations.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected IntermediateAnnotations() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public IntermediateAnnotations(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public IntermediateAnnotations(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public IntermediateAnnotations(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: ID

  /** getter for ID - gets 
   * @generated */
  public String getID() {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_ID);}
    
  /** setter for ID - sets  
   * @generated */
  public void setID(String v) {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_ID == null)
      jcasType.jcas.throwFeatMissing("ID", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    jcasType.ll_cas.ll_setStringValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_ID, v);}    
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets 
   * @generated */
  public String getName() {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_Name);}
    
  /** setter for Name - sets  
   * @generated */
  public void setName(String v) {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    jcasType.ll_cas.ll_setStringValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_Name, v);}    
   
    
  //*--------------*
  //* Feature: StartSpan

  /** getter for StartSpan - gets 
   * @generated */
  public int getStartSpan() {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_StartSpan == null)
      jcasType.jcas.throwFeatMissing("StartSpan", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_StartSpan);}
    
  /** setter for StartSpan - sets  
   * @generated */
  public void setStartSpan(int v) {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_StartSpan == null)
      jcasType.jcas.throwFeatMissing("StartSpan", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    jcasType.ll_cas.ll_setIntValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_StartSpan, v);}    
   
    
  //*--------------*
  //* Feature: EndSpan

  /** getter for EndSpan - gets 
   * @generated */
  public int getEndSpan() {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_EndSpan == null)
      jcasType.jcas.throwFeatMissing("EndSpan", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_EndSpan);}
    
  /** setter for EndSpan - sets  
   * @generated */
  public void setEndSpan(int v) {
    if (IntermediateAnnotations_Type.featOkTst && ((IntermediateAnnotations_Type)jcasType).casFeat_EndSpan == null)
      jcasType.jcas.throwFeatMissing("EndSpan", "org.apache.uima.GeneTaggingTypeSystem.IntermediateAnnotations");
    jcasType.ll_cas.ll_setIntValue(addr, ((IntermediateAnnotations_Type)jcasType).casFeatCode_EndSpan, v);}    
  }

    