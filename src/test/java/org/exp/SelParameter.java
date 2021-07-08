package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelParameter {

	
		//if parameter password common thn mention in suite level to access for all test cases//
	
	//username changed here so @optional method works here or testng.xml only works//
	
	@Parameters({ "userName", "password" })
		@Test
		private void tc1(@Optional("tej@gmail.com") String s1 , String s2) {
		
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
}}
