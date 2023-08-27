package Mpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Bpkg.Base;
import Bpkg.Baseproj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adacin extends Baseproj {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser();
		maxim();
		getlogin("//input[@id='username']","abinesh12345");
		getlogin("//input[@id='password']","12345");
		clkbtn("//input[@id='login']");
		showtitle("//td[@class='login_title']");
		searchhotel();
		clkbtn("//input[@id='Submit']");
		showtitle("//td[@class='login_title']");
		clkbtn("//input[@id='radiobutton_0']");
		clkbtn("//input[@id='continue']");
		showtitle("(//td[@class='login_title'])[2]");
		bookhotel();
		dataprint("//label[@id='cc_num_tip']");
		clkbtn("//input[@id='book_now']");
		dataprint("//label[text()='Please wait! We are processing your Hotel Booking...']");
		Thread.sleep(5000);
		showord("//input[@id='order_no']");
		
	}

}
