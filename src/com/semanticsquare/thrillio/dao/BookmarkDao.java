package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.Bookmark;

public class BookmarkDao {

	/**
	 * Gets the bookmark
	 * 
	 * @return BookMark[][]
	 */
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookMarks();
	}
}
