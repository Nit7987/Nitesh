package Scrolluptest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScroll {
  @Test
	public void setup() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium class\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		   driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		   driver.manage().window().maximize();
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   Thread.sleep(2000);
		   js.executeScript("window.scrollBy(0,250)");
		   Thread.sleep(2000);
		   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		   Iterator<String> text=a
		
		
		
		
	}
	
	
}