package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	
	// method or annotation is enabled or disabled
	
  @Test(enabled =true , description = "Login Method")
  public void method1() {
	  
	  Reporter.log("Login Performed!!",true);
  }
  
  @Test(enabled = true, description = "Logout Method")
  
  public void method2()
  
  {
	  Reporter.log("LogOut Performed!!", true);
  }
}
