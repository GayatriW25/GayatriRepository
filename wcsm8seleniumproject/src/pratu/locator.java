package pratu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		         WebDriver driver=new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.get("https://www.google.com");
		         driver.switchTo().activeElement().sendKeys("monica geller",Keys.ENTER);
		        // driver.findElement(By.className("1NPNe")).click();
		         driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();

	}

}
