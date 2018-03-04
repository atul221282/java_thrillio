package com.semanticsquare.thrillio.entities;

public class BookType {

	private int type;
	private String name;
	private BookType(int type, String name) {
		this.type = type;
		this.name = name;
	}

	public static BookType programming = new BookType(1, "Programming");

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
