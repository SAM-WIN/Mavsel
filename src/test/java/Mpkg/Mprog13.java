package Mpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//dataprovider
public class Mprog13 {
	@Test(dataProvider="login")
	public void tc1(String s1,String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("id");
		driver.findElement(By.id("pass")).sendKeys("id");
	}
	
	@DataProvider(name="login")
	public Object[][] logindata(){
		Object[][] data=new Object[2][2];
		data[0][0]="Besnt";
		data[0][1]="12345";
		data[1][0]="tech";
		data[1][1]="67890";
		return data;
		
	}

}
