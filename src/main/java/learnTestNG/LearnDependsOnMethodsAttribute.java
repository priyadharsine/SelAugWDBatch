package learnTestNG;

import org.testng.annotations.Test;

public class LearnDependsOnMethodsAttribute {

	//(enabled = false)
	@Test(enabled = false)
	public void  createLead() {
		System.out.println("createLead");
		throw new RuntimeException();
	}

	//(dependsOnMethods={"createLead"})
	//(dependsOnMethods={"createLead"}, alwaysRun = true)
	@Test(dependsOnMethods={"createLead"}, alwaysRun = true)
	public void  editLead() {
		System.out.println("editLead");
	}
	
	@Test
	public void  deleteLead() {
		System.out.println("deleteLead");
	}
	
	@Test
	public void  mergeLead() {
		System.out.println("mergeLead");
	}
}
