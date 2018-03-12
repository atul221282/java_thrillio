package com.semanticsquare.thrillio.functionalprogramming;

import java.util.Optional;
import java.util.function.Function;

import com.semanticsquare.thrillio.entities.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(init((Book x) -> x.getTitle() + " " + 1, new Book("Iha")));
		System.out.println(bookInit(() -> "AAA").orElse("No"));

		System.out.println(bookInit(Main::divideByZero).orElseGet(Main::getDefaultInt));

		System.out.println(get(() -> new Book("Let It Go")).apply());
	}

	private static Integer getDefaultInt() {
		return -1;
	}

	private static Integer divideByZero() {
		return 1 / 0;
	}

	private static <T> Optional<T> bookInit(Test<T> object) {
		// TODO Auto-generated method stub
		try {
			return Optional.of((T) object.apply());
		} catch (Exception e) {
			System.out.println(e);
			return Optional.empty();
		}

	}

	private static <T> Test<T> get(Test<T> object) {
		return () -> object.apply();
	}

	private static <TIn, TOut> TOut init(Function<TIn, TOut> func, TIn param) {
		// TODO Auto-generated method stub
		return func.apply(param);
	}

	interface Test<T> {
		T apply();
	}
}
