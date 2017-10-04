package aui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://jqueryui.com/sortable/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(demo);
		
		Actions builder = new Actions(driver);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		builder.dragAndDropBy(item1, 
							  item5.getLocation().getX(), 
							  item5.getLocation().getY())	
		.release()
		.build()
		.perform();
		
	
	}

}











