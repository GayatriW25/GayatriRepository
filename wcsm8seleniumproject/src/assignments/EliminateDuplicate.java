package assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Chaitanya/Documents/Multiple.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		
		//to get all the option from dropdown
		List<WebElement> allOptions = sel.getOptions();
		
		//to eliminate the duplicate & maintain the insertion order
		
		TreeSet<String> ts = new TreeSet<String>();
		
		//to read the list by eliminating the duplicates
		for(int i=0;i<allOptions.size();i++)
		{
			String options = allOptions.get(i).getText();
			//add text of option to treeset
			ts.add(options);
		}
		
		//to read options from set
		for(String options:ts)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}
