package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
	
	// Test case related to new function
	@Test
	public void testSqRt() {
		assertEquals(4, calc.squareRoot(16), 1e-10);
	}
	@Test
	public void testSqRtNegative() {
		assertEquals(0, calc.squareRoot(-8),1e-10);
	}
	
	@Test
	public void testPower() {
		assertEquals(9, calc.power(3,2),1e-10);
	}
	
	@Test
	public void testPowerNegative() {
		assertEquals(0.04, calc.power(-5,-2),1e-10);
	}
	
	@Test
	public void testPowerzero() {
		assertEquals(-0.2, calc.power(-5,-1),1e-10);
	}
	
	@Test
	public void testFactorial() {
		assertEquals(120, calc.factorial(5));
	}
	
	@Test
	public void testLog() {
		assertEquals(0.25, calc.log(2, 16),1e-10);
	}
<<<<<<< Updated upstream
	
=======
		
>>>>>>> Stashed changes
	@Test
	public void testLogNagative() {
		assertEquals(0, calc.log(2, -16),1e-10);
	}
<<<<<<< Updated upstream
	@Test 
	public void testSin() {
		assertEquals(0.5, calc.sin(30),1e-10);
	}
	@Test
	public void testAbs() {
		assertEquals(1,calc.abs(-1));
	}
	

	@Test
	public void testAddPower() {
		assertEquals(15, calc.add((int)calc.power(2, 3), calc.sub(9, 2)));
	}
	
	

	// Integration Tests
	@Test
	public void testSqRtPower() {
		assertEquals(100, calc.squareRoot(calc.power(100, 2)),1e-10);
	}
	
	@Test
	public void testIntegrateAddPowerSub() {
		assertEquals(15, calc.add((int)calc.power(2, 3), calc.sub(9, 2)));
	}

	@Test 
	public void testAbsFactorial() {
		assertEquals(2, calc.abs(calc.factorial(2)),1e-10);
	}
	@Test
	public void testFactorialAbs() {
		assertEquals(2, calc.factorial(calc.abs(-2)),1e-10);
	}
}
