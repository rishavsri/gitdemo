package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl = "https://rahulshettyacademy.com/AutomationPractice/";

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);

		driver.findElement(By.xpath("//inp" + "ut[@id= 'name']")).sendKeys("Rishav");
		driver.findElement(By.xpath("//input[@id= 'alertbtn']")).click();

		driver.switchTo().alert().getText();
		Thread.sleep(3000);
		String a = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@id= 'confirmbtn']")).click();
		Thread.sleep(3000);
		String b = driver.switchTo().alert().getText();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(b);

		Thread.sleep(3000);
		driver.quit();

	}

}
