package com.semanticsquare.thrillio.oop2;

/**
 * @author XYZ Inc.
 */
public class X extends AbstractA implements A, B, C, Cloneable {
	public void foo() {
		System.out.println("X: foo");
		System.out.println("VAL: " + B.VAL);
	}

	public void foobar() {
		System.out.println("X: foobar");
	}

	public C clone() {
		try {
			return (C) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void go() {
		//System.out.println("X: go");
		C.super.go();
	}

}