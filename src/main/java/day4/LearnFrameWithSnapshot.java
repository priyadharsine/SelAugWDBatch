package day4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameWithSnapshot {

	public static void main(String[] args) throws InterruptedException, IOException {				

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter into Frame
		WebElement demo = driver.findElementByClassName("demo-frame1");
		driver.switchTo().frame(demo);
		
		driver.findElementByXPath("//*[@id='selectable']/li[2]").click();
		
		//Come out from frame
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		// Verification
		String txt = driver.findElementByLinkText("Sortable").getText();
		if(txt.contains("table")){
			System.out.println("matched");
		}
		
		driver.findElementByLinkText("Sortable").click();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File desc = new File("./snaps/img1.jpg");
		
		FileUtils.copyFile(src, desc);

	}







}