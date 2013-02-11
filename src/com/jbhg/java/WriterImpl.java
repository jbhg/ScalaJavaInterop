package com.jbhg.java;

public class WriterImpl implements IWriter {

	@Override
	public String write() {
		return "Hello!";
	}

	@Override
	public String getIsPositive(int n) {
		return (n>=0) ? "True" : "False";
 	}
	
}
