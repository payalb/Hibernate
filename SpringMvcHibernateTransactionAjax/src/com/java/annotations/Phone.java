package com.java.annotations;

import javax.validation.Constraint;

@Constraint(validatedBy= PhoneValidator.class)
public @interface Phone {

}
