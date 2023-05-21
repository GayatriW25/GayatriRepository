package qsp;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("select the browser which you want to open");
		String browserValue=sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.Chrome.driver","./drivers/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origin=*");
			
			ChromeDriver driver = new ChromeDriver();
					
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	   else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		
		else
		{
			System.out.println("select a valid browser");
		}
			
        
	}

}
