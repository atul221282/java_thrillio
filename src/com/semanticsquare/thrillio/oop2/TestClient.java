package com.semanticsquare.thrillio.oop2;

public class TestClient {
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		// Interfaces demo
		C c = new X();
		c.foo();
		c.go();
	}
}