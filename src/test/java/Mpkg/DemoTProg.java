package Mpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTProg {

	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		System.out.println("tc1");

	}
	@BeforeClass
	private void befcls() {
		// TODO Auto-generated method stub
		System.out.println("befcls");

	}
	@BeforeMethod
	private void befmet() {
		// TODO Auto-generated method stub
		System.out.println("befmet");

	}
	@AfterClass
	private void afcls() {
		// TODO Auto-generated method stub
		System.out.println("afcls");

	}
	@AfterMethod
	private void afmet() {
		// TODO Auto-generated method stub
		System.out.println("afmet");

	}

}
