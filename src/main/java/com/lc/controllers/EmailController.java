package com.lc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.lc.API.EmailDTO;
import com.lc.service.LCAppEmailServiceImpl;

@Controller
public class EmailController {
	@Autowired
	private LCAppEmailServiceImpl lCAppEmailServiceImpl;

	@RequestMapping("/sendEmail/{userName}")
	public String sendingEmail(@PathVariable("userName") String userName, @ModelAttribute("ed") EmailDTO emaildto,
			Model model) {

		model.addAttribute("userName", userName.toUpperCase());

		return "EmailPage";

	}

	@RequestMapping("/Emailsent")
	// @CookieValue("lvApp_userName")String userName-when i want use the cookie for
	// this handeler i use this parameter in the method then add to the model
	public String sendEmail(@SessionAttribute("Relation") String relationResult,
			@ModelAttribute("ed") EmailDTO emaildto, Model model, HttpSession session) {
		// model.addAttribute("userName", userName.toUpperCase());

		String userName = (String) session.getAttribute("session_userName");
		lCAppEmailServiceImpl.sendEmail(userName, emaildto.getUserEmail(), relationResult);

		return "sent-emailPage";

	}

}
