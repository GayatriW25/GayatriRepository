package methodOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.drivers","./driver/chromedriver.exe");
		
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--remote-allow-origin=*");
	    
	    ChromeDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("http://omayo.blogspot.com/");
	    Thread.sleep(2000);
	    driver.quit();
	    
		
	}

}
