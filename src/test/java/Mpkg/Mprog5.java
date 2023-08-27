package Mpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mprog5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		 Thread.sleep(3000);
		 WebElement calmon = driver.findElement(By.id("month"));
		 Select s= new Select(calmon);
		 s.selectByIndex(5);
		 WebElement calday = driver.findElement(By.id("day"));
		 Select s2= new Select(calday);
		 s2.selectByValue("3");
		 WebElement calyr = driver.findElement(By.id("year"));
		 Select s3= new Select(calyr);
		 s3.selectByVisibleText("2022");
	}

}
