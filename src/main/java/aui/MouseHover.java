package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.flipkart.com");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement ele = driver.findElementByXPath("//span[.='Electronics']");
		
		Actions builder = new Actions(driver);
		
		builder.contextClick(ele).build().perform();
		
		/*builder.moveToElement(ele).build().perform();
		
		Thread.sleep(5000);
		
		//driver.findElementByXPath("//span[.='Apple']").click();
		
		*/
	}

}











