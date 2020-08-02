package test1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String base = "https://path2usa.com/travel-companions";
		driver.manage().window().maximize();
		driver.get(base);

		driver.findElement(By.xpath("//input[@id = 'travel_date']")).click();
		
		List<WebElement> dates = driver.findElements(By.className(".day"));
		
		int count = driver.findElements(By.xpath("//td[@class='day']")).size();
		
		for (int i =0; i < count; i ++)
		{
			String text = driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
			if (text.equalsIgnoreCase("28"))
			{	
				driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//select[@id = \"travel_language\"]")).click();
		
		int count2 = driver.findElements(By.xpath("//select[@id = \"travel_language\"]/option")).size();
		
		for (int i = 0; i < count2 ; i++)
		{
			String text =driver.findElements(By.xpath("//select[@id = \"travel_language\"]/option")).get(i).getText(); 
			if (text.equalsIgnoreCase("Assamese"))
			{
				driver.findElements(By.xpath("//select[@id = \"travel_language\"]/option")).get(i).click();
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//select[@id=\"datebetween\"]")).click();
		
		int count3 = driver.findElements(By.xpath("//select[@id=\"datebetween\"]/option")).size();
		
		for (int i = 0; i < count3; i ++)
		{
			String te = driver.findElements(By.xpath("//select[@id=\"datebetween\"]/option")).get(i).getText();
			if (te.equalsIgnoreCase("+ - 2 Weeks"))
			{
				driver.findElements(By.xpath("//select[@id=\"datebetween\"]/option")).get(i).click();
			}
		}
		
		int count4 = driver.findElements(By.xpath("//select[@id = \"travel_airline\"]/option")).size();
		
		for (int i = 0; i < count4 ; i ++)
		{
			System.out.println(driver.findElements(By.xpath("//select[@id = \"travel_airline\"]/option")).get(i).getText());
			System.out.println(count4);
		}
		
		
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}

