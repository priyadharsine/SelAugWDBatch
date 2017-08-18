package day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnSelectClass_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.leaftaps.com/opentaps");	
		driver.manage().window().maximize();		
		driver.findElementById("eusername").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();

		 
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd =new Select(src);
		//dd.selectByIndex(0);
		//dd.selectByVisibleText("Existing Customer");
		dd.selectByValue("LEAD_OTHER");
		
		Thread.sleep(2000);
		
		List<WebElement> allOption= dd.getOptions();
		
		//Count of Options Tag
		System.out.println(allOption.size());		
		
		//Select the Last Value in Dropdown
		dd.selectByIndex(allOption.size()-1);
		
		//Print each text(Option) in the Dropdown 
		for (WebElement eachOption : allOption) {
			System.out.println(eachOption.getText());
		}
	}
}