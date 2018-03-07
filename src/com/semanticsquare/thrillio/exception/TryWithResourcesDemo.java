package com.semanticsquare.thrillio.exception;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.semanticsquare.thrillio.monads.EitherPair;

public class TryWithResourcesDemo {
	static String inFileStr = "walden.jpg";
	static String outFileStr = "walden-out.jpg";

	public static EitherPair<Exception, Integer> GetError(int i) {
		EitherPair<Exception, Integer> er = new EitherPair<Exception, Integer>();
		if (i == 1)
			return er.Left(new IOException("File error"));
		else
			return er.Right(i);

	}

	public static void fileCopyWithArm() throws IOException {
		System.out.println("\nInside fileCopyWithArm ...");

		try (Test t = new Test();
				Test2 t2 = new Test2();
				BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileStr));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileStr))) {
			byte[] byteBuf = new byte[4000];
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}

			throw new IOException("Important Exception!!");
		}
	}

	public static void testExceptrionOrder() throws IOException {
		System.out.println("\nInside fileCopyWithArm ...");

		try (Test t = new Test(); Test2 t2 = new Test2(); Test3 t3 = new Test3()) {

			// throw new IOException("Important Exception!!");
		}
	}

	public static void main(String[] args) {
		/*
		 * try { testExceptrionOrder(); } catch (IOException e) { e.printStackTrace();
		 * Throwable[] throwables = e.getSuppressed(); System.out.println(throwables);
		 * 
		 * Throwable[] throwables = e.getSuppressed();
		 * System.out.println(throwables[0].getMessage());
		 * System.out.println(throwables[1].getMessage());
		 * 
		 * }
		 */
		EitherPair<Exception, Integer> resp = GetError(1);
		if (resp.IsLeft) {
			System.out.println(resp.Left.getMessage());
		}
		/*
		 * if (GetError(2).IsRight) { System.out.println(GetError(1).getRight()); }
		 */
	}
}

class Test implements AutoCloseable {
	@Override
	public void close() throws IOException {
		System.out.println("Test closing");
	}
}

class Test2 implements AutoCloseable {
	@Override
	public void close() throws IOException {
		System.out.println("Test2 cosing");
	}
}

class Test3 implements AutoCloseable {
	@Override
	public void close() throws IOException {
		throw new IOException("Important Exception!!");
	}
}
