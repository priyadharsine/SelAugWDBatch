package learnReport;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReport {
	
	@Test
	public void learnReport(){
		
		ExtentReports extent =  new ExtentReports("./result/report.html", true);
		
		ExtentTest test = extent.startTest("TC001_CreateLead", "Create a new Lead");
		
		test.log(LogStatus.PASS, "Enter the UserName"+
		
				test.addScreenCapture("./../snaps/snap1.jpeg"));
		
		test.log(LogStatus.PASS, "Enter the Password" +
				test.addScreenCapture("./../snaps/snap2.jpeg"));
		
		test.log(LogStatus.FAIL, "click the Login" +
				test.addScreenCapture("./../snaps/snap3.jpeg"));
		
		extent.endTest(test);
		
		
		extent.flush();
		
		
	}
	
	

}
