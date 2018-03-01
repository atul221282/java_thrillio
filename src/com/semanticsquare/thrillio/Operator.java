package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Book;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// coumpoundOperator();
		OperatorBasicsDemo.process();
	}

	@SuppressWarnings("unused")
	private static void coumpoundOperator() {
		int x = 10;
		System.out.println("Before compund operator:- " + x);

		x -= 5;
		System.out.println("Before compund operator:- " + x);

		x = +x;
		System.out.println("When used x =+ x, value of x is " + x);

		x = -x;
		System.out.println("When used x =- x, value of x is " + x);

		int value = 'a' + 'b';
		System.out.println("'a'+'b'=" + value);

		double d = 1 / 2;
		System.out.println("1/2 when assigned to double variable = " + d);

		double dMod = 1 % 2;
		System.out.println("1%2 when assigned to double variable = " + dMod);

		Book s2 = null;
		Book val = s2 == null ? new Book("") : s2;

		String month = "";
		switch (month) {
		case "January": {
			break;
		}
		default:
			break;
		}
	}

}
