package collectionsPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> emp = new TreeMap<Integer,String>(); 
		
		emp.put(2015, "Babu");
		emp.put(2002, "Gopi");
		emp.put(2003, "Nesa");
		System.out.println(emp.size());
		
		if(emp.containsKey(2002)){
			emp.put(2002, "Gopinath");
		}
		
		for (Entry<Integer, String> empl : emp.entrySet()) {
			System.out.println(empl.getKey());	
			System.out.println(empl.getValue());
		}
	}

}










