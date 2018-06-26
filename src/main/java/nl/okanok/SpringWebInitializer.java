package nl.okanok;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/", "/hook/version", "/hook/create", "/hook/merge", "/hook/push", "/settings/postAll"};
	}

	@Override
	protected Class[] getRootConfigClasses() {
		return new Class[] {};
	}

}