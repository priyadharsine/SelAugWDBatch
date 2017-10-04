package aui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://jqueryui.com/selectable/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(demo);
		
		Actions builder = new Actions(driver);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		builder.clickAndHold(item1)
		.pause(Duration.ofSeconds(3))
		.clickAndHold(item4)
		.release()
		.build()
		.perform();
		
	
	}

}











