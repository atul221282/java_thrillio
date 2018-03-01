package com.semanticsquare.thrillio.entities;

public class Movie extends Bookmark {
	private int releaseYear;
	private String[] cast;
	private String[] directors;
	private String genre;
	private double imdbRating;

	public Movie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors,
			String genre, Double imdbRating) {
		this.cast = cast;
		this.directors = directors;
		this.genre = genre;
		this.imdbRating = imdbRating;
		this.releaseYear = releaseYear;
	}

	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}

	/**
	 * @param releaseYear
	 *            the releaseYear to set
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	/**
	 * @return the cast
	 */
	public String[] getCast() {
		return cast;
	}

	/**
	 * @param cast
	 *            the cast to set
	 */
	public void setCast(String[] cast) {
		this.cast = cast;
	}

	/**
	 * @return the directors
	 */
	public String[] getDirectors() {
		return directors;
	}

	/**
	 * @param directors
	 *            the directors to set
	 */
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre
	 *            the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the imdbRaing
	 */
	public double getImdbRaing() {
		return imdbRating;
	}

	/**
	 * @param imdbRaing
	 *            the imdbRaing to set
	 */
	public void setImdbRaing(double imdbRaing) {
		this.imdbRating = imdbRaing;
	}

}
