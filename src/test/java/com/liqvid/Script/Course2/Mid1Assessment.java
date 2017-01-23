package com.liqvid.Script.Course2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mid1Assessment 
{
	@Test()
	public void login() throws InterruptedException
	{
   WebDriver driver=new FirefoxDriver();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get("http://169.254.156.235:4001/learning/index.php");
   driver.findElement(By.id("LoginForm_username")).sendKeys("RaghuKiran-1-71-2");
   driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
   Thread.sleep(2000);
   driver.findElement(By.name("yt0")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//span[contains(text(),'Courses')]")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//label[contains(text(),'Batch')]/../div/select/option[1][contains(text(),'Class 2 - Section B')]")).click();
   driver.findElement(By.xpath("//label[contains(text(),'Course')]/../div/select/option[contains(text(),'Course 2')]")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//input[@value='Start Course']")).click();
   Thread.sleep(10000);
   int size = driver.findElements(By.tagName("iframe")).size();
   System.out.println(size);
   driver.switchTo().frame(0);
   driver.findElement(By.xpath("//a[contains(text(),'Mid-1 Assessment')]")).click();
   //System.out.println(total);
   //driver.switchTo().defaultContent();
   
   driver.switchTo().frame(0);
   Thread.sleep(20000);
  
   driver.findElement(By.xpath("//ul[@class='list-group']/..//a[contains(text(),'Start Test')]")).click();
   Thread.sleep(20000);
   driver.findElement(By.xpath("(//div[@class='actions']/..//button)[2][contains(text(),'Next')]")).sendKeys(Keys.ENTER);
// Thread.sleep(5000);
// driver.findElement(By.xpath("(//div[@class='actions']/..//button)[1][text()='Prev']")).sendKeys(Keys.ENTER);
   Thread.sleep(20000);
   driver.findElement(By.xpath("(//div[@class='actions']/..//button)[2][contains(text(),'Next')]")).sendKeys(Keys.ENTER);
   driver.findElement(By.xpath("(//div[@class='actions']/..//button)[2][contains(text(),'Finish')]")).sendKeys(Keys.ENTER);
   driver.findElement(By.xpath("//button[@id='btnBack']")).click();
	}
	
}
