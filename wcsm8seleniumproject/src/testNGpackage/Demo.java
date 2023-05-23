package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	public void demoMethod()
	{
		//System.out.println("hii testNG");
		Reporter.log("Hiii TestNG",true);
	}
	
	@Test
	public void g()
	{
		//System.out.println("hii java");
		  Reporter.log("Hiii java",true);
	}

}
