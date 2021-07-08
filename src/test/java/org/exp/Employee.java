package org.exp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Employee {

	
	@BeforeClass
   //method and ctrl+space//
	private void launchBrowser() {
		System.out.println("launch browser");
	}
	
	@AfterClass
	private void quitBrowser() {
		System.out.println("quit browser");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("start time");
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("end time");
	}

	@Test
	private void tc1() {
   System.out.println("tc1");
	}
	
	@Test
	private void tc2() {
		System.out.println("tc2");

	}}
