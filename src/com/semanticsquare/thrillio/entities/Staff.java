package com.semanticsquare.thrillio.entities;

public class Staff extends User {

	public Staff() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Staff(int id) {
		super(id);
	}

	public void printUserType() {
		System.out.println("This is staff type");
	}

	public void postAReview() {
		super.postAReview();
		System.out.println("This is staff review");
	}

	public static void staticA() {
		System.out.println("Staff Static A");
	}
}
