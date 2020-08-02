package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demosclass {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//String baseurl = "http:\\www.fa.com";
		//driver.manage().window().maximize();
		//driver.get(baseurl);
		
		//Thread.sleep(3000);
		//driver.navigate().back();
		
		Thread.sleep(5000);
		driver.get("http:\\www.facebook.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("");;
		
		
		
		
		

		

	}

}
