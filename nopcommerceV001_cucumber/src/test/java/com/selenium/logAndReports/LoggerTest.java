package com.selenium.logAndReports;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTest {
	static String projectLocation = System.getProperty("user.dir");

	static String configFilename = projectLocation + "/test-output/log4j.properties";
	
	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());
	
	@BeforeClass
	public static void getLogger() {
		PropertyConfigurator.configure(configFilename);
		//return logger;
	}
	@Test
	public void testlogger()
	{
//		getLogger();
		logger.info("Log Test1");
		logger.info("Log Test2");
		logger.info("Log Test3");
		
		logger.info("Log TestA");
		logger.info("Log TestB");
		logger.info("Log TestC");
	}
	
	

}


