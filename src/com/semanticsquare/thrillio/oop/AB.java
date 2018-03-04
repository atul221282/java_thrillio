package com.semanticsquare.thrillio.oop;

public class AB extends AbstractA implements A, B {
	public int j = 0;

	@Override
	public void foo() {
		int val = A.i;
		System.out.println(val);
	}

	public void fooBar() {
		B.super.fooBar();
	}
}
