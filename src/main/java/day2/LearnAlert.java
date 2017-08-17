package day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnAlert {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.irctc.co.in");	
		driver.manage().window().maximize();		
		driver.findElementById("loginbutton").click();
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();
	}
}