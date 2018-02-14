package com.java.component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomNameValidation implements ConstraintValidator<isValidName, String>{

	private String name;
	@Override
	public void initialize(isValidName constraintAnnotation) {
		name= constraintAnnotation.listOfValidNames();
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
	if(value==null)
		return false;
	/*if(value.matches("Payal|payal|admin")){
		return true;
	}*/
	if(value.matches(name))
		return true;
	return false;
	}
	
}
