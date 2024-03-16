package com.learning.core.Day10;
import static org.junit.Assert.*;

import org.junit.Test;
public class D10P08 {
	Calculator calculator=new Calculator();
	@Test
	public void assesrtTest()
	{
		assertEquals(50, calculator.mul(10, 5));
		assertEquals(2, calculator.div(10, 5));
	}
	
}
