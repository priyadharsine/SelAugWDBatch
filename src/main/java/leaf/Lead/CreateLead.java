package leaf.Lead;



import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	@Test(dataProvider="fetchData")
	public void createLead(String companyName,String Fname,String LName) throws Exception{
	
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",companyName);
		enterById("createLeadForm_firstName", Fname);
		enterById("createLeadForm_lastName", LName);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");
		
	}
	
	
	/*@DataProvider(name="fetchData")
	public Object[][] getData() {
		
		Object[][] data = new Object[2][3];
		data[0][0] = "Test Leaf";
		data[0][1] = "gopi";
		data[0][2] = "jayakumar";
		data[1][0] = "Test Leaf";
		data[1][1] = "sarath";
		data[1][2] = "M";
		return data;		
	}*/
	
	
	
	
	
	
	
	
	
	
}









