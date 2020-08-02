package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String base = "https://www.rahulshettyacademy.com/AutomationPractice/";
		driver.manage().window().maximize();
		driver.get(base);
		
		//to find the links with tag a
		
		/*System.out.println(driver.findElements(By.tagName("a")).size());
		//to find the links in footer driver(2 ways)
		//1
		System.out.println(driver.findElements(By.xpath("//div[@id = 'gf-BIG'] //a")).size());
		
		WebElement footerdriver = driver.findElement(By.xpath("//div[@id = 'gf-BIG']")); // limiting webdriver scope
		
		//2
		System.out.println(footerdriver.findElements(By.xpath("//a")).size());*/
		
		int element = driver.findElements(By.xpath("//div[@id = 'gf-BIG'] //a")).size();
		System.out.println(element);

		
	}

}
