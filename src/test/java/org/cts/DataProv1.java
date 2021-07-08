package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProv1 {
	
	 @DataProvider(name = "res", parallel=true)//4 browsers open and run parallely with 4 diff inputs//	
		private Object[][] data(){
		
		return new Object[][] { { "tej", "tej@123"}, { "div", "div@123"},{ "aku", "aku@123"},{"diya","diya@123"} };
	 }
	
	@Test(dataProvider = "res")
	
	
	private void tc1(String s1, String s2) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 WebElement txtUserName = driver.findElement(By.id("email"));
			txtUserName.sendKeys(s1);
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys(s2);
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogin.click();
		
		System.out.println(s1);
		System.out.println(s2);
	}
	
	
	
  


}


