import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dest.TestLogA;

public class TestLogB {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void outputLog() {
		this.logger.warn("This is a warn string from TestLogB ...");
	}

	public static void main(String[] args) {
		TestLogA testLogA = new TestLogA();
		testLogA.outputLog();
		//TestLogB testLogB = new TestLogB();
		//testLogB.outputLog();
		//testLogA.outputLog();
	}
}
