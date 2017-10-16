

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.org.devops.Calculator;

public class CalculatorTest {

	//Test Case First and then adding a Functionality
	@Test
	public void testAddFunctionalityWithSuccess() {
		Calculator calculator = new Calculator();
		int results = calculator.addNumbers(10, 20);
		assertTrue(results==300);
	}

	@Test
	public void testSubstractionFunctionality() {
		Calculator calc = new Calculator();
		int results = calc.substractNumber(10, 20);
		assertTrue(results == -10);
	}
	@Test
	public void testMultiplicationFunctionality() {
		Calculator calc = new Calculator();
		int results = calc.multiplyNumber(10, 20);
		assertTrue(results == 200);
	}
	@Test
	public void testDevisionFunctionality() {
		Calculator calc = new Calculator();
		int results = calc.divideNumber(20, 10);
		assertTrue(results == 2);
	}
}
