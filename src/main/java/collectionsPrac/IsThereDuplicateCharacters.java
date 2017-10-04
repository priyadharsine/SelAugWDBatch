package collectionsPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class IsThereDuplicateCharacters {

	public static void main(String[] args) {
		
		// Lets write Psuedocode first
		// Goal ?? If there is repeating character -- then print false ; else true
		
		// 1, Convert the string to the character array(toCharArray())
		// 2, Loop through each character (use foreach)
		// 3, If the character is in map key then print duplicate and break (containsKey(""))
		// 4, If not add to the map (put(k,v))
		
		String companyName = "Hexaware India has 243292349 employees across world";		
		char[] allChars= companyName.toCharArray();		
		Map<Character, Integer> mapHex = new HashMap<Character, Integer>();
		
		for (char eachChr : allChars) {	
			if(!mapHex.containsKey(eachChr))
				mapHex.put(eachChr, 1);	
			else {
				System.out.println("Has dups");
				break;
			}
		}
		
		System.out.println(mapHex);
		
	}

	
	
	
	
	
	
	
}
