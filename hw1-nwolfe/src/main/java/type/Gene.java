

/* First created by JCasGen Wed Oct 01 16:13:53 EDT 2014 */
package type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A gene or protein mention within the text to be
        annotated
 * Updated by JCasGen Sun Oct 12 02:56:50 EDT 2014
 * XML source: /home/nwolfe/git/hw1-nwolfe/hw1-nwolfe/src/main/resources/NamedEntityAnalysisEngineDescriptor.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Gene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: geneContentString

  /** getter for geneContentString - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneContentString() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_geneContentString == null)
      jcasType.jcas.throwFeatMissing("geneContentString", "type.Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_geneContentString);}
    
  /** setter for geneContentString - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneContentString(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_geneContentString == null)
      jcasType.jcas.throwFeatMissing("geneContentString", "type.Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_geneContentString, v);}    
  }

    