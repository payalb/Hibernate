package com.java.annotations;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator{

	@Override
	public void initialize(Annotation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {
		return true;
	}

}
