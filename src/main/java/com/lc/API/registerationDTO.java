package com.lc.API;

import com.lc.Validator.Age;

public class registerationDTO {
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobby;
	private String gender;
	private communicationDTO cmunDTO;
	
	@Age(lower=20,upper=40)
	private Integer age;

	public Integer getAge() {

		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public communicationDTO getCmunDTO() {
		return cmunDTO;
	}

	public void setCmunDTO(communicationDTO cmunDTO) {
		this.cmunDTO = cmunDTO;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
