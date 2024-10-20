package logger4jDemo;

import org.apache.logging.log4j.*;

public class LoggerDemo_2909 
{
	public static void main(String[] args) 
	{
		Logger log = LogManager.getFormatterLogger();
		
		log.fatal("Hello this is fatal");
		log.error("Hello this is error");
		log.info("Hello this is info");
		log.warn("Hello this is warn");
		log.debug("Hello this is debug");
		log.trace("Hello this is trace");
	}
}
