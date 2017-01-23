package com.liqvid.Script.Course2;

import com.liqvid.po.BrowserLaunch;
import com.liqvid.po.TeacherContentPO;
import com.liqvid.po.TeacherExitPO;
import com.liqvid.po.TeacherHeaderPO;

public class TheSnowMan extends BrowserLaunch
{
	public static void main(String[] args) throws InterruptedException 
	{
		launch();
		TeacherHeaderPO th=new TeacherHeaderPO(driver);
	    th.header();
	    TeacherContentPO tc=new TeacherContentPO(driver);
	    tc.content();
	    TeacherExitPO te=new TeacherExitPO(driver);
	    te.exit();
		
	}
	
}
