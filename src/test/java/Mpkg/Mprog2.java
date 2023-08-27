package Mpkg;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mprog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		Switch(ch){
			Case 1:
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				WebElement rcl=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
				Actions action=new Actions(driver);
				action.moveToElement(rcl).perform();
				action.contextClick().perform();
				WebElement dbclk=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
				Actions action2=new Actions(driver);
				action2.moveToElement(dbclk).perform();
				action2.doubleClick().perform();
			break;
			Case 2:
				driver.get("https://demoqa.com/droppable/");
				Actions action3=new Actions(driver);
				WebElement drg=driver.findElement(By.id("draggable"));
				WebElement drp=driver.findElement(By.id("droppable"));
				action2.dragAndDrop(drg, drp).build().perform();
			break;
		}
		
	}

}
