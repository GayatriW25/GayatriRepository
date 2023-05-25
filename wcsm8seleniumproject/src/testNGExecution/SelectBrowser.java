package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SelectBrowser {
	static WebDriver driver;
   @Parameters({"Browser","url","Vusername","Vpassword"})
  @Test
  public void method1(String Browser, String url,String usn, String Pass) throws InterruptedException {
	   
	   if(Browser.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get(url);
		   driver.findElement(By.name("username")).sendKeys(usn);
		   driver.findElement(By.name("pwd")).sendKeys(Pass);
		   driver.findElement(By.id("loginButton")).click();
		   //Thread.sleep(2000);
	   }
	   
	   else if(Browser.equalsIgnoreCase("Firefox"))
	   {
		  
		   driver=new FirefoxDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get(url); 
		   driver.findElement(By.name("username")).sendKeys(usn);
		   driver.findElement(By.name("pwd")).sendKeys(Pass);
		   driver.findElement(By.id("loginButton")).click();
    	  
	   }
	   
	   else
	   {
		   System.out.println("invalid Browser");
	   }
  }
}
