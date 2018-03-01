package com.semanticsquare.thrillio.service;

import com.semanticsquare.thrillio.entities.User;

public class UserService {
	private static UserService instance;

	private UserService() {
	}

	/**
	 * @return the instance
	 */
	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	/**
	 * 
	 * @param id
	 * @param email
	 * @param firstName
	 * @param gender
	 * @param lastName
	 * @param password
	 * @param userType
	 * @return the user
	 */
	public User createUser(long id, String email, String firstName, int gender, String lastName, String password,
			String userType) {
		User user = new User(id, email, firstName, gender, lastName, password, userType);

		return user;
	}
}
