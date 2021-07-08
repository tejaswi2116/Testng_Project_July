package org.mav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	private void tc1() {
		
		System.out.println("Method1");

	}
	@Test
private void tc2() {
		
		System.out.println("Method2");

	}
	@Test
private void tc3() {
	Assert.assertTrue(false);
	System.out.println("Method3");

}
	@Test
private void tc4() {
	
	System.out.println("Method4");

}
	

}
