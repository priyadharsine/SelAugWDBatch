package collectionsPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ImplementList {
	
	@Test
	public void learnList(){
		
		List<String> data = new ArrayList<String>();
		data.add("TCS");
		data.add("Aspire");
		data.add("Zoho");
		data.add("ZOHO");
		System.out.println(data.size());
		Collections.sort(data);
		for (String eachData : data) {
			System.out.println(eachData);
		}
		/*data.clear();		
		System.out.println(data.contains("Nesa"));
		*/
	
	}

}










