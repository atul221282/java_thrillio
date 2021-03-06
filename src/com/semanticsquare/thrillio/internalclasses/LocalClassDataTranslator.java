package com.semanticsquare.thrillio.internalclasses;

import java.io.StringWriter;



public class LocalClassDataTranslator {

	public static String getBookAsXml(int id, String title, double rating, int fbLikesCount, int tweetCount) {

		class Book {
			private int id;
			private String title;
			private double rating;
			private int fbLikesCount;
			private int tweetCount;

			public Book(int id, String title, double rating, int fbLikesCount, int tweetCount) {
				this.id = id;
				this.title = title;
				this.rating = rating;
				this.fbLikesCount = fbLikesCount;
				this.tweetCount = tweetCount;
			}
		}

		Book book = new Book(id, title, rating, fbLikesCount, tweetCount);

		/*XStream xstream = new XStream(new StaxDriver());
		xstream.alias("book", Book.class);
		StringWriter writer = new StringWriter();
		xstream.marshal(book, new PrettyPrintWriter(writer));*/

		return book.toString();
		// return xstream.toXML(book);
	}

	public static void main(String[] args) {
		System.out.println(LocalClassDataTranslator.getBookAsXml(2002, "Interface vs Abstract Class", 3.0, 5, 6));
	}
}
