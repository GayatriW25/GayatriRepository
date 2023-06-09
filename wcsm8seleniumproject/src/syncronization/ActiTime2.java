package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver","./drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("http://desktop-5ncphir/login.do");
		
		String loginPageTitle = driver.getTitle();
		if(waitMethod(driver,30,loginPageTitle))
		{
			System.out.println("login page title is matched !! test case is passed");
	    	driver.findElement(By.name("username")).sendKeys("admin");
	    	driver.findElement(By.name("pwd")).sendKeys("manager");
	    	driver.findElement(By.xpath("//a[text()='Login']")).click();
		}
		else
		{
			System.out.println("login page title is not matched !! test case is failed");
		}
		
		Thread.sleep(2000);
		
		String homePageTitle = driver.getTitle();

		if(waitMethod(driver,30, homePageTitle))
		{
			System.out.println("Home page Title is Matched !!,Test Case Passed!!");
		}

		else
		{
			System.out.println("Home page Title is not Matched !!,Test Case Failed!!");
		}
	}


				
		


public static Boolean waitMethod(WebDriver driver,int sec,String title)
{
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
	   Boolean titleOfPage = wait.until(ExpectedConditions.titleContains(title));
	   return titleOfPage;
}

}
