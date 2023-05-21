package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation{
	
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
				
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  WebElement Button = driver.findElement(By.xpath("//button[text()=' Login ']"));
	  Point loc = Button.getLocation();
	  int Xaxis = loc.getX();
	  int Yaxis = loc.getY();
	  
	  System.out.println("X axis "+Xaxis+","+" Y axis "+Yaxis);
	}

}
