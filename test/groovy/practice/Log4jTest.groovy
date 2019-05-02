package practice

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.junit.Test

/**
 * 
 * @author Kavitha R
 *
 */
class Log4jTest {
	private static Logger logger = LogManager.getLogger(Log4jTest.class);
	
	@Test
	public void logTest() {
		logger.info("Test log4j file output")
		logger.error("Sample Error")
	}
	

}
