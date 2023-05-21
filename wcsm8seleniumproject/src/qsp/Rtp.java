package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the browser which you want");
		String browserValue=sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.drivers","./driver/chromedriver.exe");
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
		    driver=new ChromeDriver(co);
			
			Thread.sleep(2000);
			driver.close();
		}
		
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
		    driver = new FirefoxDriver();
			Thread.sleep(2000);
			driver.close();
		}
		else
		{
			System.out.println("select a valid browser");
		}

		
	}

}
