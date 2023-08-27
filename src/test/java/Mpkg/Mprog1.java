package Mpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mprog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=9153074586970187889&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9155076&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		WebElement mobile=driver.findElement(By.linkText("Mobiles"));
		Actions action=new Actions(driver);
		action.moveToElement(mobile).perform();
		action.contextClick().perform();
		

	}

}
