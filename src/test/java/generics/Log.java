package generics;

import org.apache.log4j.Logger;

public class Log {

	public static Logger log = Logger.getLogger(Log.class.getName());

	public static void info(String message) {

		log.info(message);

	}
}
