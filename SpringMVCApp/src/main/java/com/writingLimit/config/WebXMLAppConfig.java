package com.writingLimit.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXMLAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class classArr[]= {SpringAppConfig.class};
		return classArr;
	}

	@Override
	protected String[] getServletMappings() {
		String arrMapping[] = {"/writingCount.com/*"};
		return arrMapping;
	}
	
	
	
	

}
