package com.liqvid.Script.Course2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DeerInTheForest 
{
	@Test
	 public void game() throws InterruptedException
	 {
		 WebDriver driver=new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		   driver.get("http://169.254.156.235:4001/learning/index.php");
		   driver.findElement(By.id("LoginForm_username")).sendKeys("RaghuKiran-1-71-2");
		   driver.findElement(By.id("LoginForm_password")).sendKeys("raghukiran92");
		   Thread.sleep(2000);
		   driver.findElement(By.name("yt0")).click();
		 
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//span[text()='Courses']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//label[contains(text(),'Batch')]/..//option[1][contains(text(),'Class 2 - Section B')]")).click();
		   driver.findElement(By.xpath("//label[contains(text(),'Course')]/..//option[contains(text(),'Course 2')]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//input[@value='Start Course']")).click();
		   Thread.sleep(10000);
		   driver.findElements(By.tagName("iframe")).size();
		   
		 
		   driver.switchTo().frame(0); 
		   driver.findElement(By.xpath("//a[contains(text(),'Deer in the Forest')]")).click();
		   Thread.sleep(10000);
		   Set<String> handles = driver.getWindowHandles();

		   String firstWinHandle = driver.getWindowHandle();
		   handles.remove(firstWinHandle);
	       String winHandle=handles.iterator().next();
	       if (winHandle!=firstWinHandle)
		   {
	         //To retrieve the handle of second window, extracting the handle which does not match to first window handle
	         String secondWinHandle = winHandle; //Storing handle of second window handle
	         //Switch control to new window
	         driver.switchTo().window(secondWinHandle);
	         
		   }
	       /* driver.switchTo().frame(driver.findElement(By.id("fraheader")));
	      System.out.println(driver.findElement(By.id("spnTitle")).getText());
		  System.out.println(driver.findElement(By.xpath("//span[@id='spnTitle2']")).getText());
		  Thread.sleep(1000);
		  driver.findElement(By.id("imgAboutUs")).click();
	      driver.findElement(By.id("imgHome")).click();
		  Thread.sleep(6000);
	      driver.switchTo().parentFrame();
	      driver.switchTo().frame(driver.findElement(By.id("content")));
		  Thread.sleep(6000);
		  driver.findElement(By.id("imgArt")).click();
	      System.out.println(driver.findElement(By.id("instructionText")).getText());*/

    
		  for(int i=0;i<=13;i++)
		     {

		    	if(i==13)
			     {
		    		 driver.switchTo().parentFrame();	
				     driver.switchTo().frame(driver.findElement(By.id("fraheader")));
				     System.out.println(driver.findElement(By.id("spnTitle2")).getText());
				     driver.switchTo().parentFrame();
		     		 driver.switchTo().frame(driver.findElement(By.id("content")));
					 Thread.sleep(6000);
		    		 String a = driver.findElement(By.id("instructionText")).getText();
		    		 System.out.println(a);
				     Thread.sleep(7000);
				     driver.switchTo().parentFrame();
				     driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
				     System.out.println(driver.findElement(By.id("pgValue")).getText());
				     Thread.sleep(2000);
				     break;
			     }
		     Thread.sleep(7000);	 
		     driver.switchTo().parentFrame();	
		     driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		     System.out.println(driver.findElement(By.id("spnTitle2")).getText());
		     driver.switchTo().parentFrame();
   		     driver.switchTo().frame(driver.findElement(By.id("content")));
			 Thread.sleep(7000);
  		 
  		     System.out.println(driver.findElement(By.id("instructionText")).getText());
		     Thread.sleep(7000);
		     driver.switchTo().parentFrame();
		     driver.switchTo().frame(driver.findElement(By.id("frabotbar")));
		     System.out.println(driver.findElement(By.id("pgValue")).getText());
		     Thread.sleep(7000);
		     driver.findElement(By.id("imgNext")).click();
			 driver.findElement(By.id("imgRef")).click();
		     Thread.sleep(10000);
		     driver.switchTo().parentFrame();
		     Thread.sleep(7000);
		    
		     }
		     driver.switchTo().parentFrame();
		     driver.switchTo().frame(driver.findElement(By.id("fraheader")));
		     driver.findElement(By.id("imgExit")).sendKeys(Keys.ENTER);
		     Thread.sleep(2000);
		     System.out.println("finish");
		     Thread.sleep(3000);
		     driver.close();
		    

			
		
			
	 }
}

