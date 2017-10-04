package collectionsPrac;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {

		String company = "Hexaware";
		
		// Step 1: Convert to characters
		char[] allChars = company.toCharArray();
		
		// Step 2: Take a character at a time
		Set<Character> chars = new LinkedHashSet<Character>();
		
		for (char eachchar : allChars) {
			// Step 3: // and add to Set
			chars.add(eachchar);
			
		}
		
		for (Character character : chars) {
			System.out.println(character);
		}
		
	}
}


