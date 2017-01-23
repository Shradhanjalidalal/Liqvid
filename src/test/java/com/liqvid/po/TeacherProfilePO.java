package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherProfilePO 
{
	
		  WebDriver driver=null;
		  public TeacherProfilePO (WebDriver driver)
		  {
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		  }

			//to verifty profile icon on right hand side
			@FindBy(xpath="//img[@src='/learning/themes/notebook/images/avatar_default.jpg']") 
			   private WebElement eleProfileIconOnRight;
			   public WebElement getEleProfileIconOnRight()
			   {
				   return eleProfileIconOnRight;
			   }
			//To verify profile name
			@FindBy(xpath="//span[@style='color:#ffffff;']")
			   private WebElement eleProfileName;
			   public WebElement getEleProfileName()
			   {
				   return eleProfileName;
			   }
			//To verify the drop down option
			@FindBy(className="caret")
			   private WebElement eleDropDown;
			   public WebElement getEleDropDown()
			   {
				  return eleDropDown;
			   }
			//To verify profile after clicking on profile icon
			@FindBy(xpath="//a[text()='Profile']")
			   private WebElement eleProfile;
			   public WebElement getEleProfile()
			   {
				  return eleProfile;
			   }
		//To verify profile text
		  @FindBy(xpath="//div[text()='Profile']")
		      private WebElement eleProfileText;
		      public WebElement getEleProfileText()
		      {
		      	return eleProfileText;
		      }
		  //First name text
		  @FindBy(xpath="//label[text()='First Name']")    
		      private WebElement eleFirstNameText;
		      public WebElement getEleFirstNameText()
		      {
		      	return eleFirstNameText;
		      }
		  //First name Textbox
		  @FindBy(name="first_name")
		     private WebElement eleFirstNameTextBox;
		     public WebElement getEleFirstNameTextBox()
		     {
		  	   return eleFirstNameTextBox;
		     }
		  //to verify last name text
		  @FindBy(xpath="//label[text()='Last Name']")
		     private WebElement elelastNameText;
		     public WebElement getElelastNameText()
		     {
		  	   return elelastNameText;
		     }
		  //to verify last name textbox
		  @FindBy(name="last_name") 
		     private WebElement eleLastNameTextBox;
		     public WebElement getEleLastNameTextBox()
		     {
		  	   return eleLastNameTextBox;
		     }
		  //to verify email id text
		  @FindBy(xpath="//label[text()='Email ID']")
		     private WebElement eleEmailIdText;
		     public WebElement getEleEmailIdText()
		     {
		     	   return eleEmailIdText;
		     }
		  //to verify email id textbox
		  @FindBy(name="email_id") 
		     private WebElement eleEmailIdTextBox;
		     public WebElement getEleEmailIdTextBox()
		     {
		  	  return eleEmailIdTextBox;
		     }
		  //to verify phone number text
		  @FindBy(xpath="//label[text()='Phone']")
		     private WebElement elePhonenumberText;
		     public WebElement getElePhonenumberText()
		     {
		     	   return elePhonenumberText;
		     } 
		  //To verify phone number text box
		  @FindBy(name="phone")
		     private WebDriver elePhoneNumberTextBox;
		     public WebDriver getelePhoneNumberTextBox()
		     {
		  	   return elePhoneNumberTextBox;
		     }
		  //To verify calender icon
		  @FindBy(xpath="//i[@class='fa fa-calendar']")
		     private WebDriver eleCalender;
		     public WebDriver getEleCalender()
		     {
		  	   return eleCalender;
		     }
		  //to verify date of birth text
		  @FindBy(xpath="//label[text()='Date Of Birth']")
		      private WebElement eleDateOfBirthText;
		      public WebElement getEleDateOfBirthText()
		      {
		    	   return eleDateOfBirthText;
		    	} 
		  //to verify date of birth text box
		  @FindBy(xpath="//th[text()='August 1971']/../../../tbody/tr[5]/td[5][text()='26']")   
		     private WebElement eleDateOfBirth;
		     public WebElement getEleDateOfBirth()
		     {
		  	   return eleDateOfBirth;
		     }
		  //To verify gender text
		  @FindBy(xpath="//label[text()='Gender']")
		     private WebElement eleGenderText;
		     public WebElement getEleGenderText()
		     {
		  	   return eleGenderText;
		     }
		  //To verify gender textbox
		  @FindBy(id="gender")
		     private WebElement eleGenderTextBox;
		     public WebElement getEleGenderTextBox()
		     {
		  	   return eleGenderTextBox;
		     }
		  //To verify change password text
		  @FindBy(id="chPassword")
		      private WebElement eleChangePassword;
		      public WebElement getEleChangePassword()
		      {
		      	return eleChangePassword;
		      }
		  //To verify old password text
		  @FindBy(xpath="//label[text()='Old Password']")
		     private WebElement eleOldPasswordText;
		     public WebElement getEleOldPasswordText()
		     {
		   	 return eleOldPasswordText;
		     }    
		  //To verify old password textbox
		  @FindBy(id="old_password") 
		     private WebElement eleOldpasswordTextBox;
		     public WebElement geteleOldpasswordTextBox()
		     {
		  	   return eleOldpasswordTextBox;
		     }
		  //To verify new password text
		  @FindBy(xpath="//label[text()='New password']")
		     private WebElement eleNewPasswordText;
		     public WebElement getEleNewPasswordText()
		     {
		       return eleNewPasswordText;
		      }      
		  //To verify new password textbox
		  @FindBy(id="pwd")  
		      private WebElement eleNewPasswordTextBox;
		      public WebElement getEleNewPasswordTextBox()
		      {
		      	return eleNewPasswordTextBox;
		      }
		  //To verify confirm password text
		  @FindBy(xpath="//label[text()='Confirm password']")
		      private WebElement eleConfirmPasswordText;
		      public WebElement getEleConfirmPasswordText()
		      {
		        return eleConfirmPasswordText;
		      }         
		  //To verify confirm password textbox
		  @FindBy(id="cpwd")
		     private WebElement eleConfirmPasswordTextBox;
		     public  WebElement geteleConfirmPasswordTextBox()
		     {
		  	   return eleConfirmPasswordTextBox;
		     }
		   //to verify update button
		    @FindBy(xpath="//button[text()='Update']") 
		     private WebElement eleUpdateButton;
		     public WebElement geteleUpdateButton()
		     {
		  	   return eleUpdateButton;
		     }
		     
		     
		     
		  

}
