package test1;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PracticeRahul {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseurl = "https://rahulshettyacademy.com/AutomationPractice/";
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		
		//radio button example
		
		String s = driver.findElement(By.xpath("(//legend)[1]")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//input[@value ='radio1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value ='radio2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value ='radio3']")).click();
		
		
	
		//Suggestion class example
		
		driver.findElement(By.xpath("//input[@id = 'autocomplete']")).sendKeys("bah");
		List<WebElement> list = driver.findElements(By.xpath("//li[@class = 'ui-menu-item']"));
		System.out.println(list.size());
		
		
		for (WebElement lists : list)
		{
			System.out.println(lists.getText());
		}
		
		for (WebElement lists : list)
		{
			if (lists.getText().equalsIgnoreCase("Bahrain"))
			{
				lists.click();
				break;
			}
		}
		
		
		//Dropdown Example
		
		driver.findElement(By.xpath("//select[@id = \"dropdown-class-example\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value = \"option1\"]")).click();
		Thread.sleep(3000);
		
		
		//checkboxexample
		
		driver.findElement(By.xpath("//input[@value = 'option1']")).click();
		driver.findElement(By.xpath("//input[@value = 'option1']")).isSelected();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value = 'option1']")).isSelected()); 
		
		int q = driver.findElements(By.xpath("//input[@type = 'checkbox']")).size(); 
		System.out.println(q);
		driver.quit();
	}

}
