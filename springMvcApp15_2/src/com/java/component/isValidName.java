package com.java.component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=MyCustomNameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface isValidName {
	
	// * Providing default makes this attribute as optional
	 
	String listOfValidNames() default "Payal";
	/*
	 * default error message if invalidated
	 */
	String message() default "Please provide username as Payal or admin";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default{};
}
