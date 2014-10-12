

/* First created by JCasGen Wed Oct 01 16:13:53 EDT 2014 */
package type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** An individual word token within a text separated by
        spaces and assigned with a part of speech.
 * Updated by JCasGen Sun Oct 12 02:56:50 EDT 2014
 * XML source: /home/nwolfe/git/hw1-nwolfe/hw1-nwolfe/src/main/resources/NamedEntityAnalysisEngineDescriptor.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: wordToken

  /** getter for wordToken - gets An individual word in the text.
   * @generated
   * @return value of the feature 
   */
  public String getWordToken() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_wordToken == null)
      jcasType.jcas.throwFeatMissing("wordToken", "type.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_wordToken);}
    
  /** setter for wordToken - sets An individual word in the text. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWordToken(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_wordToken == null)
      jcasType.jcas.throwFeatMissing("wordToken", "type.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_wordToken, v);}    
   
    
  //*--------------*
  //* Feature: tagPOS

  /** getter for tagPOS - gets The part of speech of the wordToken
   * @generated
   * @return value of the feature 
   */
  public String getTagPOS() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tagPOS == null)
      jcasType.jcas.throwFeatMissing("tagPOS", "type.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_tagPOS);}
    
  /** setter for tagPOS - sets The part of speech of the wordToken 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTagPOS(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_tagPOS == null)
      jcasType.jcas.throwFeatMissing("tagPOS", "type.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_tagPOS, v);}    
  }

    