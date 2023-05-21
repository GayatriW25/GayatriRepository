package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/Chaitanya/Documents/username.html");
			WebElement username = driver.findElement(By.name("n1"));
			username.sendKeys("admin");
			Thread.sleep(2000);
			
			WebElement frame = driver.findElement(By.name("frame"));
			driver.switchTo().frame(frame);
			Thread.sleep(2000);
			
			WebElement password = driver.findElement(By.name("pwd"));
			password.sendKeys("admin@123");
			Thread.sleep(2000);
			
			password.clear();
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			username.clear();
	}

}
