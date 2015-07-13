package com.csc.search.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectArray {
public static void main(String[] args) {
	int[] a1= new int[]{1,2,3};
	int[] a2 = new int[4];
	int[] [] a3 = new int[2][3];
	String [] a4 = new String[]{"a","b","c"};
	
	System.out.println(a1.getClass()==a2.getClass());
	System.out.println(a1.getClass().getName());
	System.out.println(a1.getClass().getSuperclass().getName());
	System.out.println(a4.getClass().getSuperclass().getName());
	
	
	Object aobj1 =a1;
	Object aobj2=a4;
	//Object[] aobj3=a1;
	Object[] aobj4 = a3;
	
	System.out.println(a1);
	System.out.println(a4);
	System.out.println(Arrays.asList(a1));
	System.out.println(Arrays.asList(a4));
	
	Object obj=a4;
	printObj("zxc");
	
}

private static void printObj(Object obj) {
	Class clazzClass=obj.getClass();
	if (clazzClass.isArray()) {
		int len =Array.getLength(obj);
		for(int i = 0;i<len;i++){
			System.out.println(Array.get(obj, i));
		}
	}else {
		System.out.println(obj);
	}
	
}
}
