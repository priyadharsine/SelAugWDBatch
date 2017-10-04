package collectionsPrac;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintDupsChar {

	public static void main(String[] args) {

		String company = "Hexaware";

		// Step 1: Convert to characters
		char[] allChars = company.toCharArray();

		// Step 2: Take a character at a time
		List<Character> lstChr = new ArrayList<Character>();

		for (char eachchar : allChars) {
			// Step 3: // and add to List
			lstChr.add(eachchar);

		}

		// Step 3: Take a character at a time
		Set<Character> setChr = new LinkedHashSet<Character>();

		for (char eachchar : allChars) {
			// Step 3: // and add to Set
			setChr.add(eachchar);

		}
		
		// Loop through the Set
		for (Character character : setChr) {
			lstChr.remove(character);
		}
		
		for (Character character : lstChr) {
			System.out.println(character);
		}

		
	}
}


