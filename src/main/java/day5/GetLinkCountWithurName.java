package day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkCountWithurName {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com/");	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("lst-ib").sendKeys("TestLeaf", Keys.ENTER);
		
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		System.out.println(allLinks.size());
		int Count = 0;
		for (WebElement eachLink : allLinks) {
			if(eachLink.getText().contains("TestLeaf")){
				Count++;
				System.out.println(eachLink.getText());
			}
		}
		
		System.out.println(Count);
		
		
	}

}
