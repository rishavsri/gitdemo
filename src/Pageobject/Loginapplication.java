package Pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginapplication

{
	@Test
	public void Login() 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Loginpge rd = new Loginpge(driver);
		rd.EmailId().sendKeys("Email id ");
		rd.password().sendKeys("asdas");
		rd.proceed().click();
		
		RediffHomePage pg = new RediffHomePage(driver);
		pg.search().click();
		
		
	}
}
