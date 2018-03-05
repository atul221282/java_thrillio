package com.semanticsquare.thrillio.oop2;

import java.lang.reflect.Constructor;

import com.semanticsquare.thrillio.entities.User;

/**
 * @author XYZ Inc.
 */
public class X extends AbstractA implements A, B, C, Cloneable {
	public void foo() {
		User us = new User(1);

		try {
			Class<User> cl = (Class<User>)Class.forName("com.semanticsquare.thrillio.entities.User");
			Constructor<User> cons = cl.getConstructor(int.class);
			Object o = cons.newInstance(12);
			long idValue = (long) o.getClass().getMethod("getId").invoke(o);
			System.out.println("Id value via reflection : " + idValue);

			long value2 = (long) us.getClass().getMethod("getId").invoke(us);

			System.out.println("Id value2 via reflection : " + value2);
		} catch (

		Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

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
		// System.out.println("X: go");
		C.super.go();
	}

}