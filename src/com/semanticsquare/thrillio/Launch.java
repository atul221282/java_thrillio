/**
 * 
 */
package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.dao.BookmarkDao;
import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;

/**
 * @author AtulChaudhary
 *
 */
public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;
	private static String newLine = System.getProperty("line.separator");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkPassByValue();
		// callDummyDataStore();
	}

	private static void checkPassByValue() {
		// TODO Auto-generated method stub
		PassByValue byVal = new PassByValue();
		byVal.checkObject();
		System.out.println(newLine);
		System.out.println(newLine);
		byVal.checkPrimitive();
		System.out.println(newLine);
		byVal.variableSwap();
		System.out.println(newLine);
		byVal.objectReference();
	}

	private static void callDummyDataStore() {
		loadData();
		printUsers();
		printBookmarks();
		System.out.println("Finished Printing");
	}

	private static void loadData() {
		DataStore.loadData();
	}

	private static void printBookmarks() {
		bookmarks = new BookmarkDao().getBookmarks();
		for (Bookmark[] bookmarkArray : bookmarks) {
			for (Bookmark bookmark : bookmarkArray) {
				System.out.println("Book title: " + bookmark + newLine);
			}
		}
	}

	private static void printUsers() {
		users = new UserDao().getUsers();
		System.out.println(newLine);
		System.out.println(newLine);
		System.out.println(newLine);
		for (User user : users) {
			System.out.println("User: " + user.getUserDetails() + newLine);
		}
	}

}
