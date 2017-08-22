package day4;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnDiffWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Switch to Last Window
		Set<String> allWindows = driver.getWindowHandles();		
		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);
		}

		//Switch to First Window
		Set<String> allWindows1 = driver.getWindowHandles();		
		for (String eachWindow : allWindows1) {			
			driver.switchTo().window(eachWindow);
			break;
		}

		//Switch to in between Window
		int i=1;
		Set<String> allWindows2 = driver.getWindowHandles();		
		for (String eachWindow : allWindows2) {			
			driver.switchTo().window(eachWindow);
			if(i==2){				
				break;
			}
		}
	}
}
