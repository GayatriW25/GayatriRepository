package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.netflix.com/in/login");
			 driver.findElement(By.name("userLoginId")).sendKeys("tanmay");
		     driver.findElement(By.name("password")).sendKeys("tanmay123");
		     WebElement Button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		     Button.submit();
			
	}
}
