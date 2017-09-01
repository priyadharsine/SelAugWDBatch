package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class LoginToLeafTaps extends GenericWrappers{

	@Test
	public void login() throws Exception{
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}

}
