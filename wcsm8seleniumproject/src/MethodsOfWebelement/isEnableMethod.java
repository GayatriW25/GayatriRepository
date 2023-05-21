package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnableMethod {

	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.instagram.com/");
			WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
			boolean verify = loginButton.isEnabled();
			System.out.println(verify);
			
			driver.findElement(By.name("username")).sendKeys("tanmay");
			driver.findElement(By.name("password")).sendKeys("tanmay1234");
			boolean verify1 = loginButton.isEnabled();
			System.out.println(verify1);
			
			
			
			
			
	}
}
