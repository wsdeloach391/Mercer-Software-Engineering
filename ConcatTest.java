package TestClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ConcatTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Begin the Test.");
	}
	
	@Test
	void test() {
		System.out.println("Testing........");
		TestJUnitClassComplete test2 = new TestJUnitClassComplete();
		
		String x = "Hey Class!";
		String y = " This is my project!";
		String result = test2.concat(x, y);
		
		assertEquals("Hey Class! This is my project!", result);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Clean up after the Test.");
	}

}


