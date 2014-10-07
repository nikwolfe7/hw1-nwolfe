
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

/** A gene or protein mention within the text to be annotated
 * Updated by JCasGen Wed Oct 01 16:13:53 EDT 2014
 * @generated */
public class Gene_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gene(addr, Gene_Type.this);
  			   Gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gene(addr, Gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("type.Gene");
 
  /** @generated */
  final Feature casFeat_geneContentString;
  /** @generated */
  final int     casFeatCode_geneContentString;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneContentString(int addr) {
        if (featOkTst && casFeat_geneContentString == null)
      jcas.throwFeatMissing("geneContentString", "type.Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneContentString);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneContentString(int addr, String v) {
        if (featOkTst && casFeat_geneContentString == null)
      jcas.throwFeatMissing("geneContentString", "type.Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneContentString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_geneContentString = jcas.getRequiredFeatureDE(casType, "geneContentString", "uima.cas.String", featOkTst);
    casFeatCode_geneContentString  = (null == casFeat_geneContentString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneContentString).getCode();

  }
}



    