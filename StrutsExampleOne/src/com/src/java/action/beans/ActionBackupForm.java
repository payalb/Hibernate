package com.src.java.action.beans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionBackupForm extends ActionForm{

	private static final long serialVersionUID = 6923668638099128549L;
	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){

		ActionErrors errors= new ActionErrors();
		if(name==null || name==""){
		errors.add("name",new ActionMessage("msg"));
		return errors;
		}
	return super.validate(mapping, request);
	}
}
