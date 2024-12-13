package com.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.API.Phone;
import com.lc.API.communicationDTO;
import com.lc.API.registerationDTO;
import com.lc.Validator.UserNameValidator;
import com.lc.Validator.emailValidator;

@Controller
public class registerController {
	@Autowired
	private emailValidator emailValid;

	@RequestMapping("/reg")
	public String registrationPage(@ModelAttribute("rud") registerationDTO rud) {
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setPhnumber("");
		communicationDTO c = new communicationDTO();
		c.setPhone(phone);
		rud.setCmunDTO(c);

		System.out.println("regpage called");
		return "registration-page";

	}

	@RequestMapping("/sending-registerData")
	public String sendingRegisterData(@Valid @ModelAttribute("rud") registerationDTO rud, BindingResult result) {

		emailValid.validate(rud, result);

		if (result.hasErrors()) {
			List<ObjectError> x = result.getAllErrors();

			for (ObjectError x1 : x) {
				System.out.println(x1);
			}
			return "registration-page";
		}
		System.out.println("regpage processed called");
		// System.out.println(rud.getName());
		return "registrationresult-sucess";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("inside initbinder");
		/*
		 * binder.setDisallowedFields("name");//it should bind this field insted of that
		 * registrationDto object first:disallowed the user get the name even they
		 * entered
		 */
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		// i need to register this property editor with spring by using binder.
		binder.registerCustomEditor(String.class, "name", editor);
		binder.addValidators(new UserNameValidator());
		// binder.addValidators(new emailValidator());

	}

}
