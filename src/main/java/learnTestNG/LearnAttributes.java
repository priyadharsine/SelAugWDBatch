package learnTestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAttributes {
	//(invocationCount=2)
	//(invocationCount=2, threadPoolSize =2)
	//(invocationCount=2, invocationTimeOut = 30000)
	//(invocationCount=2, timeOut = 30000)
	//(invocationCount=2, successPercentage = 60)
	//(expectedExceptions = NoSuchElementException.class)
	@Test(invocationCount=2)
	public void main() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter into Frame
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		driver.findElementByXPath("//*[@id='selectable']/li[2]").click();
		//Come out from frame
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		// Verification
		String txt = driver.findElementByLinkText("Sortable").getText();
		if(txt.contains("table")){
			System.out.println("matched");
			driver.findElementByLinkText("Sortable").click();
			driver.close();
		}
	}
}