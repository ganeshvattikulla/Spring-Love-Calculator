package com.lc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.API.UserInfoDTO;
import com.lc.service.LCAppServiceImpl;

@Controller
@SessionAttributes("Relation")
public class LoveController {
	@Autowired
	private LCAppServiceImpl lCAppServiceImpl;

	@RequestMapping("/")
	public String homePage(@ModelAttribute("ud") UserInfoDTO ud, HttpServletRequest request) {
		/*
		 * Cookie[] ck = request.getCookies();
		 * 
		 * for (Cookie temp : ck) { if ("lvApp_userName".equals(temp.getName())) {
		 * String userName = temp.getValue(); ud.setUserName(userName); } }
		 */

		return "home-page";

	}

	@RequestMapping("/sending-data")

	public String sendingData(@Valid @ModelAttribute("ud") UserInfoDTO ud, BindingResult bindingresult, Model model,
			HttpServletRequest request) {

		if (bindingresult.hasErrors()) {

			return "home-page";

		} else {

			// cookies are indeed used to store data in client side storage it makes
			// complicate.
			/*
			 * Cookie ck = new Cookie("lvApp_userName", ud.getUserName()); ck.setMaxAge(60 *
			 * 60 * 1);
			 * 
			 * response.addCookie(ck);
			 */

			String result = lCAppServiceImpl.calculate(ud.getUserName(), ud.getCrushName());
			model.addAttribute("Relation", result);//i use session attribute annotation for pratice and used in email controller

			HttpSession session = request.getSession();
			session.setAttribute("session_userName", ud.getUserName());
			//session.setAttribute("Relation", result.toUpperCase());

			return "Result-Page";
		}

	}

}
