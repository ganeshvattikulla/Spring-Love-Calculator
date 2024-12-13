package com.lc.API;

public class Phone {
	private String countryCode;
	private String phnumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhnumber() {
		return phnumber;
	}

	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}

	@Override
	public String toString() {
		return getCountryCode() + " " + getPhnumber();
	}

}
