package org.mav;

import org.testng.annotations.Test;

public class parallMethod {

	@Test
	private void tc1() {
		
		System.out.println("test1");
		
		System.out.println("ParallMethod class thread :" +Thread.currentThread().getId());
	

	}
	
	@Test
	private void tc2() {
		
		System.out.println("test2");
		
		System.out.println("ParallMethod class thread :" +Thread.currentThread().getId());
	

	}
	@Test
	private void tc3() {
		
		System.out.println("test3");
		System.out.println("ParallMethod class thread :" +Thread.currentThread().getId());
		

	}
	@Test
	private void tc4() {
		
		System.out.println("test4");
		System.out.println("ParallMethod class thread :" +Thread.currentThread().getId());
		

	}
	@Test
	private void tc5() {
		
		System.out.println("test5");
		
		System.out.println("ParallMethod class thread :" +Thread.currentThread().getId());
	

	}
	@Test
	private void tc6() {
		
		System.out.println("test6");
		
		System.out.println("ParallMethod class thread :" +Thread.currentThread().getId());
		

	}
}
