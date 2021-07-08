package org.exp;

import org.testng.annotations.Test;

public class Sample {

	@Test
	private void tc11() {
		
     System.out.println("test11");
     System.out.println("Sample class thread :" +Thread.currentThread().getId());
	}
	
	@Test
	private void tc12() {
		 System.out.println("test12");
		 System.out.println("Sample class thread :" +Thread.currentThread().getId());
	}
	@Test
	private void tc13() {
		
		 System.out.println("test13");
		 System.out.println("Sample class thread :" +Thread.currentThread().getId());
	}

}
