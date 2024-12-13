package com.lc.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lc.API.registerationDTO;
@Component
public class emailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return registerationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cmunDTO.email", "email.notEmpty", "email cant be empty");
		String email = ((registerationDTO) target).getCmunDTO().getEmail();

		if (!email.endsWith("@gmail.com")) {
			errors.rejectValue("cmunDTO.email", "email.invalidDomain", "* ends with @gmail.com");

		}

		// TODO Auto-generated method stub

	}

}
