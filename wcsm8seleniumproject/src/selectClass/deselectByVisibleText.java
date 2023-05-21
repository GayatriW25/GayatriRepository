package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByVisibleText {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/Chaitanya/Documents/Multiple.html");
			WebElement dropDown = driver.findElement(By.name("menu"));
			Select sel = new Select(dropDown);
			Thread.sleep(2000);
			
			sel.selectByVisibleText("chivda");
			sel.selectByVisibleText("dosa");
			Thread.sleep(2000);
			sel.deselectByVisibleText("chivda");
			sel.deselectByVisibleText("dosa");
			
	}

}
