package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String uName, String pwd) throws InterruptedException {

		//Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Syntax 
		// ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps");		

		//Maximize
		driver.manage().window().maximize();		

		//Enter the UserName
		driver.findElementById("username").sendKeys(uName);
		
		//Enter the Password
		driver.findElementById("password").sendKeys(pwd);
		
		Thread.sleep(3000);

		//Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
	}
}