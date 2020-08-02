package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  
  @BeforeMethod
  public void beforeMethod() {
  }
  
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String baseurl = "http:\\www.google.com";
		
		driver.get(baseurl);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
