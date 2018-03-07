/**
 * 
 */
package com.semanticsquare.thrillio.optional;

import java.util.Optional;

import com.semanticsquare.thrillio.entities.User;

/**
 * @author AtulChaudhary
 *
 */
public interface IUserDao {
	Optional<User> getUser(Long id);
}
