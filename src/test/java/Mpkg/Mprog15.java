package Mpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mprog15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//brokenlinks
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<=links.size();i++)
		{
			WebElement w=links.get(i);
			String alllinks=w.getAttribute("href");
			System.out.print(alllinks);
			URL url=new URL(alllinks);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection httpURLConnection=(HttpURLConnection) urlconnection;
			httpURLConnection.connect();
			if(httpURLConnection.getResponseCode()==200)
			{
				System.out.println(alllinks+"-"+httpURLConnection.getResponseMessage());
			}
			else
			{
				System.out.println(alllinks+"-"+httpURLConnection.getResponseCode()+"-"+httpURLConnection.getResponseMessage());
			}
			
		}

	}

}
