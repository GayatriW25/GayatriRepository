package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	
	//Emplicit wait 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver","./drivers/chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		
		driver.get("http://desktop-5ncphir/");
		
	    
	    
	    if(driver.getTitle().equals("actiTIME - Login"))
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
	    if(driver.getTitle().equals("actiTIME - Enter Time-Track"))
		 {
			 System.out.println("Home page Title is Matched !!,Test Case Passed!!");
		 }
		 
		 else
		 {
			 System.out.println("Home page Title is not Matched !!,Test Case Failed!!");
		 }
	}

}

