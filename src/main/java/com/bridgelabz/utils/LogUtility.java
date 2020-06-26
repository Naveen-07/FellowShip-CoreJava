package com.bridgelabz.utils;

import org.apache.log4j.Logger;

public class LogUtility {

	public static final String CONFIGFILE = "F:\\Jspiders-workspace\\BridgeLabz_FellowShip\\lib\\log4j.properties";
	private static Logger logger;

	public static void setLogger(String programName) {
		LogUtility.logger = Logger.getLogger(programName.getClass().getName());
	}

	public static Logger getLogger() {
		return logger;
	}

}
