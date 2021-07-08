package org.mav;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "@Retest")
	private void tc0() {
		System.out.println("Method0");

}
	
		
		@Test(groups = "@Smoke")
		private void tc1() {
			System.out.println("Method1");

	}
	
			
			@Test(groups = "@Sanity")
			private void tc2() {
				
				System.out.println("Method2");
		}
			
		
				
				@Test(groups = "@Smoke")
				private void tc3() {
					System.out.println("Method3");	

			}
				
			
					
					@Test(groups = "@E2E")
					private void tc4() {
						
						System.out.println("Methosd4");
				}
					
		
	
}