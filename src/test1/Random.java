package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Random {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String base = "https://rahulshettyacademy.com/seleniumPractise/";

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(base);
		
		//driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys("carrot");

		String[] str = {"Brocolli","Cauliflower","Cucumber"};
		
		List<WebElement> item = driver.findElements(By.xpath("//h4[@class = 'product-name']"));
		
		for (int i = 0; i < item.size() - 1; i ++)
		{
			String stre = item.get(i).getText();
			String[] er = stre.split(" - ");
			System.out.println(er[1]);
			System.out.println(item.get(i).getText());
			
			if (er[1].equalsIgnoreCase(item.get(i).getText()))
			{
				
			}
		}
	}

}
