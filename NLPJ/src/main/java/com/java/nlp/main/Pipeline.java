package com.java.nlp.main;


import java.util.Properties;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {

	private static Properties properties;
	private static String propertyname="";
	private static StanfordCoreNLP sanfordCoreNLP; 
	
	private Pipeline()
	{
		
	}
	
	public static StanfordCoreNLP getPipeline()
	{
		
		if(sanfordCoreNLP==null)
			sanfordCoreNLP=new StanfordCoreNLP(properties);
		
		return sanfordCoreNLP;
	}
	
	static {
		
		properties=new Properties();
		properties.setProperty("annotator", propertyname);
		
	}
	
}