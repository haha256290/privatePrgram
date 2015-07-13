package com.csc.search.Test;

public class ReflectPoint {
private int x;
public int y;
public String str1="ball";
private String str2="basketball";
private String str3="itcast";

public ReflectPoint(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}

@Override
public String toString() {
	return "ReflectPoint [x=" + x + ", y=" + y + ", str1=" + str1 + ", str2="
			+ str2 + ", str3=" + str3 + "]";
}

}
