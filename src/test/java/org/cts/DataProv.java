package org.cts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {

	
	@DataProvider(name = "result")	
     public Object[][] data(){ 
		
		//Data provider  return type//

return new Object[][] { { "tej", "tej@123", "java"}, { "div", "div@123", "sql"},{ "aku", "aku@123", "python"} };
//2D array prints in o/p in 3rows and 3columns//
}
	
	@Test(dataProvider = "result")
	private void tc1(String s1, String s2, String s3) {
		
		//s1->tej, s2-> tej@123, s3->"java"//
		
		//ctrl,alt, and downarrow to get same line//
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		                                      
		}


}