package com.semanticsquare.thrillio.entities;

public class Bookmark {
	private long id;
	private String title;
	private String profileUrl;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the profileUrl
	 */
	public String getProfileUrl() {
		return profileUrl;
	}

	/**
	 * @param profile
	 *            the profileUrl to set
	 */
	public void setProfileUrl(String profile) {
		this.profileUrl = profile;
	}
}
