package Mpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mprog12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("firstName")).sendKeys("sagar");
*/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		List<WebElement> tc= driver.findElements(By.tagName("iframe"));
		System.out.println(tc.size());
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("sagar");	
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultcontent();
		driver.findElement(By.id("name")).sendKeys("Bye Bye");
	}

}
