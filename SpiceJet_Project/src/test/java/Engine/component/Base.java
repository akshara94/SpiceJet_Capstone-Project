package Engine.component;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Utility.WebPageUtil;

public class Base extends WebPageUtil{

	//TestNG framework method 
	
	 public WebDriver driver;
	 
	 @Parameters("browser")
	 
	@BeforeSuite
	public  void beforesuite() { 
		
		System.out.println("FIRST-Before-Suite");
	}
		
	@BeforeMethod
	public void beforemethod() {  // before open browser
		
		System.out.println("SECOND-Before-Method");
	}
	
	
	@AfterMethod
	public void aftermethod() { // after open the browser
		
		System.out.println("After-Method");
	}

	@AfterSuite
	public void aftersuite() { //close the browser
		
		System.out.println("After-Suite");
		
		driver.close();
	}
	}
