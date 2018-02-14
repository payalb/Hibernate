package com.java;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo1 {

	private static Logger logger = Logger.getLogger(Demo1.class.getName());

	public static void main(String[] args) {

		PropertyConfigurator.configure("resources/log4j.properties");

		logger.trace("Info Message");
		logger.debug("Debug Message");
		logger.error("Error message");
		logger.fatal("Fatal error");
	}

}
