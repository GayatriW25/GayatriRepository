package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement frame = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frame);
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
		//swith the controls to default WebPage
		  driver.switchTo().defaultContent();
		
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Tanmay_123");
		driver.findElement(By.id("chat-fc-email")).sendKeys("tanmay@123gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		

	}

}
