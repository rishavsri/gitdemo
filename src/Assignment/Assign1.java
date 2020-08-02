package Assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import collectionss.Set;



public class Assign1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		
			
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	
	
	System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
	
	Thread.sleep(8000);
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	
	int elements =  driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(elements);
	

}

}
