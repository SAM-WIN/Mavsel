package Bpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static void launchbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	public static void maxim() {
		driver.manage().window().maximize();
	}
	public static void getlogin(String det,String info) {
	WebElement detlog=driver.findElement(By.linkText(det));
	set(detlog,info);
	}
	public static void set(WebElement def,String txt) {
		def.sendKeys(txt);
	}
	public static void showtitle(String st) {
		WebElement stit=driver.findElement(By.xpath(st));
		System.out.println(stit.getText());
	}
	public static void chosedrop(String drptxt,String val) {
		WebElement drp=driver.findElement(null);
		Select s= new Select(drp);
		s.selectByVisibleText(val);
	}
	public static void clkbtn(String bt) {
		WebElement clbutton=driver.findElement(By.xpath(bt));
		clbutton.click();
	}
	public static void txtbox(String boxval,String txtval) {
		WebElement box=driver.findElement(null);
		box.sendKeys(txtval);
	}
	public static void dataprint(String dat) {
		WebElement da=driver.findElement(null);
		System.out.println(da.getText());
	}
	public static void showord(String v) {
		WebElement b=driver.findElement(By.xpath(v));
		System.out.println(b.getText());
		
	}
	public static void searchhotel() {
		for(int i=1;i<=7;i++)
		{
			if(i==1) {
			chosedrop("//select[@id='location']","London");
			}
			else if(i==2) {
				chosedrop("//select[@id='hotels']","Hotel Sunshine");
			}
			else if(i==3) {
				chosedrop("//select[@id='room_type']","Double");
			}
			else if(i==4) {
				chosedrop("//select[@id='room_nos']","2 - Two");
			}
			else if(i==5) {
				
			}
			else if(i==6) {
				chosedrop("//select[@id='adult_room']","2 - Two");
			}
			else if (i==7) {
				chosedrop("//select[@id='child_room']","0 - None");
			}
		}
	}
	public static void bookhotel() {
		for(int j=1;j<=8;j++)
		{
			if(j==1) {
				txtbox("//input[@id='first_name']","London");
			}
			else if(j==2) {
				txtbox("//input[@id='last_name']","Hotel Sunshine");
			}
			else if(j==3) {
				txtbox("//textarea[@id='address']","Double");
			}
			else if(j==4) {
				txtbox("//input[@id='cc_num']","1 - One");
			}
			else if(j==5) {
				chosedrop("//select[@id='cc_type']","VISA");
			}
			else if(j==6) {
				chosedrop("//select[@id='cc_exp_month']","February");
			}
			else if (j==7) {
				chosedrop("//select[@id='cc_exp_year']","2027");
			}
			else if (j==8) {
				txtbox("//input[@id='cc_cvv']","1234");
			}
		}
	}

}
