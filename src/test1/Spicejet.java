package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.KeyInput;

import collectionss.Set;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("http:\\www.spicejet.com");
		
		//driver.findElement(By.xpath("(//input[@class = 'select_CTXT'])[1]")).sendKeys("ahm");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class = 'select_CTXT'])[2]")).sendKeys("aj");
		
		//
		
		driver.findElement(By.xpath("(//td//a[text()='13'])[1]")).click();
		driver.findElement(By.xpath("(//td//a[text()='29'])[1]")).click();
		
		//   
			
		driver.findElement(By.xpath("//div[@class = 'paxinfo']")).click();
		driver.findElement(By.xpath("//select[@class='wMed1s required valid']")).click();
		
		driver.close();
		
		
		
		
	}

}
