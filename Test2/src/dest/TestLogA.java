package dest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogA {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void outputLog() {
		this.logger.warn("This is a warn string from TestLogA ...");
	}

	public static void main(String[] args) {
		TestLogA testLogA = new TestLogA();
		testLogA.outputLog();
	}
}
