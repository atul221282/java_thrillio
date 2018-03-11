package com.semanticsquare.thrillio.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListDemo();
		// iteratorDemo();
	}

	private static void iteratorDemo() {
		List<Integer> list = new ArrayList<>();
		int i = 1;
		list.add(i++);
		list.add(i++);
		list.add(i++);
		list.add(i++);
		// list.add(null);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int element = iterator.next();
			System.out.println("element: " + element);

			list.set(1, 9);
			list.set(0, 99);
			if (element == 3) {

				iterator.remove();
				// iterator.forEachRemaining(Filter::add);
			}
		}
		System.out.println("list1: " + list);
	}

	public static void arrayListDemo() {
		List<Integer> nullList = Arrays.asList(new Integer[3]);
		System.out.println("Null List is : " + nullList);
		List<Integer> asStringList = Arrays.asList(1, 2, 3);
		List<Integer> asStringList2 = Arrays.asList(1, 2, 3, 4);

		System.out.println("Is asStringList equals to asStringList2 : " + asStringList.equals(asStringList2));

		List<Integer> list = new ArrayList<>();
		// list = Arrays.asList(11, 12, 13);
		int i = 1;
		list.add(i++);
		list.add(i++);
		list.add(i++);
		list.add(i++);
		list.add(null);

		// System.out.println(list);
		list.removeIf(p -> p != null ? p.intValue() == 3 : false);
		// System.out.println("Removed element 3 using removeIf : " + list);
		list.add(0, 10);
		// System.out.println("added 10 at index 0 : " + list);
		int removedValue = list.set(0, 9);
		/*
		 * System.out.println("Removed value is : " + removedValue);
		 * System.out.println("added 10 at index 0 : " + list);
		 */

		Map<String, String> hash = new HashMap<String, String>() {
			{
				put("a", "aaa");
				put("c", "aaa");
				put("a", "aaza");
				put("b", "aaa");
			}
		};

		System.out.println(hash.values());

		System.out.println("Hash" + hash);

		List<Integer> list2 = new ArrayList<Integer>() {
			{
				add(1);
			}
		};
		list2.add(i++);
		list2.add(i++);
		list2.add(null);
		list2.add(null);
		list.addAll(list2);
		// System.out.println("After Bulk Add : " + list);
		list.removeIf(p -> p == null);
		// System.out.println("There should be no null value in list : " + list);
		list.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println("After Sort : " + list);

		List<Integer> list3 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("Before filteration : " + list3);
		list3 = list3.stream().map(x -> new Integer(x + 1)).collect(Collectors.toList());
		System.out.println("After filteration : " + list3);
		list3.set(0, 8);
		// System.out.println(list3);
		// System.out.println(list);

		List<Integer> list4 = list.subList(2, 3);
		System.out.println(list4);
		list4.set(0, 12);
		System.out.println(list4);
		System.out.println(list);

		list4.add(0, 7);
		System.out.println(list4);
		System.out.println(list);

	}

}
