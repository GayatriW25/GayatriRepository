package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webelement.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Chaitanya/Documents/single.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
	    Select sel = new Select(dropDown);
	    for(int i=0;i<=9;i++)
	    {
	    	if(i%2==0)
	    	{
	    		Thread.sleep(2000);
	    		sel.selectByIndex(3);
	    	}
	    	else
	    	{
	    		System.out.println("It is an odd place");
	    	}
	    }
	    
	    for (int i=0;i<=10;i++)
	    {
	    	if(i%2==0)
	    	{
	    	Thread.sleep(2000);
	    	sel.deselectByIndex(3);
	    	}
	    
	    else
	    {
	    	System.out.println("its an odd place");
	    }
	}

	}
}
