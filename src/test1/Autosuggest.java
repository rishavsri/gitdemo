package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public abstract class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//input[@id= 'autosuggest']")).sendKeys("ind");
		Thread.sleep(4000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for (WebElement option : options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			
		}
		
		
		
		int check = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
		System.out.println(check);
		
		driver.quit();	
	}

}
