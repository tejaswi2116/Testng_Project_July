package org.mav;

import org.testng.annotations.Test;

public class ParallTest {
	
	@Test
	private void TC1() {
		System.out.println(Thread.currentThread().getId());
	}

}
