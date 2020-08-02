package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlTables {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29058/eng-vs-wi-3rd-test-west-indies-tour-of-england-2020");
		
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		
		int rowcount = table.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-right text-bold']")).size();
		System.out.println(rowcount);
		int count = table.findElements(By.xpath("//(div[@class='cb-col cb-col-8 text-right text-bold']) div:nth-child(3)")).size();
		
		for (int i = 0; i <count; i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		
		//div[@class = 'cb-col cb-col-100 cb-scrd-itms']
	}

}
/*

int sum=0;
System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

for(int i=0;i<count-2;i++)
{
String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
int valueinteger=  Integer.parseInt(value);
sum=sum+valueinteger;//103
}
//System.out.println(sum);

String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
int extrasValue=Integer.parseInt(Extras);
int TotalSumValue=sum+extrasValue;
System.out.println(TotalSumValue);


String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
int ActualTotalVAlue=Integer.parseInt(ActualTotal);
if(ActualTotalVAlue==TotalSumValue)
{
System.out.println("Count Matches");
}
else
{
System.out.println("count fails");
}
}
*/