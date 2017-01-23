package com.liqvid.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static WebDriver driver;
	public static void launch() throws InterruptedException{
		   driver=new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.get("http://169.254.156.235:4001/learning/index.php");		   
		   driver.findElement(By.id("LoginForm_username")).sendKeys("RaghuKiran-1-71-2");
		   driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
		   Thread.sleep(2000);
		   driver.findElement(By.name("yt0")).click();
		   Thread.sleep(6000);
		   driver.findElement(By.xpath("//span[contains(text(),'Courses')]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//label[contains(text(),'Batch')]/..//option[1][contains(text(),'Class 2 - Section B')]")).click();
		   driver.findElement(By.xpath("//label[contains(text(),'Course')]/..//option[contains(text(),'Course 2')]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//input[@value='Start Course']")).click();
		   Thread.sleep(10000);
		   driver.findElements(By.tagName("iframe")).size();
		   driver.switchTo().frame(0); 
//		   driver.findElement(By.xpath("//a[contains(text(),'Snake Charmer')]")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'The Snowman')]")).click();
		   Thread.sleep(10000);
	}

}
