package org.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrwser {
	
	public static WebDriver driver;
	
	@Parameters({"browserName"})
	
	@Test
	private void tc1(String browser) {
		
	if (browser.equals("chrome"))	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\photon\\Maven\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	else if (browser.equals("edge")) {
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\HB\\eclipse-workspace\\photon\\Maven\\Drivers\\msedgedriver.exe");
		
		driver = new EdgeDriver();
	}
	else if (browser.equals("ie")) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HB\\eclipse-workspace\\photon\\Maven\\Drivers\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
}
	
	else {
		
		System.out.println("Enter valid browser name");
	}
	
	driver.get("https://www.facebook.com/");
	
WebElement txtUsrname = driver.findElement(By.id("email"));
	
	txtUsrname.sendKeys("Hello");
	
	WebElement txtPwd = driver.findElement(By.id("pass"));
	
	txtPwd.sendKeys("1234");
}}
//run through testng.xml file ..if mention parallel thr exe parallely if not mentioned anything run sequentially//



