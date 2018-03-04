package com.semanticsquare.thrillio.oop;

public interface B extends A {

	void foo();

	default void fooBar() {
		System.out.println("foobar: B");
	}
}
