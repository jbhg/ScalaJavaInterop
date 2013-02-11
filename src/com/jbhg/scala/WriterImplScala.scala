package com.jbhg.scala;

import com.jbhg.java.IWriter;

class WriterImplScala extends IWriter {
	override def write : String = {
	  "Scala!"
	}
	
	override def getIsPositive(n: Int) : String = {
	  if(n >= 0) "True" else "False"
	}

}