package com.lc.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ageValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;

	public void initialize(Age age) {
		this.lower = age.lower();
		this.upper = age.upper();

	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {

		if (age == null || age < lower || age > upper) {
			return false;
		}
		return true;
	}

}
