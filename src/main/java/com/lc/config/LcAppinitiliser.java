package com.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//this intilizer approch Spring is taking control and creating the DS object.
public class LcAppinitiliser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = { LoveApplicationConfig.class };

		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/" };

		return arr;
	}

}
