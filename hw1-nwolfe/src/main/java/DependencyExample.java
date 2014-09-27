import java.io.StringReader;

import edu.stanford.nlp.ling.Word;
import edu.stanford.nlp.objectbank.TokenizerFactory;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;
import edu.stanford.nlp.process.Tokenizer;

/**
 * An example for Homework 0 for 11-791 F14
 * 
 * @author nwolfe
 * 
 */
public class DependencyExample {

  /**
   * Tokenize a sentence in the argument, and print out the tokens to the console.
   * 
   * @param args
   *          Set the first argument as the sentence to be tokenized
   */
  public static void main(String[] args) {
    TokenizerFactory<Word> tokenizerFactory = PTBTokenizerFactory.newTokenizerFactory();
    Tokenizer<Word> tokenizer = tokenizerFactory.getTokenizer(new StringReader(args[0]));
    System.out.println(tokenizer.tokenize());
  }

}
