package org.mav;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.internal.annotations.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedClass implements IAnnotationTransformer {

	public void transform(ITestAnnotation arg0, Class arg1, Constructor agr2, Method arg3) {
	
		IRetryAnalyzer retryAnalyzer = arg0.getRetryAnalyzer();
		
		if(retryAnalyzer==null) {
			
			arg0.setRetryAnalyzer(FailClass.class);
		
	}
	

}}
