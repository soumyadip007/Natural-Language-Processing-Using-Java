package com.nlp;

import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {

	private static Properties properties;
	private static String propertyname="";
	private static StanfordCoreNLP sanfordCoreNLP; 
	
	private Pipeline()
	{
		//hiding object
	}
	
	public static StanfordCoreNLP getPipeline()
	{
		
		if(sanfordCoreNLP==null)
			sanfordCoreNLP=new StanfordCoreNLP(propertyname);
		
		return sanfordCoreNLP;
	}
}
