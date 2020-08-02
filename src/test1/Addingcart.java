package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addingcart {

	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String base = "https://rahulshettyacademy.com/seleniumPractise/";

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String[] items = { "Brocolli", "Cauliflower", "Cucumber" };

		List<WebElement> it = driver.findElements(By.xpath("//h4[@class = 'product-name']"));

		for (int i = 0 ;i < it.size() ;i++)

		{
						
		}
		driver.get(base);

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("(//a[@class='increment'])[1]")).click();

		}
		// driver.findElement(By.xpath("(//button[@type = \"button\"])[1]")).click();

		driver.findElement(By.xpath("(//button[@type = \"button\"])[2]")).click();

		driver.findElement(By.xpath("(//button[@type = \"button\"])[3]")).click();

		driver.findElement(By.xpath("//img[@src= \"./images/bag.png\"]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[text() = 'PROCEED TO CHECKOUT']")).click();
        Thread.sleep(4000);
        
		driver.close();

	}

}
