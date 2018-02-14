package com.java.component;

import java.beans.PropertyEditorSupport;


public class MyCustomNameEditor extends PropertyEditorSupport{
	
	@Override
	 public void setAsText(String name) throws java.lang.IllegalArgumentException {
	        if (name.length()<=0) {
	            setValue("xxx");
	            return;
	        }
	        setValue(name);
	    }

}
