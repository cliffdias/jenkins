package com.cliff.test;

public class TestJenkins {

	public static void main(String[] args){
		
		TestJenkins test = new TestJenkins();
		
		int onePlusOne = test.onePlusOne(); 
		
		System.out.println("One Plus One is = " + onePlusOne);
	}
	
	public int onePlusOne(){
		return 1+2;
	}
}
