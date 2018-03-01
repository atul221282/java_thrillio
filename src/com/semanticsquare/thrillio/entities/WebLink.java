package com.semanticsquare.thrillio.entities;

public class WebLink extends Bookmark {
	private String url;
	private String host;

	public WebLink(long id, String title, String profile, String host, String url) {
		// TODO Auto-generated constructor stub
		this.host = host;
		this.url = url;
		this.setTitle(title);
		this.setId(id);
		this.setProfileUrl(profile);
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
}
