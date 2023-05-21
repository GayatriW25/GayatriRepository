package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.flipkart.com");
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    driver.findElement(By.name("q")).sendKeys("samsung s23 ultra");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    
	    // to handle parent window
	    String parentHandle = driver.getWindowHandle();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_4rR01T' and (text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)') ]")).click();
	    
	   Set<String> allHandles = driver.getWindowHandles();
	   for(String wh:allHandles)
	   {
		   if(!parentHandle.equals(wh))
		   {
			   driver.switchTo().window(wh);
		   }
		   else
		   {
			   
		   }
	   }
	   
	  String actualTitle = driver.getTitle();
	 if(actualTitle.equals("SAMSUNG Galaxy S23 Ultra 5G ( 256 GB Storage, 12 GB RAM ) Online at Best Price On Flipkart.com"))
	 {
		 System.out.println("it is child window");
	 }
	 else
	 {
		 System.out.println("it is not a child window");
	 }
	 
     WebElement scroll = driver.findElement(By.xpath("//span[text()='View Details']"));
     Point point = scroll.getLocation();
     
     int xaxis = point.getX();
     int yaxis = point.getY();
     
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeAsyncScript("window.scrollBy("+ xaxis +","+(yaxis-250)+")");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
     Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5' and (text()='512 GB')]")).click();
	}

}
