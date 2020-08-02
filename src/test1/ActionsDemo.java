package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String base = "https://www.amazon.com/";
		
		driver.get(base);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		//WebElement move = driver.findElement(By.xpath("//span[@class = 'nav-line-2 nav-long-width']"));
		
		//a.moveToElement(move).build().perform();
		Thread.sleep(4000);
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("asd").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"))).doubleClick().build().perform();
		
		
		
		
		
		

	}

}
