package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class = 'chNavIcon appendBottom2 chSprite chHotels']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Enter city/ Hotel/ Area/ Building']")).sendKeys("goa");
		driver.findElement(By.xpath("//input[@class = 'react-autosuggest__input react-autosuggest__input--open']")).sendKeys(Keys.ARROW_DOWN);
		
		
		
		
		
		
	}

}
