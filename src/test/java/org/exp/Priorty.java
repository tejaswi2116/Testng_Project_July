package org.exp;

import org.testng.annotations.Test;

public class Priorty {
	
	//@priority test//
	
	@Test(priority = 1)
	private void tc1() {
		   
			}
//if test case not mentioned priority it takes default value as 0//
	//enabled = false to ignore the particular test//
			//@Test(enabled = false)
	//invocation count to check stability of part testcase//
	        @Test
			private void tc2() {
				

			}
			
			@Test(priority = -1 )
			private void tc3() {
				   
					}
					
			@Test(enabled = false)//-->Method is hidden 
					private void tc4() {
						

					}
			}

