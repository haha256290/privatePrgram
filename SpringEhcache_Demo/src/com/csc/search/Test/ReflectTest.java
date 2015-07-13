package com.csc.search.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;


public class ReflectTest {
public static void main(String[] args) throws ClassNotFoundException, Exception{
	String str1="abc";
	Class cls1=str1.getClass();
	Class cls2 = String.class;
	Class cls3 = Class.forName("java.lang.String");
	
	 Constructor<String> constr = String.class.getConstructor(StringBuffer.class);
	 String str2=constr.newInstance(new StringBuffer("abc"));
	 System.out.println(str2.charAt(2));
	 
	 ReflectPoint pt1= new ReflectPoint(3, 5);
	 Field fieldY = pt1.getClass().getField("y");
	 fieldY.get(pt1);
	 
	 Field fieldX = pt1.getClass().getDeclaredField("x");
	 fieldX.setAccessible(true);
	 System.out.println(fieldX.get(pt1));
	 
	 changStringValue(pt1);
	 System.out.println(pt1);
	 
	 Method[] methodSet = String.class.getDeclaredMethods();
	 for (Method method : methodSet) {
		
	
		 
		System.out.println(method.getName());
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
	}
	 Method methodCharAt = String.class.getMethod("charAt", int.class);
	 //System.out.println(methodCharAt.invoke(str1, 2));
	 
//	 TestArgument.main(new String[]{"111","222"});
	 //String startingClassName = args[0];
	 //Method mainMethod=Class.forName(startingClassName).getMethod("main", String[].class);
	 //mainMethod.invoke(null, new String[]{"111","222"});
	 
}

private static void changStringValue(Object obj) throws IllegalArgumentException, IllegalAccessException {
	Field[] fields=obj.getClass().getFields();
	
	for (Field field : fields) {
		field.setAccessible(true);
		if (field.getType() == String.class) {
			String oldvalue=(String) field.get(obj);
			String newValue = oldvalue.replace('b', 'a'); 
			field.set(obj, newValue);
		}
	}
}
  static class  TestArgument{
	  public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
	  
  } 

}
