package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args)  throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:\\www.spicejet.com");
		
		driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
		driver.findElement(By.xpath("//select[@id = 'ctl00_mainContent_ddl_Adult']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id = 'ctl00_mainContent_ddl_Adult']")));
		
		s.selectByValue("2");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id = 'ctl00_mainContent_ddl_Adult']")));
		
		s1.selectByValue("2");
		
		
		Thread.sleep(4000);
		driver.close();
	
	}

}
