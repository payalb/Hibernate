package com.java.tags;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagHandler extends SimpleTagSupport{
	
	private float number;
	private String format;
	@Override
	public void doTag() throws JspException, IOException{
		JspContext context= getJspContext();
		JspWriter writer= context.getOut();
		DecimalFormat formatter= new DecimalFormat(format);
		String result= formatter.format(number);
		writer.println(result);
	}

	public void setNumber(float number) {
		this.number = number;
	}
	
	public void setFormat(String format) {
		this.format = format;
	}
}
