package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;
import utils.Reporters;

public class LeafTapsWrapper extends Reporters {

	@BeforeSuite
	public void beforeSuite() {
		startResult();
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@Parameters({"browser","url","userName","pws"})
	@BeforeMethod
	public void login(String browser,String url,String uName,String pwt) throws Exception {
		startTestCase();
		invokeApp(browser, url);
		enterById("username", uName);
		enterById("password", pwt);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod(groups = {"common"})
	public void closeBrowesr() {
		quitBrowser();
		endTestCase();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@AfterSuite
	public void afterSuite() {		
		endReport();
	}
	
	@DataProvider(name= "fetchData")
	public Object[][] getData() throws InvalidFormatException, IOException{
		DataInputProvider dp = new DataInputProvider();
		return dp.readExcel("CreateLead");		
	}
	
	
	
	
	
	
	
	
}
