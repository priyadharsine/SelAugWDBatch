package learnGrid;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnWindowsAndSnapshot2 {

	@Test
	public void learnWindow() throws IOException{

	/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		*/
		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.1.12:4444/wd/hub"), dc);
		
		
		

		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("GUEST CHECK-IN").click();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("**********************");

		Set<String> allWin  = driver.getWindowHandles();
		System.out.println(allWin.size());

		//Last Window
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);	
		}		

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img2.jpg");
		FileUtils.copyFile(src, desc);


		
	}

}
