package com.cts.springmvc.cts.srpingmvc;

public class User {
	private String mobile;
	private String mail;
	private String pan;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "User [mobile=" + mobile + ", mail=" + mail + ", pan=" + pan + "]";
	}
	

}
