package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-5ncphir/login.do");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String userName = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", 1, 0);
			String passWord = flib.readExcelData("./data/ActiTimeTestData.xlsx","invalidcreds", 1, 1);
			
			driver.findElement(By.name("username")).sendKeys(userName);
			driver.findElement(By.name("pwd")).sendKeys(passWord);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("username")).clear();
			
		}
	}

}
