package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage 
{
	WebDriver driver;
	
	public  RediffHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By rediff = By.xpath("//a[@class='f12']");
	
	public WebElement search()
	{
		return driver.findElement(rediff);
	}
	
	
}
