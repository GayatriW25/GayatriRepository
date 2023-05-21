package methodOfWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethod1 {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.quit();
		}
}
