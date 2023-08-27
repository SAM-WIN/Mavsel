package Mpkg;

import org.testng.annotations.Test;

public class Mprog14 {
	@Test
	private void tc1(groups=("sanity")) {
		// TODO Auto-generated method stub
		System.out.println("tc1");

	}
	@Test(groups=("regression"))
	private void tc2() {
		// TODO Auto-generated method stub
		System.out.println("tc2");

	}
	@Test(groups=("manual"))
	private void tc3() {
		// TODO Auto-generated method stub
		System.out.println("tc3");

	}


}
