package string;

import org.testng.annotations.Test;

public class printNextChar {
	
	
	
	@Test
	public void sample1(){
		char var;
		int num;
		
		String txt = "A1B2C3";
		char[] x = txt.toCharArray();
		for (int i = 0; i < x.length; i++) {
			num = (int)txt.charAt(i);
			var = (char)(num+1);
			System.out.print(var);
		}
		System.out.println();			
	}
}
