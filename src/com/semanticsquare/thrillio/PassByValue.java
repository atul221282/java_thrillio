package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.*;

public class PassByValue {
	int id = 1000;
	Book book = new Book();

	public void checkPrimitive() {
		System.out.println("Id should not change. It will be 1000");
		System.out.println(id);
		updateId(id);
		System.out.println(id);
	}

	private void updateId(int id) {
		// This Id is the local variable which is passed as parameter
		id = 1001;
	}

	public void checkObject() {
		System.out.println("Id should change from 2000 to 2001");
		book.setId(2000);
		System.out.println(book.getId());
		updateBookObject(book);
		System.out.println(book.getId());
		omitted(true, 1, 2, 3);
	}

	public void objectReference() {
		System.out.println("Object reference");
		Book b = new Book();
		Book b2 = b;
		b2.setPublisher("publisher");
		System.out.println(b.getPublisher());
		b.setPublisher("Atul");
		System.out.println(b2.getPublisher());
	}

	private void omitted(boolean param1, int... items) {
		int[] arr = items;
		System.out.println("Printing Array");
		for (int i : arr) {
			System.out.println(i);
		}
		int len = items.length-1;
		int gg = arr[len];
	}

	private void updateBookObject(Book book1) {
		book1.setId(2001);
	}

	public void variableSwap() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a + "   " + b);
	}
}
