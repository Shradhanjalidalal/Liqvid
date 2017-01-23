package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherResoursePO 
{
	 WebDriver driver=null;
	  public TeacherResoursePO(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
//to verify resourse icon
@FindBy(xpath="//i[@class='fa fa fa-files-o icon']")
   private WebElement eleResourse;
   public WebElement getEleResourse()
   {
	   return eleResourse;
   }
//to verify resourse link
@FindBy(xpath="//span[text()='Resources']")
   private WebElement eleResourseLink;
   public WebElement getEleResourseLink()
   {
	   return eleResourseLink;
   }
//to verify resource text in resource page
@FindBy(xpath="//div[text()='Resources']")
   private WebElement eleResourceText;
   public WebElement getEleResourceText()
   {
	   return eleResourceText;
   }
//To verify technical manual icon
@FindBy(xpath="//img[@src='../../images/HelpManual.png']")
   private WebElement eleTeachnicalManualIcon;
   public WebElement getEleTeachnicalManualIcon()
   {
	   return eleTeachnicalManualIcon;
   }   
//To verify technical manual icon link
  @FindBy(xpath="//div[contains(text(),' Technical Manual')]")
   private WebElement eleTeachnicalManualLink;
   public WebElement getTeachnicalManualLink()
   {
   	 return eleTeachnicalManualLink;
   }   
}
