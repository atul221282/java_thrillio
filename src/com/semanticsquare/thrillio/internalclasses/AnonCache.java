package com.semanticsquare.thrillio.internalclasses;

import java.util.Arrays;
import java.util.Comparator;

interface CacheIterator2 {
    boolean hasNext();
    AnonBookmark next();
}


public class AnonCache {		
	private AnonBookmark[] items;	
	private int next = 0;
	
	public AnonCache(int size) { 
    	items = new AnonBookmark[size]; 
    }
    
    public void add(AnonBookmark item) {
	    if(next < items.length)
            items[next++] = item;
    }
    
    public CacheIterator2 iterator() {
    	return new MyCacheIterator();    	
    }
    
    private class MyCacheIterator implements CacheIterator2 {
    	private int i = 0;
    	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i < items.length;
		}

		@Override
		public AnonBookmark next() {
			// TODO Auto-generated method stub
			return items[i++];
		}
    	
    }
    
    public static void main(String[] args) {
		AnonCache recommendedItems = new AnonCache(5);
		
		AnonBookmark item1 = new AnonBookmark();
		item1.setId(2000);
		item1.setTitle("Use Final Liberally");
		item1.setRating(1.0);
		
		AnonBookmark item2 = new AnonBookmark();
		item2.setId(2001);
		item2.setTitle("How do I import a pre-existing Java project into Eclipse and get up and running?");
		item2.setRating(2.0);
		
		AnonBookmark item3 = new AnonBookmark();
		item3.setId(2002);
		item3.setTitle("Interface vs Abstract Class");
		item3.setRating(3.0);
		
		AnonBookmark item4 = new AnonBookmark();
		item4.setId(2003);
		item4.setTitle("NIO tutorial by Greg Travis");
		item4.setRating(4.0);
		
		AnonBookmark item5 = new AnonBookmark();
		item5.setId(2004);
		item5.setTitle("Virtual Hosting and Tomcat");
		item5.setRating(5.0);
		
		recommendedItems.add(item1);
		recommendedItems.add(item2);
		recommendedItems.add(item3);
		recommendedItems.add(item4);
		recommendedItems.add(item5);
		
		CacheIterator2 iterator = recommendedItems.iterator();
		//CacheIterator iterator = recommendedItems.new MyCacheIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}
		
		Arrays.sort(recommendedItems.items, new Comparator<AnonBookmark>() {

			@Override
			public int compare(AnonBookmark o1, AnonBookmark o2) {
				// TODO Auto-generated method stub
				return o1.getRating() < o2.getRating() ? 1 : -1;
			}
			
		});
				
		System.out.println("\nSorted by rating ...");
		iterator = recommendedItems.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}

	}
    
}
