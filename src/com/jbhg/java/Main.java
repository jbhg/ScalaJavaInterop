package com.jbhg.java;

import com.jbhg.scala.WriterImplScala;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IWriter w1 = new WriterImpl();
		System.out.println(w1.write());
		WriterImplScala w2 = new WriterImplScala();
		System.out.println(w2.write());

		System.out.println("Positive: " + w2.getIsPositive(5));
		
	}

}
