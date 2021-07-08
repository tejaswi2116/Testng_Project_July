package org.exp;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Emp {
	
//No need to Mention static next to methods in Testng as Junit//
	
  public  WebDriver driver;
 	
	@BeforeClass
	public void launchBrowser() {
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.facebook.com/");
	}
       @AfterClass
       private void quitBrowser() {
	
      driver.quit();
        }
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@Test
	private void tc1() {
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("hello");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("1234");
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
	btnLogin.click();
	
	
	
	}}




