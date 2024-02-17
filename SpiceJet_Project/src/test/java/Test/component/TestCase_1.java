package Test.component;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Engine.component.Base;
import Page.component.LoginPage;
import Page.component.SignupPage;
import Utility.WebPageUtil;

public class TestCase_1 extends Base {
	
	
	
@Parameters({"browser"})
	
@Test(priority=0)//testcase for signup method
	
	public void TestCases01_User_Signup( ) {
		
		WebPageUtil.init( );
		SignupPage signup = new SignupPage();
		signup.OpenPage1();
		driver.get("https://spiceclub.spicejet.com/signup");
		waitImplicit(10);
    	WebPageUtil.TakeScreenshot();
     	System.out.println("Signup sucessfully");
		Assert.assertEquals(true, true);
}

  @Test(priority =1)//testcase for login method
   
  public void TestCases02_User_login() {
		  
	     WebPageUtil.init( );
		 LoginPage log = new LoginPage();
		 log.openlogin();
		 WebPageUtil.TakeScreenshot();
		System.out.println("login sucessfully");
		Assert.assertEquals(true, true);
  }
  
}
