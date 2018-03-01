package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;

public class UserDao {

	/**
	 * Gets the user
	 * 
	 * @return User[]
	 */
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
