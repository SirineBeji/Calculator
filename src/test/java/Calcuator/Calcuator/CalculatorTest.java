package Calcuator.Calcuator;



import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	
	Calculator calculator;
	
	public CalculatorTest(){
		super();
		this.calculator = new Calculator();
	}
	
	@Test
	public void testAdd(){
		assertEquals(10, this.calculator.add(5,5));
		assertEquals(5, this.calculator.add(2, 3));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(25, this.calculator.multiply(5,5));
		assertEquals(50, this.calculator.multiply(5,10));
	}

	@Test
	public void testMultiplyByZero(){
		assertEquals(0, this.calculator.multiply(5,0));
	}
	
}
