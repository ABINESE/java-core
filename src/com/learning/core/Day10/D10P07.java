package com.learning.core.Day10;
import static org.junit.Assert.*;

import org.junit.Test;

public class D10P07 {
	Calculator calculator = new Calculator();
	
	@Test
	public void calculatorTest() {
		assertEquals(25, calculator.add(10, 15));
		assertEquals(5, calculator.sub(15, 10));
	}

}
