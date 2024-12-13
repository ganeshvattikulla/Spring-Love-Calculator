package com.lc.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.lc.formatter.phoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan("com.lc")
@PropertySource("classpath:email.properties")

public class LoveApplicationConfig implements WebMvcConfigurer {
	@Autowired
	private Environment env;

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		viewresolver.setPrefix("/WEB-INF/view/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;

	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside addformatter");
		registry.addFormatter(new phoneFormatter());
	}

	@Bean
	public MessageSource messageSouce() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		System.out.println("inside messagesource");
		return messageSource;

	}

	public LocalValidatorFactoryBean validator() {
		System.out.println("inside validor");
		LocalValidatorFactoryBean LocalValidatorFactoryBean = new LocalValidatorFactoryBean();
		LocalValidatorFactoryBean.setValidationMessageSource(messageSouce());

		return LocalValidatorFactoryBean;

	}

	@Override
	public Validator getValidator() {
		System.out.println("validator gets called");
		return validator();

	}

	@Bean
	public JavaMailSender getjavaMailSender() {

		JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
		javaMailSenderImpl.setHost(env.getProperty("mail.host"));
		javaMailSenderImpl.setUsername(env.getProperty("mail.username"));
		javaMailSenderImpl.setPassword(env.getProperty("mail.password"));// i use password for this Particular
																			// application its not original password.
		javaMailSenderImpl.setPort(Integer.parseInt(env.getProperty("mail.port")));

		javaMailSenderImpl.setJavaMailProperties(getMailPropeties());

		return javaMailSenderImpl;

	}

	private Properties getMailPropeties() {
		Properties mailProperties = new Properties();

		mailProperties.put("mail.transport.protocol", "smtp");
		mailProperties.put("mail.smtp.auth", "true");
		mailProperties.put("mail.smtp.starttls.enable", "true"); // Corrected property
		mailProperties.put("mail.smtp.starttls.required", "true");
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		mailProperties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		return mailProperties;
	}
}
