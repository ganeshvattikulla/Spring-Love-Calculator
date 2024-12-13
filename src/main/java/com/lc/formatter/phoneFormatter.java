package com.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.lc.API.Phone;

public class phoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone p, Locale locale) {

		return  "";
	}

	@Override
	public Phone parse(String completePhnumber, Locale locale) throws ParseException {
		Phone p = new Phone();
		String[] pharry = completePhnumber.split("-");
		int index = completePhnumber.indexOf("-");

		if (completePhnumber.startsWith("-") || index == -1) {
			p.setCountryCode("+91");
			
			if (completePhnumber.startsWith("-")) {p.setPhnumber(pharry[1]);}
			else {p.setPhnumber(pharry[0]);}
			
		} else {
			p.setCountryCode(pharry[0]);
			p.setPhnumber(pharry[1]);
		}

		return p;

	}

}
