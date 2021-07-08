package org.mav;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDepends {
	
	
	@Test(groups = "@Smoke")
	private void tc0() {
		System.out.println("Method0");
		
}
	
		
		@Test(groups = "@Smoke")
		private void tc1() {
			System.out.println("Method1");
			Assert.assertTrue(false);

	}
		 @Test(groups = "@Smoke")
			private void tc2() {
				
				System.out.println("Method2");
		}
		 
	    @Test(groups = "@Reg" , dependsOnGroups = "@Smoke" )
				private void tc3() {
					System.out.println("Method3");	

			}
				
	   
					
				@Test(groups = "@Reg" , dependsOnGroups = "@Smoke", alwaysRun=true)
				private void tc4() {
					System.out.println("Method4");	

			}
				

}
