package Scrolluptest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	   
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium class\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 
			   driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			   driver.manage().window().maximize();
			JavascriptExecutor js= (JavascriptExecutor) driver;
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			System.out.println("Alert is accepted");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			System.out.println("Alert is not accepted");
			
			
		
		}

	}


}
