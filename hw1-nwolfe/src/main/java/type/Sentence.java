

/* First created by JCasGen Wed Oct 01 16:13:53 EDT 2014 */
package type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** Identifier for the sentence being annotated.
 * Updated by JCasGen Sun Oct 12 02:56:50 EDT 2014
 * XML source: /home/nwolfe/git/hw1-nwolfe/hw1-nwolfe/src/main/resources/NamedEntityAnalysisEngineDescriptor.xml
 * @generated */
public class Sentence extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sentence(JCas jcas) {
    super(jcas);
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
  //* Feature: sentenceId

  /** getter for sentenceId - gets The actual ID of the string
   * @generated
   * @return value of the feature 
   */
  public String getSentenceId() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "type.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceId);}
    
  /** setter for sentenceId - sets The actual ID of the string 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceId(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "type.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceId, v);}    
   
    
  //*--------------*
  //* Feature: sentenceText

  /** getter for sentenceText - gets text of the sentences
   * @generated
   * @return value of the feature 
   */
  public String getSentenceText() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "type.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText);}
    
  /** setter for sentenceText - sets text of the sentences 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentenceText(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_sentenceText == null)
      jcasType.jcas.throwFeatMissing("sentenceText", "type.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_sentenceText, v);}    
  }

    