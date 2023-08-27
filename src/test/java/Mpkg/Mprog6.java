package Mpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mprog6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		 driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		 Thread.sleep(3000);
		 WebElement calmon = driver.findElement(By.xpath("//select[@id='month']"));
		 calmon.click();
		 Select s= new Select(calmon);
		 s.selectByValue("5");

	}

}
