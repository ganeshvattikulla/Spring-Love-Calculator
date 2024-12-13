package com.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


//this initilizer approch gets developer has the complete control the DispatcherServlet object
public class LovecalculatorApplicationInitilizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
//		XmlWebApplicationContext webapplicationContxt = new XmlWebApplicationContext();
//		webapplicationContxt.setConfigLocation("classpath:beans.xml");  this is for Xml based approch...

		AnnotationConfigWebApplicationContext webapplicationContxt = new AnnotationConfigWebApplicationContext();
		webapplicationContxt.register(LoveApplicationConfig.class); //This is for java config based approch
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webapplicationContxt);
		ServletRegistration.Dynamic mycustomDispatcherServlet = servletContext.addServlet("mydispatcherServlet",
				dispatcherServlet);

		mycustomDispatcherServlet.setLoadOnStartup(1);
		mycustomDispatcherServlet.addMapping("/");

	}

}
