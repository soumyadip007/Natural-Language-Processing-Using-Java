package com.java.nlp;

import java.util.List;

import org.omg.CORBA.SystemException;

import com.java.nlp.main.Pipeline;

import edu.stanford.nlp.coref.CorefCoreAnnotations.CorefAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Parts_of_Speech {


	public static void main(String args[])
	{

		StanfordCoreNLP sanfordCoreNLP=Pipeline.getPipeline();
		
		String text="Hey! This is soumyadip";
		
		CoreDocument core=new CoreDocument(text);
		
		sanfordCoreNLP.annotate(core);
		
		List<CoreLabel> res=core.tokens();
		
		for(CoreLabel c:res)
		{
			String pos=c.get(CoreAnnotations.PartOfSpeechAnnotation.class);
			System.out.println(c.originalText()+" = "+pos);
		}
		
	}
}
