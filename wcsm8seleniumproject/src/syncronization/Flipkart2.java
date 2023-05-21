package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[text()='Core i9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=Brand]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		//driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		//driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	}

}
