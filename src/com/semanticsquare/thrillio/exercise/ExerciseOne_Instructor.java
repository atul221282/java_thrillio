package com.semanticsquare.thrillio.exercise;

import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.BookType;
import com.semanticsquare.thrillio.entities.DayEnum;

public class ExerciseOne_Instructor {

	public static void main(String[] args) {
		int prim = Integer.parseInt("25");
		Integer prim2 = Integer.valueOf("25");
		System.out.println(prim == prim2);
		Integer ii = new Integer(11);
		Integer ii2 = new Integer(11);

		System.out.println(ii == ii2);
		// bookExercise();
	}

	private static void bookExercise() {
		Book book1 = new Book("Java for Beginners");
		Book book2 = new Book("Scala for Beginners");
		Book book3 = new Book("Effective Python");

		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science",
				new Book[] { book1, book2, book3 });
		System.out.println(instructor.getMostRecentBookTitle());
		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());

		Book book4 = new Book("Introduction to Data Mining");
		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());

		BookType type = BookType.programming;

		System.out.println(type.getType() + " " + type.getName());
		System.out.println("/n");
		System.out.println("/n Enum");
		System.out.println(DayEnum.FRIDAY);
		DayEnum Day = DayEnum.MONDAY;
		System.out.println("/n Day is: " + Day);
		Day = DayEnum.values()[1000]; // run time error
		System.out.println("/n Corrupted Enum" + Day);
	}
}
