package com.semanticsquare.thrillio.monads;

import java.lang.reflect.Array;

public class EitherPair<L, R> {
	public R Right;
	public L Left;
	public boolean IsRight;
	public boolean IsLeft;

	public EitherPair<L, R> Right(R right) {
		EitherPair<L, R> rightObject = new EitherPair<L, R>();
		rightObject.setRight(right);
		rightObject.setIsLeft(false);
		rightObject.setIsRight(true);
		rightObject.setLeft(null);
		return rightObject;
	}

	private <T> T getDefaultLValue(L l) {
		return (T) Array.get(Array.newInstance((Class<?>) l, 1), 0);
	}

	private <T> T getDefaultRValue(R r) {
		return (T) Array.get(Array.newInstance((Class<?>) r, 1), 0);
	}

	public EitherPair<L, R> Left(L left) {
		EitherPair<L, R> leftObject = new EitherPair<L, R>();
		leftObject.setLeft(left);
		leftObject.setIsLeft(true);
		leftObject.setIsRight(false);
		leftObject.setRight(null);
		return leftObject;
	}

	/**
	 * @return the right
	 */
	public R getRight() {
		return Right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(R right) {
		Right = right;
	}

	/**
	 * @return the left
	 */
	public L getLeft() {
		return Left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(L left) {
		Left = left;
	}

	/**
	 * @return the isRight
	 */
	public boolean isIsRight() {
		return IsRight;
	}

	/**
	 * @param isRight
	 *            the isRight to set
	 */
	public void setIsRight(boolean isRight) {
		IsRight = isRight;
	}

	/**
	 * @return the isLeft
	 */
	public boolean isIsLeft() {
		return IsLeft;
	}

	/**
	 * @param isLeft
	 *            the isLeft to set
	 */
	public void setIsLeft(boolean isLeft) {
		IsLeft = isLeft;
	}
}
