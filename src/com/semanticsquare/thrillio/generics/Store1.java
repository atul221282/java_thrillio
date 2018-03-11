package com.semanticsquare.thrillio.generics;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class Store1<T extends User> {
	private T value;

	public Store1(T value) {
		this.value = value;
	}

	public <TUser extends User> String getFor(TUser data) {

		String name = data.getName() + " " + value.getName();

		return name;
	}

	public <TUser extends User> TUser getUser(TUser data) {
		// TODO : Use Func<T> style to implement strategy pattern
		Class<? extends User> users = data.getClass();
		try {
			Method setName = users.getMethod("setName", String.class);
			setName.invoke(data, "Princess " + data.getName());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception : " + e);
		}

		return data;
	}

	public void addUser(List<User> users) {
		List<String> ss = users.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println("Users are :" + ss);
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
