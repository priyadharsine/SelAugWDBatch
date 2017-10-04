package collectionsPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ImplementSet {

	@Test
	public void learnList(){

		Set<String> data = new TreeSet<String>();
		data.add("TCS");
		data.add("Aspire");
		data.add("Zoho");
		data.add("CTS");
		System.out.println(data.size());
		for (String eachData : data) {
			System.out.println(eachData);
		}

	}

}










