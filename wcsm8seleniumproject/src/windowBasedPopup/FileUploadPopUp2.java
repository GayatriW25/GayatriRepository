package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-5ncphir/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//click on settings
		
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		//click on logo &colour
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		//click on radio button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		
		//click on choose files
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		//create object for actions class
		Actions act = new Actions(driver);
		
		act.doubleClick(target).perform();
		Thread.sleep(2000);
		
		//create object of files
		File file = new File("./autoit/windowpopup.exe");
		String abs = file.getAbsolutePath();
		Runtime.getRuntime().exec(abs);
		Thread.sleep(2000);
		Runtime.getRuntime().exec(abs);
			
	}

}
