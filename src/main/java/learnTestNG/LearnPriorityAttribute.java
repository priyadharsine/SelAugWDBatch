package learnTestNG;

import org.testng.annotations.Test;
@Test
public class LearnPriorityAttribute {

	//(priority=1)
	public void  test1() {
		System.out.println("Create Lead");
	}
	
	//@Test//(priority=2)
	public void  test3() {
		System.out.println("Edite Lead");
	}
	
	//@Test
	public void  test2() {		
		System.out.println("Detele Lead");		
	}
	
	//@Test//(priority=-1)
	public void  test4() {
		System.out.println("Merge Lead");
	}
}
