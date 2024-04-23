package Scrolluptest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium class\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
              driver.get("https://www.facebook.com/");
              driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
              Thread.sleep(2000);
              List<WebElement> list=driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
              for(WebElement lists:list) {
            	  System.out.println(lists.getText());	  
              }
              Thread.sleep(2000);
             list.get(11).click();
             driver.quit();
	}

}
