package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import wrappers.GenericWrappers;

public class Reporters extends GenericWrappers {

	public static ExtentReports extent;
	ExtentTest test;
	
	
	public void learnReport(){	
		test.log(LogStatus.PASS, "Enter the UserName");
	}


	public void startResult(){
		extent =  new ExtentReports("./result/report.html", false);
	}


	public void startTestCase(){
		test = extent.startTest("TC001_CreateLead", "Create a new Lead");
	}
	

	public void endTestCase(){
		extent.endTest(test);
	}
	
	

	public void endReport(){
		extent.flush();
	}
	
	public void reportSteps(String desc, String status){
		
		if(status.equalsIgnoreCase("pass")){
			test.log(LogStatus.PASS, desc);	
		}else if (status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, desc);	
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
