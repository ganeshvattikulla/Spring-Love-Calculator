package com.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.lc.API.registerationDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return registerationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.notEmpty", "userName cant be empty");
		String userName = ((registerationDTO) object).getUserName();

		if (!userName.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString", "UserName must contains '_'");
		}

	}

}
