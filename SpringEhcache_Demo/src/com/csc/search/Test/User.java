package com.csc.search.Test;

import java.io.Serializable;

public class User implements Serializable{
/** 
	
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	
	*/ 
	private static final long serialVersionUID = -1036824911130379293L;
private String id;
private String str;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
public User(String id, String str) {
	super();
	this.id = id;
	this.str = str;
}
public User() {
	super();
	// TODO 自动生成的构造函数存根
}

}
