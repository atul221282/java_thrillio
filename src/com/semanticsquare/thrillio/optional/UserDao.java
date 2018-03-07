package com.semanticsquare.thrillio.optional;

import java.util.Optional;

import com.semanticsquare.thrillio.entities.User;

public class UserDao implements IUserDao {

	public Optional<User> getUser(Long id) {
		if (id != null) {
			return Optional.empty();
		}
		return Optional.of(new User(id.intValue()));
	}
}
