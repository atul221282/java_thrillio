package com.semanticsquare.thrillio.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemoColleciton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListDemo();
	}

	public static void arrayListDemo() {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(null);

		list.set(0, -2);
		System.out.println(list);

		list.remove(3);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);

	}

}
