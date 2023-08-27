package Mpkg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mprog8 {
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("tc1");

	}
	@Test(priority=-1)
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("tc2");

	}
	@Test(priority =1)
	private void tc3() {
		// TODO Auto-generated method stub
		System.out.println("tc3");

	}

}
