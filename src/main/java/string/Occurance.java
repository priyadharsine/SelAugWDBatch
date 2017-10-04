package string;

import org.testng.annotations.Test;

public class Occurance {

	String check = "Cognizant India";
	int count = 0;

	//Way1	-> toCharArray() , foreach
	@Test(enabled =false)
	public void sample(){
		char[] ch = check.toCharArray();
		for (char c : ch) {
		//	System.out.println(c);
			if(c=='a'){
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	//Way2 -> for iteration 0 -> length, charAt
		
	
	
	//Way3 -> length - length (after replace)
	@Test
	public void sample3(){
		int len = check.length();
		int len1 = check.replaceAll("a", "").length();
		System.out.println(len-len1);
	}
	
	
	//way4 -> split and length -1
	
	
	

}










