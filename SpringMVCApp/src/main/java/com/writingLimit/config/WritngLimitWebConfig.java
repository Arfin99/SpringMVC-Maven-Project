package com.writingLimit.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//web.xml
public class WritngLimitWebConfig {//implements WebApplicationInitializer {

	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	 //  XmlWebApplicationContext webAC = new XmlWebApplicationContext();
	  // webAC.setConfigLocations("classpath:appconfig.xml");
	   
	   AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
	   wac.register(SpringAppConfig.class);
	   
	   DispatcherServlet ds = new DispatcherServlet(wac);
	   
	   ServletRegistration.Dynamic servlet =servletContext.addServlet("MyDS",ds);
	   
	   servlet.setLoadOnStartup(1);
	   servlet.addMapping("/writingCount.com/*");

	}
*/
}
