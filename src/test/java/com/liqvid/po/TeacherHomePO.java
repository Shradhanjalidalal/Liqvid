package com.liqvid.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.liqvid.library.GenericLib;

public class TeacherHomePO 
{

	WebDriver driver = null;
	public TeacherHomePO (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//To verify Home icon  
	@FindBy(xpath="//i[@class='fa fa-home icon']")
	  private WebElement eleHomeIcon;
	  public WebElement getEleHomeIcon()
	  {
		return eleHomeIcon;
	  }
	//To verify home text  
	@FindBy(xpath="//span[text()='Home']")
	  private WebElement eleHomeLink;
	  public WebElement getEleHomeLink()
	  {
		return eleHomeLink;
	  }
	//To verify Total Sessions count  
	@FindBy(id="totalSession")
	  private WebElement eleTotalSessionCount;
	  public WebElement getEleTotalSessionCount()
	  {
	  	return eleTotalSessionCount;
	  }
	//To verify Total Session text  
	@FindBy(xpath="(//span[@class='h5'])[1]")
	  private WebElement eleTotalSessionText;
	  public WebElement getEleTotalSessionText()
	  {
		  return eleTotalSessionText;
	  }
	//To verify Completed Session count  
	@FindBy(id="attemptedSession")
	  private WebElement eleCompletedCount;
	  public WebElement getEleCompletedCount()
	  {
		  return eleCompletedCount;
	  }
	//To verify Completed session text  
	@FindBy(xpath="(//span[@class='h5'])[2])")
	  private WebElement eleCompletedText;
	  public WebElement getEleCompletedText()
	  {
	      return eleCompletedText;
	  }
	//To verify Remaining session count  
	@FindBy(id="remainingSession")
	  private WebElement eleRemainingCount;
	  public WebElement getEleRemainingCount()
	  {
		  return eleRemainingCount;
	  }
	//To verify remaining session text  
	@FindBy(xpath="(//span[@class='h5'])[3])")
	  private WebElement eleRemainingText;
	  public WebElement getEleRemainingtext()
	  {
		  return eleRemainingText;
	  }
	//To verify welcome teacher is showing or n't  
	@FindBy(xpath="//div[@class='col-sm-12 h4 font-bold htitle']")
	  private WebElement eleWelcomeTeacher;
	  public WebElement getEleWelcomeTeacher()
	  {
		  return eleWelcomeTeacher;
	  }
	//To verify profile icon   
	@FindBy(xpath="//img[@class='img-profile-circle img-circle userProfile']")
	  private WebElement eleProfileIcon;
	  public WebElement getEleProfileIcon()
	  {
		  return eleProfileIcon;
	  }
	//To verify Teacher name  
	@FindBy(xpath="//div[@class='name']")
	  private WebElement eleTeacherName;
	  public WebElement getEleTeacherName()
	  {
		  return eleTeacherName;
	  }
	//to verify center name  
	@FindBy(xpath="(//div[@class='lavel'])[1]")
	  private WebElement eleCenterName;
	  public WebElement getEleCenterName()
	  {
		  return eleCenterName;
	  }
	 //To verify email id 
	@FindBy(className="emailId")
	  private WebElement eleEmailId;
	  public WebElement getEleEmailId()
	  {
		  return eleEmailId;
	  }
	// to verify phone number  
	@FindBy(xpath="//div[contains(text(),'+91-8971222976')]")
	  private WebElement elePhoneNumber;
	  public WebElement getElePhoneNumber()
	  {
		  return elePhoneNumber;
	  }
	//To verify last login  
	@FindBy(xpath="(//div[@class='col-md-12 col-sm-12 rightContentList'])[1]")
	  private WebElement eleLastLogin;
	  public WebElement getEleLastLogin()
	  {
		  return eleLastLogin;
	  }
	//To verify last course taken  
	@FindBy(xpath="(//div[@class='col-md-12 col-sm-12 rightContentList'])[2]")  
	  private WebElement eleLastCourse;
	  public WebElement getEleLastCourse()
	  {
		  return eleLastCourse;
	  }
	 //To verify last session 
	@FindBy(xpath="(//div[@class='col-md-12 col-sm-12 rightContentList'])[3]")
	  private WebElement LastSession;
	  public WebElement getLastSession()
	  {
		  return LastSession;
	  }
	//To verify Course icon  in left hand side
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
	 // to verify course img in box
	  @FindBy(xpath="//i[@class='fa fa-files-o fa-stack-1x text-white']")
	  private WebElement eleCourseImg;
	  public WebElement getEleCourseImg()
	  {
		  return eleCourseImg;
	  }
	//To Verify course count  
	@FindBy(xpath="(//strong[text()='2'])[1]/../../../a/div[1]")  
	  private WebElement eleCourseCount;
	  public WebElement getEleCourseCount()
	  {
		  return eleCourseCount;
	  }
	//To verify course text
	@FindBy(xpath="//small[text()='Courses']")
	   private WebElement eleCourseText;
	   public WebElement getEleCourseText()
	   {
		   return eleCourseText;
	   }
	//To verify Batch img  
	@FindBy(xpath="//i[@class='fa fa-columns fa-stack-1x text-white']")
	  private WebElement eleBatchImg;
	  public WebElement getEleBatchImg()
	  {
		  return eleBatchImg;
	  }
	//To verify batch count
	@FindBy(xpath="(//strong[text()='2'])[2]/../../../a/div[1]")
	  private WebElement eleBatchCount;
	  public WebElement getEleBatchCount()
	  {
		  return eleBatchCount;
	  } 
	//To verify batch text
	@FindBy(xpath="//small[text()='Batches']") 
	 private WebElement eleBatchText;
	 public WebElement getEleBatchText()
	 {
		 return eleBatchText;
	 }
	//To verify student img
	@FindBy(xpath="//i[@class='fa fa-user fa-stack-1x text-white']")
	  private WebElement eleStudentImg;
	  public WebElement getEleStudentImg()
	  {
		  return eleStudentImg;
	  }
	//To verify student count  
	@FindBy(xpath="//strong[text()='1']/../../../a/div[1]")
	  private WebElement eleStudentCount;
	  public WebElement getEleStudentCount()
	  {
		  return eleStudentCount;
	  }
	 //To verify student text
	@FindBy(xpath="//small[text()='Students']")
	  private WebElement eleStudentText;
	  public WebElement getEleStudentText()
	  {
		  return eleStudentText;  
	  }
	//To verify Comparsion time and course duration is showing or n't 
	@FindBy(xpath="//p[text()='Comparsion time and course duration']")  
	  private WebElement eleComparsionTimeAndCourseDurationText;
	  public WebElement getEleComparsionTimeAndCourseDurationText()
	  {
		  return eleComparsionTimeAndCourseDurationText;
	  }
	//To verify in veritical Timespent is showing or n't
	@FindBy(xpath="//h4[text()='Time Spent']")  
	  private WebElement eleTimeSpent;
	  public WebElement getEleTimeSpent()
	  {
		  return eleTimeSpent;
	  }
	//To verify horzontal Course is shwing or n't
	@FindBy(xpath="//h4[text()='Courses']")
	  private WebElement eleCourse;
	  public WebElement getEleCourse()
	  {
		  return eleCourse;
	  }
	//To verify Time Spent (min.)/Courses
	@FindBy(xpath="//td[text()='Time Spent (min.)/Courses']")
	  private WebElement eleTimeSpentPerCourse;
	  public WebElement getEleTimeSpentPerCourse()
	  {
		  return eleTimeSpentPerCourse;
	  }
	//To verify the graph
	@FindBy(className="flot-overlay")
	  private WebElement eleGraph;
	  public WebElement getEleGraph()
	  {
		  return eleGraph;
	  }
	
	
	
}
