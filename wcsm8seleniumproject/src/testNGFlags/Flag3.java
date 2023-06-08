package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
	// use to execute another or method multiple time!!
	
  @Test(invocationCount = 10)
  
  public void method1() {
	  
	  Reporter.log("Login Test Case", true);
  }
}
