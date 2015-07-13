package com.csc.search.dto;

public class PhoneBean {
private int id;
private int phoneNum;
private String state;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public PhoneBean(int id, int phoneNum, String state) {
	super();
	this.id = id;
	this.phoneNum = phoneNum;
	this.state = state;
}
public PhoneBean() {
	super();
	// TODO 自动生成的构造函数存根
}

}
