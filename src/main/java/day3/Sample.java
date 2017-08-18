package day3;

public class Sample {
	
	String txt = "testleaf";	
	
	public static void main(String[] args) {		
		Sample sl = new Sample();
		sl.test1();
		sl.test2();		
	//	test1();
	//	test2();
	}
	
	
	
	public void test1(){		
		System.out.println("Test1");		
	}
	
	private void test2(){
		System.out.println(txt);
		System.out.println("Test2");		
	}

}
