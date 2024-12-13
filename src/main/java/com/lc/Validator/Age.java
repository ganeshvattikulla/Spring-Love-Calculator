package com.lc.Validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ageValidator.class)
public @interface Age {
	String message() default "{invalidAge}";

	int lower()default 0;

	int upper()default 100;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
