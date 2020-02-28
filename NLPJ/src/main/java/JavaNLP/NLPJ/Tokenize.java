package JavaNLP.NLPJ;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Tokenize {

	public static void main(String args[])
	{
		StanfordCoreNLP sanfordCoreNLP=Pipeline.getPipeline();
		
		String text="Hey! This is soumyadip";
		
		CoreDocument core=new CoreDocument(text);
		
		sanfordCoreNLP.annotate(core);
		
		List<CoreSentence> res=core.sentences();
		
		
	}
}
