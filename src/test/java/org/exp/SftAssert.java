package org.exp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SftAssert {
		
		//No need to Mention static next to methods in Testng as Junit//
			
		  public  WebDriver driver;
		 	
			@Test
			private void tc1() {
				
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
					 
					 driver = new ChromeDriver();
					 
					 driver.manage().window().maximize();
					 
					 driver.get("http://facebook.com/");
					 
		          SoftAssert s = new SoftAssert();
		          
	            //To get the url of the page//
				 
				 String url = driver.getCurrentUrl();
				 
				 //AssertTrue in soft assert//
		        //s.assertTrue(driver.getCurrentUrl().contains("xyz"),"verify url");
		         
				//AssertEquals in soft assert//
				 
				 WebElement txtUserName = driver.findElement(By.id("email"));
				txtUserName.sendKeys("hello");
				
			     //actual result hello but expected Welcome//
				//s.assertEquals("hello", "Welcome");
				
				
				String s1 = txtUserName.getAttribute("value");
				s.assertEquals(s1,"hello");
				System.out.println(s1);
			
			
			   WebElement txtPassword = driver.findElement(By.id("pass"));
				txtPassword.sendKeys("1234");
				
			    WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
			    btnLogin.click();
			
	//To highlight assert failure and particular test method marked as failed in Assertion Error//
			s.assertAll();
			
			}
		
	@Test
	private void tc2() {
		System.out.println("tc2");

	}



}

