package com.bean;

import java.util.Objects;

public class User {
	
	private String userName;
	private String password;
	private String securityQuestion;
	private String securityAnswer;
	
	
	public User(String userName, String password, String securityQuestion, String securityAnswer) {
		super();
		this.userName = userName;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSecurityQuestion() {
		return securityQuestion;
	}


	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}


	public String getSecurityAnswer() {
		return securityAnswer;
	}


	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(password, securityAnswer, securityQuestion, userName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && Objects.equals(securityAnswer, other.securityAnswer)
				&& Objects.equals(securityQuestion, other.securityQuestion) && Objects.equals(userName, other.userName);
	}
	
	

}
