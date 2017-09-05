package learnTestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnMethods {


	@Test
	public void learnMethods() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.irctc.co.in");	
		driver.manage().window().maximize();		
		driver.findElementById("loginbutton").click();
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("");

	}

	@Test
	public void learnFrames() throws InterruptedException, IOException {
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
