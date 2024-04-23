package Scrolluptest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium class\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		   driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	
		   Set<String> allwindow=driver.getWindowHandles();
		   System.out.println(allwindow);

		   Iterator<String> ch=allwindow.iterator();
		   String win1=ch.next();
		  String win2 =ch.next();

		  driver.switchTo().window(win1);
		  System.out.println("Parent Id is:"+win1);

		  driver.switchTo().window(win2);
		  System.out.println("child window id: "+win2);
		  driver.close();
	}

}
