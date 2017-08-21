package day4;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {
		//Load the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("http://legacy.crystalcruises.com/");	
		driver.manage().window().maximize();		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("***********************************");
		
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("***********************************");
		driver.findElementByLinkText("View Offer»").click();
		
		
		allWindows = driver.getWindowHandles();				
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);			
		}		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("***********************************");
		
		
		driver.switchTo().window(parentWindow);
		System.out.println(parentWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println("***********************************");
		driver.close();
		
	}

}
