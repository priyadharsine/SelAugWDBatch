package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends GenericWrappers {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	//@BeforeMethod(groups = {"common"})
	@Parameters({"browser","url","userName","pws"})
	@BeforeMethod
	public void login(String browser,String url,String uName,String pwt) throws Exception {
		invokeApp(browser, url);
		enterById("username", uName);
		enterById("password", pwt);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");

	}
	@AfterMethod(groups = {"common"})
	public void closeBrowesr() {
		quitBrowser();

	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}
