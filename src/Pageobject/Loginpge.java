package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Loginpge 
{
	
		
		By username = By.xpath("//input[@id = 'login1']");
		By password = By.xpath("//input[@id = 'password']");
		By proceed  = By.xpath("//input[@name = 'proceed']");
		
		
		
		
		WebDriver driver;
		
		public Loginpge(WebDriver driver)
		{
			this.driver = driver;
		}
		
		
		public WebElement EmailId()
		{
			return driver.findElement(username);
		}
		
		public WebElement password()
		{
			return driver.findElement(password);
		}
		
		public WebElement proceed()
		{
			return driver.findElement(proceed);
		}
		
}
