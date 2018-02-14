package com.java;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MyServletConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext rootCtx = new AnnotationConfigWebApplicationContext();
		servletContext.addListener(new ContextLoaderListener(rootCtx));
			
		        AnnotationConfigWebApplicationContext dispatcherCtx = new AnnotationConfigWebApplicationContext();
		        dispatcherCtx.register(MyConfig.class);
		        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherCtx));
		        
		        
		        servlet.setLoadOnStartup(1);
		        servlet.addMapping("*.html");
	}


}


/*public class MyServletConfig extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return  new Class[] { MyConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "*.html" };
	}

}
*/