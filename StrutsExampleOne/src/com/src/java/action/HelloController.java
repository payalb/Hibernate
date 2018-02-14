package com.src.java.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloController extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response){
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		
		return mapping.findForward("success");
		
	}

}
