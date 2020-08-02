package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("http:\\www.spicejet.com");
		
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value= 'IXB']")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value = 'BLR'])[2]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'24')])[1]")).click();
		
		Thread.sleep(4000); 
		driver.quit();
	
	
	
	}	
	

}
