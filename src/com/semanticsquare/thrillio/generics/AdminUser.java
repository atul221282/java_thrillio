package com.semanticsquare.thrillio.generics;

public class AdminUser implements User {

	public AdminUser(String name) {
		Name = name;
	}

	private String Name;

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	public String toString() {
		return this.getName();
	}
}
