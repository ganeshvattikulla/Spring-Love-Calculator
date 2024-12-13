package com.lc.API;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	
	@NotBlank(message = "*Your Name should not be empty")
	@Size(min=3,max=15,message="*Name should be min 3 to 15 letters")
	
	private String userName;
	
	@NotBlank(message = "*Your Name should not be empty")
	@Size(min=3,max=15,message="*Name should be min 3 to 15 letters")
	
	private String crushName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}
