package com.basics;

public class Example1 {
	String processString(String[] str) {
		String output ="";
		for(int index = 0;index<str.length;index++) {
			if(!output.equals(str[index]))
				output = output+str[index];
				
		}
		return output;
	}
	public static void main(String[] args) {
		String arr[] = {"Hello", "hi","Techno"};
		Example1 ex1 = new Example1();
		String output = ex1.processString(arr);
		System.out.println(output);
	}
}


