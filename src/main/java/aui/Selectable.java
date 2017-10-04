package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("http://jqueryui.com/droppable/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(demo);
		
		Actions builder = new Actions(driver);
		
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
	
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		//builder.dragAndDropBy(draggable, 100, 100).build().perform();

	}

}











