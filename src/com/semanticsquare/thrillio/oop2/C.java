package com.semanticsquare.thrillio.oop2;
/**
 * @author ABC Inc.
 */
public interface C extends A {
   void foobar();
   default void go() {
      System.out.println("C: go");
   }
}