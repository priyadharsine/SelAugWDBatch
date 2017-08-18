package day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {				

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");	
		driver.manage().window().maximize();	
		
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
		}
		
		driver.findElementByLinkText("Sortable").click();

	}







}