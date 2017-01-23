package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherNotificationPO 
{
	 WebDriver driver=null;
	  public TeacherNotificationPO(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
//To verify notification count
@FindBy(xpath="//span[text()='0']/../../a/span")
	 private WebElement eleNotificationCount;
	 public WebElement getEleNotificationCount()
	 {
		  return eleNotificationCount;
     }
//To verify notification icon
@FindBy(xpath="//i[@class='fa fa-bell']/../../a/i") 
	private  WebElement eleNotificationIcon;
	public WebElement getEleNotificationIcon()
	{
		return eleNotificationIcon;
    }	  
	  
//To verify notification text in notification page
@FindBy(xpath="//div[text()='Notifications']")  
    private WebElement eleNotificationText;
    public WebElement getEleNotificationText()
    {
    	return  eleNotificationText;
    }
//To verify number of notification in notification page
@FindBy(xpath="//span[contains(text(),'Notification(s)')]")
   private WebElement eleNotification;
   public WebElement getEleNotification()
   {
	   return eleNotification;
   }
//To check content upgrade on notification page
@FindBy(xpath="//span[text()='We will check content upgrade for ILT at 11:30 AM.']")
   private WebElement eleContentUpgrade;
   public  WebElement getEleContentUpgrade()
   {
	   return eleContentUpgrade;
   }
//to verify time and date 
@FindBy(xpath="//small[@class='pull-right text-muted']")   
   private WebElement eleTimeAndDate;
   public WebElement getEleTimeAndDate()
   {
	   return eleTimeAndDate;
   }
	    


}
