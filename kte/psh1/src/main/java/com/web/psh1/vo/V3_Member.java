
package com.web.psh1.vo;

import java.io.Serializable;

public class V3_Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8155394131783641600L;
	private String email = null;
	private String pw = null;
	private String name = null;
	private String phone = null;
	private String date1 = null;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	
	
}
