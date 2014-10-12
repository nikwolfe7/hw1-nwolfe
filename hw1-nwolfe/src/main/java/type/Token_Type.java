
/* First created by JCasGen Wed Oct 01 16:13:53 EDT 2014 */
package type;

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

/** An individual word token within a text separated by
        spaces and assigned with a part of speech.
 * Updated by JCasGen Sun Oct 12 02:56:50 EDT 2014
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("type.Token");
 
  /** @generated */
  final Feature casFeat_wordToken;
  /** @generated */
  final int     casFeatCode_wordToken;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWordToken(int addr) {
        if (featOkTst && casFeat_wordToken == null)
      jcas.throwFeatMissing("wordToken", "type.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_wordToken);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWordToken(int addr, String v) {
        if (featOkTst && casFeat_wordToken == null)
      jcas.throwFeatMissing("wordToken", "type.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_wordToken, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tagPOS;
  /** @generated */
  final int     casFeatCode_tagPOS;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTagPOS(int addr) {
        if (featOkTst && casFeat_tagPOS == null)
      jcas.throwFeatMissing("tagPOS", "type.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tagPOS);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTagPOS(int addr, String v) {
        if (featOkTst && casFeat_tagPOS == null)
      jcas.throwFeatMissing("tagPOS", "type.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_tagPOS, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_wordToken = jcas.getRequiredFeatureDE(casType, "wordToken", "uima.cas.String", featOkTst);
    casFeatCode_wordToken  = (null == casFeat_wordToken) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wordToken).getCode();

 
    casFeat_tagPOS = jcas.getRequiredFeatureDE(casType, "tagPOS", "uima.cas.String", featOkTst);
    casFeatCode_tagPOS  = (null == casFeat_tagPOS) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tagPOS).getCode();

  }
}



    