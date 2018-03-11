package com.semanticsquare.thrillio.generics;

import java.util.List;

public class Store<T extends User> {
	private T value;

	public Store(T value) {
		this.value = value;
	}

	public <TUser extends User> String getFor(TUser data) {

		String name = data.getName() + value.getName();

		return name;
	}

	public void addUser(List<User> users) {
		System.out.println("Users are :" + users);
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
}
