package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/Chaitanya/Documents/Multiple.html");
			WebElement dropDown = driver.findElement(By.name("menu"));
			Select sel = new Select(dropDown);
			List<WebElement> allOptions = sel.getOptions();
			
			for(int i=0;i<allOptions.size();i++)
			{
				String options = allOptions.get(i).getText();
				System.out.println(options);
			}
			
	}

}
