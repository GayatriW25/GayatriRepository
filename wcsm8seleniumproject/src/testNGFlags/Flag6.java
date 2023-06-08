package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	 @Test(description = "Login TestCase")
	  public void loginMethod() {
		  
		  Reporter.log("login performed!!",true);
	  }
	  
	  @Test(description = "CreateUser TestCase",dependsOnMethods = "loginMethod")
	  public void createUser() {
		  
		  Reporter.log("user created!!",true);
	  }
	  
	  @Test(description = "Logout TestCase", dependsOnMethods = "createUser", alwaysRun =true)
	  public void logoutMethod() {
		  
		  Reporter.log("logout Performed!!",true);
	  }
}
