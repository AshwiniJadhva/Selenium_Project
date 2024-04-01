package com.basics;

public class Test {

	void m1() {
		this.m2();
		System.out.println("this is m1");
		System.out.println(this);
	}

	void m2() {
		// this.m1();
		System.out.println("this is m2");
		System.out.println(this);
	}

	void m3() {
		System.out.println("this is m3");
		this.m1();
		System.out.println(this);
	}

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.m1();
		Test t2 = new Test();
		t2.m2();
		t2.m1();

	}

}
