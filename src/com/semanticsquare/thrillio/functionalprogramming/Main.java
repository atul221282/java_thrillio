package com.semanticsquare.thrillio.functionalprogramming;

import java.util.function.Function;

import com.semanticsquare.thrillio.entities.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(init((Book x) -> x.getTitle() + " " + 1, new Book("Iha")));
		System.out.println(bookInit(() ->  "AAA"));

		System.out.println(bookInit(() -> {
			return 1 / 0;
		}));

	}

	private static <T> T bookInit(Test<T> object) {
		// TODO Auto-generated method stub
		try {
			return (T) object.apply();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	private static <TIn, TOut> TOut init(Function<TIn, TOut> func, TIn param) {
		// TODO Auto-generated method stub
		return func.apply(param);
	}

	interface Test<T> {
		T apply();
	}
}
