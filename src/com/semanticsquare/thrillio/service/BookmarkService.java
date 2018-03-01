
package com.semanticsquare.thrillio.service;

import com.semanticsquare.thrillio.entities.*;

public class BookmarkService {
	private static BookmarkService instance;

	private BookmarkService() {
	}

	/**
	 * @return the instance
	 */
	public static BookmarkService getInstance() {
		if (instance == null) {
			instance = new BookmarkService();
		}
		return instance;
	}

	public WebLink createWebLink(long id, String title, String host, String url) {
		WebLink webLink = new WebLink(id, title, "", host, url);
		return webLink;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, Double imdbRating) {
		Movie movie = new Movie(id, title, profileUrl, releaseYear, cast, directors, genre, imdbRating);
		return movie;
	}

	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre,
			double amazonRating) {
		Book book = new Book();

		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);

		return book;
	}
}
