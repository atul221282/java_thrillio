package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.entities.*;
import com.semanticsquare.thrillio.service.*;

import com.semanticsquare.thrillio.constants.*;

public class DataStore {
	private static final int USER_BOOKMARK_LIMIT = 5;
	private static final int BOOKMARK_COUNT_PER_TYPE = 5;
	private static final int BOOKMARK_TYPES_COUNT = 3;
	private static final int TOTAL_USER_COUNT = 5;

	private static User[] users = new User[TOTAL_USER_COUNT];
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	private static UserBookmark[] userBookmark = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];

	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovies();
		loadBooks();
	}

	private static void loadUsers() {
		users[0] = UserService.getInstance().createUser(1000, "user0@semanticsquare.com", "John", Gendre.MALE, "JML",
				"test", UserType.USER);
		users[1] = UserService.getInstance().createUser(1001, "user1@semanticsquare.com", "Sam", Gendre.MALE, "SML",
				"test", UserType.USER);
		users[2] = UserService.getInstance().createUser(1002, "user2@semanticsquare.com", "Anitha", Gendre.MALE, "AFL",
				"test", UserType.USER);
		users[3] = UserService.getInstance().createUser(1003, "user3@semanticsquare.com", "Sara", Gendre.MALE, "SFL",
				"test", UserType.USER);
		users[4] = UserService.getInstance().createUser(1004, "user4@semanticsquare.com", "Dheeru", Gendre.MALE, "DML",
				"test", UserType.USER);
	}

	private static void loadWebLinks() {
		bookmarks[0][0] = BookmarkService.getInstance().createWebLink(2000, "Taming Tiger", "http://www.javaworld.com",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html");
		bookmarks[0][1] = BookmarkService.getInstance().createWebLink(2001,
				"How do I import a pre-existing Java project into Eclipse and get up and running?",
				"http://www.stackoverflow.com",
				"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running");
		bookmarks[0][2] = BookmarkService.getInstance().createWebLink(2002, "Interface vs Abstract Class",
				"http://mindprod.com	unknown", "http://mindprod.com/jgloss/interfacevsabstract.html");
		bookmarks[0][3] = BookmarkService.getInstance().createWebLink(2003, "NIO tutorial by Greg Travis",
				"http://cs.brown.edu", "http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf");
		bookmarks[0][4] = BookmarkService.getInstance().createWebLink(2004, "Virtual Hosting and Tomcat",
				"http://tomcat.apache.org", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html");
	}

	private static void loadMovies() {
		bookmarks[1][0] = BookmarkService.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles", "Classics" },
				MovieGenre.ANIME_AND_ANIMATION, 8.5);
		bookmarks[1][1] = BookmarkService.getInstance().createMovie(3001, "Some Movie", "", 1981,
				new String[] { "X Y", "Z X" }, new String[] { "C V", "V B" }, MovieGenre.ACTION_AND_ADVENTURE, 1.5);
		bookmarks[1][2] = BookmarkService.getInstance().createMovie(3002, "Awesome Movie", "", 2001,
				new String[] { "A S", "D F" }, new String[] { "G H", "J K" }, MovieGenre.CLASSIC_MOVIE_MUSICALS, 7.5);
		bookmarks[1][3] = BookmarkService.getInstance().createMovie(3003, "Bad Movie", "", 2018,
				new String[] { "K L", "M Z" }, new String[] { "HU WWW", "KA trt" }, MovieGenre.GAY_AND_LESBIAN, 6.5);
		bookmarks[1][4] = BookmarkService.getInstance().createMovie(3004, "Good Movie", "", 2012,
				new String[] { "Q W", "E R" }, new String[] { "O W", "CL" }, MovieGenre.HORROR, 9.5);
	}

	private static void loadBooks() {
		bookmarks[2][0] = BookmarkService.getInstance().createBook(1, "T1", 2000, "PUB 1", new String[] { "A", "B" },
				BookGenre.ART, 1.1);
		bookmarks[2][1] = BookmarkService.getInstance().createBook(2, "T2", 2001, "PUB 2", new String[] { "C", "D" },
				BookGenre.HISTORY, 2.2);
		bookmarks[2][2] = BookmarkService.getInstance().createBook(3, "T3", 2002, "PUB 3", new String[] { "E", "F" },
				BookGenre.FICTION, 3.1);
		bookmarks[2][3] = BookmarkService.getInstance().createBook(4, "T4", 2003, "PUB 4", new String[] { "G", "H" },
				BookGenre.RELIGION, 4.4);
		bookmarks[2][4] = BookmarkService.getInstance().createBook(5, "T5", 2004, "PUB 5", new String[] { "O", "J" },
				BookGenre.RELIGION, 5.5);
	}

	/**
	 * @return the users
	 */
	public static User[] getUsers() {
		return users;
	}

	/**
	 * @return the bookmarks
	 */
	public static Bookmark[][] getBookMarks() {
		return bookmarks;
	}

	/**
	 * @return the userBookmark
	 */
	public static UserBookmark[] getUserBookmark() {
		return userBookmark;
	}

	/**
	 * @param userBookmark the userBookmark to set
	 */
	public static void setUserBookmark(UserBookmark[] userBookmark) {
		DataStore.userBookmark = userBookmark;
	}
}
