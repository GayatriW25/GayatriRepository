package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
	
	//flipkart.com
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV']']" )).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Brand']" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']" )).click();
		driver.close();
	}

}
