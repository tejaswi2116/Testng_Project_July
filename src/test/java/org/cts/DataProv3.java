package org.cts;


import org.testng.annotations.Test;

public class DataProv3 {
	
	@Test(dataProvider = "Data2", dataProviderClass = DataProv2.class)	
	private void tc0(String s1, String s2) {
	
		
		System.out.println(s1);
		System.out.println(s2);

}
}