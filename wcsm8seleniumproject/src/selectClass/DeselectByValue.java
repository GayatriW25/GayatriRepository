package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/Chaitanya/Documents/Multiple.html");
			WebElement dropDown = driver.findElement(By.name("menu"));
			Select sel = new Select(dropDown);
			Thread.sleep(2000);
			sel.selectByValue("v3");
			sel.selectByValue("v5");
			Thread.sleep(2000);
			sel.deselectByValue("v3");
			sel.deselectByValue("v5");
			
	}

}
