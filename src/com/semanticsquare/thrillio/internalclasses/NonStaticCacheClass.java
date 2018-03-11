package com.semanticsquare.thrillio.internalclasses;

interface CacheIterator {
	boolean hasNext();

	NonStaticBookmark next();
}

public class NonStaticCacheClass {
	private NonStaticBookmark[] items;
	private int next = 0;

	public NonStaticCacheClass(int size) {
		items = new NonStaticBookmark[size];
	}

	public void add(NonStaticBookmark item) {
		if (next < items.length)
			items[next++] = item;
	}

	public CacheIterator iterator() {
		return new MyCacheIterator();
	}

	private class MyCacheIterator implements CacheIterator {
		private int i = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < items.length;
		}

		@Override
		public NonStaticBookmark next() {
			// TODO Auto-generated method stub
			return items[i++];
		}

	}

	public static void main(String[] args) {
		NonStaticCacheClass recommendedItems = new NonStaticCacheClass(5);

		NonStaticBookmark item1 = new NonStaticBookmark();
		item1.setId(2000);
		item1.setTitle("Use Final Liberally");

		NonStaticBookmark item2 = new NonStaticBookmark();
		item2.setId(2001);
		item2.setTitle("How do I import a pre-existing Java project into Eclipse and get up and running?");

		NonStaticBookmark item3 = new NonStaticBookmark();
		item3.setId(2002);
		item3.setTitle("Interface vs Abstract Class");

		NonStaticBookmark item4 = new NonStaticBookmark();
		item4.setId(2003);
		item4.setTitle("NIO tutorial by Greg Travis");

		NonStaticBookmark item5 = new NonStaticBookmark();
		item5.setId(2004);
		item5.setTitle("Virtual Hosting and Tomcat");

		recommendedItems.add(item1);
		recommendedItems.add(item2);
		recommendedItems.add(item3);
		recommendedItems.add(item4);
		recommendedItems.add(item5);

		CacheIterator iterator = recommendedItems.iterator();
		// CacheIterator iterator = recommendedItems.new MyCacheIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}

	}

}
