package org.exp;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Company {
	//if parameter password common thn mention in suite level to access for all test cases//
@Parameters({ "username", "password" })
	@Test
	private void tc1(String s1 , String s2) {
		//ctrl,alt,space and downarrow//
		System.out.println(s1);
		System.out.println(s2);
	}
	@Test
	private void tc2() {
		// TODO Auto-generated method stub

	}
	@Test
	private void tc3() {
		// TODO Auto-generated method stub

	}

	

}
