package com.csc.search.Test;

public class VariableParameter {
public static void main(String[] args) {
	System.out.println(add(1, 2));
	System.out.println(add(1, 2,3));
	System.out.println(add(1, 2,3,4));
}

public static int add(int x,int ... args) {
	int sum = x;
/*	for (int i = 0; i < args.length; i++) {
		 sum += args[i];
	}
*/	
	for (int i : args) {
		sum+=i;
	}
	return sum;
}

}
