package com.kc.bootcamp.datatypes;

public class BooleanDataType {
	// if you donot intialize global or instance variable it takes default val;ues
	static boolean a;

	public static void main(String[] args) {
		// Must initialise local variable
		boolean flag = true;
		System.out.println(flag);
		System.out.println(a);
		
		// Invalid Values
		// 0 or 1
		// True  or False
		//"true"
		
		// wrapper class
		// Convert primitive data type to class
		//Boolean b = new Boolean("true");  constructor is removed
		Boolean b = Boolean.valueOf("true");
		System.out.println(b);
	}

}
