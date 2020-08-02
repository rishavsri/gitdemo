package test1;

import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String base = "https://accounts.google.com/signup";
		driver.manage().window().maximize();
		driver.get(base);
		
		
		driver.findElement(By.xpath("//a[text() = 'Help']")).click();
		System.out.println("Before Switching");
		System.out.println(driver.getTitle());
		
		Set<String> ids =  driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String child = it.next();
		System.out.println(it);
		
		driver.switchTo().window(child);
		System.out.println("After Switching");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
	}

}
