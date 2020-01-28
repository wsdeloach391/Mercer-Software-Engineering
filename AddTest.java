package TestClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AddTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Begin the Test.");
	}

	
	@Test
	void test() {
		System.out.println("Testing........");
		TestJUnitClassComplete test = new TestJUnitClassComplete();
		
		int x = 50;
		int y = 100;
		int result = test.add(x, y); 
		
		assertEquals(150, result);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Clean up after the Test.");
	}
	
}

