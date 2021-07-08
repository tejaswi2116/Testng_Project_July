package org.cts;

import org.testng.annotations.DataProvider;


public class DataProv2 {
	
	//Mention static to access in other classes//
	@DataProvider(name = "Data1")	
	public static Object[][] getdata1(){
	
	return new Object[][] { { "tej@123", "java"}, { "div@123", "sql"},{"aku@123", "python"} };
}
	
	@DataProvider(name = "Data2")	
	public static Object[][] data2(){
	
	return new Object[][] { { "papu@123", "java"}, { "Hema@123", "sql"},{"Anitha@123", "python"} };
}

	@DataProvider(name = "Data3")	
	public static Object[][] getdata3(){
	
	return new Object[][] { { "Prasu@123", "java"}, { "Krish@123", "sql"},{"Vicky@123", "python"} };
}
	@DataProvider(name = "Data4")	
	public static Object[][] getdata4(){
	
	return new Object[][] { { "Premi@123", "java"}, { "Sanjana@123", "sql"},{"Pavan@123", "python"} };
}
	
	}


