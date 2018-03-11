package com.semanticsquare.thrillio.generics;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store1<?> store = new Store1<>(new AdminUser("Admin"));

		Store1<?> storeEmp = new Store1<>(new Employee("Employee"));

		// System.out.println(store.getFor(new Employee("Atul")));

		// System.out.println(storeEmp.getFor(new AdminUser("Kapil")));

		store.addUser(Arrays.asList(new AdminUser("Atul"), new Employee("Bhanu")));

		User ad = store.getUser(new AdminUser("Iha"));

		System.out.println(ad.getName());
	}

}
