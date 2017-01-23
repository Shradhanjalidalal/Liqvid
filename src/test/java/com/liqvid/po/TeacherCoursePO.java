package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherCoursePO 
{
	 WebDriver driver=null;
	  public TeacherCoursePO(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
// To verify course icon 	  
@FindBy(xpath="//i[@class='fa fa-gears icon']")	
   private WebElement eleCourseIcon;
   public WebElement getEleCourseIcon()
   {
	   return eleCourseIcon;
   }
//to verify course link
@FindBy(xpath="//span[text()='Courses']")
   private WebElement eleCourseLink;
   public WebElement getEleCourseLink()
   {
	   return eleCourseLink;
   }
//to verify course text in course page
@FindBy(xpath="//div[text()='Courses']")
  private WebElement eleCourseText;
  public WebElement getEleCourseText()
  {
	  return eleCourseText;
  }
// to verify to start course following steps we need to do (instruction)
@FindBy(xpath="//p[text()=' To start course perform following steps ']")
  private WebElement eleInstruction;
  public WebElement getEleInstruction()
  {
	  return eleInstruction;
  }
//to verify step icon for step 1
@FindBy(xpath="//div[text()='Step'])[1]")  
  private WebElement eleStep1Icon;
  public WebElement getEleStep1Icon()
  {
	  return eleStep1Icon;
  }
//to verify step1 circle
@FindBy(xpath="(//div[@class='timelineCircle'])[1]") 
  private WebElement eleStep1Circle;
  public WebElement getEleStep1Circle()
  {
	  return eleStep1Circle;
  }
//to verify select batch
@FindBy(xpath="//div[text()='Select Batch']")  
  private WebElement eleSelectBatch;
  public WebElement getEleSelectBatch()
  {
	  return eleSelectBatch;
  }
//to verify step2 icon
@FindBy(xpath="//div[contains(text(),'Step ')]")  
   private WebElement eleStep2Icon;
   public WebElement getEleStep2Icon()
   {
	   return eleStep2Icon;
   }
//to verify step2 circle
@FindBy(xpath="(//div[@class='timelineCircle'])[2]")  
   private WebElement eleStep2Circle;
   public WebElement getEleStep2Circle()
   {
 	  return eleStep2Circle;
   }
//to verify select course
@FindBy(xpath="//div[text()='Select Course']")  
  private WebElement eleSelectCourse;
  public WebElement getEleSelectCourse()
  {
    return eleSelectCourse;
  }
// to verify step3 icon
@FindBy(xpath="(//div[text()='Step'])[2]")
  private WebElement eleStep3Icon;
  public WebElement getEleStep3Icon()
  {
  	return eleStep3Icon;
   }
//to verify step3 circle
@FindBy(xpath="(//div[@class='timelineCircle'])[3]") 
   private WebElement eleStep3Circle;
   public WebElement getEleStep3Circle()
   {
	 return eleStep3Circle;
   }  
//to verify click start  course
@FindBy(xpath="//div[text()='Click Start Course']")  
   private WebElement eleClickStartCourse;
   public WebElement getEleClickStartCourseCourse()
    {
	 return eleClickStartCourse;
    }
//to verify batch list in course page
@FindBy(xpath="//label[text()='Batch']") 
    private WebElement eleBatchText;
    public WebElement getEleBatchText()
    {
    	return eleBatchText;
    }
//to verify course list in course page  
@FindBy(xpath="//label[text()='Course']") 
    private WebElement eleCourseList;
    public WebElement getEleCourseList()
    {
    	return eleCourseList;
    }  
//to select batch from batch list
@FindBy(xpath="//label[text()='Batch']/../div/select/option[1][text()='Class 2 - Section B']") 
   private WebElement eleBatchChoice;
   public WebElement getEleBatchChoice()
   {
	   return eleBatchChoice;
   }
// to select course from course list
@FindBy(xpath="//label[text()='Course']/../div/select/option[text()='Course 2']")  
   private WebElement eleCourseChoice;
   public WebElement getEleCourseChoice()
   {
	   return eleCourseChoice;
   }
//to click on start course
@FindBy(xpath="//input[@value='Start Course']")   
   private WebElement eleStartCourse;
   public WebElement getEleStartCourse()
   {
	   return eleStartCourse;
   }
//to click on pre assessment  
//driver.switchTo().frame("iframes");  here we are switching driver control from parent to new frame
@FindBy(xpath="//div[@id='index']/div/div[1]/a")  
   private WebElement elePreAssessment;
   public WebElement getElePreAssessment()
   {
	   return elePreAssessment;
   }
//if you want to come again to parent frame then  
   //driver.switchTo().defaultContent();
   //driver.switchTo().parentFrame();  
  //driver.navigate().refresh();-------it will refresh the page and it will n't pass the control to parent frame.
   //to return to parent frame you need to do
  
  //driver.switchTo().defaultContent();
//to verifi english edge Assessment text
@FindBy(xpath="//div[@class='clearfix']/..//h3[text()='English Edge Assessments']")
   private WebElement eleEnglishEdgeAssessmentText;
   public WebElement getEleEnglishEdgeAssessmentText()
   {
	   return eleEnglishEdgeAssessmentText;
   }
//to verify instruction text
@FindBy(xpath="//div[@class='clearfix']/..//h1[text()='Instructions']") 
   private WebElement eleInstructionText;
   public WebElement getEleInstructionText()
   {
	   return eleInstructionText;
   }
//to click on start test button
@FindBy(xpath="//ul[@class='list-group']/..//a[text()='Start Test']")  
   private WebElement eleStartTestButton;
   public WebElement getEleStartTestButton()
   {
	   return eleStartTestButton;
   }
//to verify Class 2 Pre Assessment text
@FindBy(xpath="//b[contains(text(),'Class 2 Pre Assessment')]") 
   private WebElement elePreAssessmentText;
   public WebElement getEePreAssessmentText()
   {
	   return  elePreAssessmentText;
   }
//to verify all the best text
@FindBy(xpath="//p[contains(text(),'All the Best!')]")   
   private WebElement eleAllTheBestText;
   public WebElement getEleAllTheBestText()
   {
	   return  eleAllTheBestText;
   }
//to verift Test Start Time text
@FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[1]/div") 
   private WebElement eleStartTimeText;
   public WebElement getEleStartTimeText()
   {
	   return eleStartTimeText;
   }

//to verift Test End Time text
@FindBy(xpath="//section[@class='scrollable wrapper']/../div/div[2]/div") 
  private WebElement eleEndTimeText;
  public WebElement getEleEndTimeText()
  {
	   return eleStartTimeText;
  }
 //to verify prev button
@FindBy(id="prebtn") 
   private WebElement elePrevButtonText;
   public WebElement getElePrevButtonText()
   {
	   return elePrevButtonText;
   }
//to verify page no now it is in first page
@FindBy(xpath="//span[@id='showFinish']/..//span[text()='1']")   
   private WebElement elePageNo;
   public WebElement getElePageNo()
   {
	   return elePageNo;
   }
//to verify in which page we are
@FindBy(id="showFinish")   
   private WebElement eleTotalPage;
   public WebElement getEleTotalPage()
   {
	   return eleTotalPage;

   }
//to verify next button
@FindBy(id="(//div[@class='actions']/..//button)[2][text()='Next']") 
   private WebElement eleNextButton;
   public WebElement getEleNextButton()
   {
   	  return eleNextButton;
    }
//to verify prev button 
@FindBy(xpath="(//div[@class='actions']/..//button)[1][text()='Prev']")   
   private WebElement elePrevButton;
   public WebElement getelePrevButton()
   {
	   return elePrevButton;
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}  
  
  
  

