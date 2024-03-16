package com.learning.core.Day10;
import static org.junit.Assert.*;

import org.junit.Test;

public class D10P09 {
	FindMax findMax = new FindMax();

	@Test
	public void findMaxTest() {
		assertEquals(10,findMax.Max(new int[]{ 1,2,3,4,5,6,7,8,9,10 }));
	}
}
