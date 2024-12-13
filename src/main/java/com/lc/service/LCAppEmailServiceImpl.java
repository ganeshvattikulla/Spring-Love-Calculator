package com.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class LCAppEmailServiceImpl implements LCAppEmailService {
	@Autowired
	private JavaMailSender javaMailSenderImpl;

	@Override
	public void sendEmail(String userName, String userEmail, String Result) {
		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		newEmail.setSubject("Love Calculator Application Result ");
		newEmail.setText("Hi " + userName + ", \n\nThe Result predicted by the Love calculator app is : "
				+ Result.toUpperCase());
		javaMailSenderImpl.send(newEmail);

	}

}
