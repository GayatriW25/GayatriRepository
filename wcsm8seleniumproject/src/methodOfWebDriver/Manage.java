package methodOfWebDriver;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Dimension targetSize = new Dimension(650,350);
	 driver.manage().window().setSize(targetSize);
	  Point targetPosition = new Point(650,350);
}
}
