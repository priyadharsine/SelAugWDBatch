package string;

public class StringLiteral {

	public static void main(String[] args) {

		// In String literal the reference 
		// will be directly pointed to String Pool
		String s1 = "TestLeaf";
		String s2 = "TestLeaf";

		//  object will be created in Heap memory 
		//  and its reference will be pointed to String pool.
		String s3 = new String("TestLeaf");
		String s4 = new String("TestLeaf");


		// compare the object 
		//System.out.println(s3.equals(s4));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		s1=s1+" chennai";
		System.out.println(s1.hashCode());
	}

}







