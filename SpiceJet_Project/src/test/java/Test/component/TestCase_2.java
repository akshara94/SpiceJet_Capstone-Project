package Test.component;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Engine.component.Base;
import Page.component.Check_in_Page;
import Page.component.Flight_Status_Page;
import Page.component.Manage_Booking;
import Page.component.OneWay;
import Page.component.RoundTrip;
import Utility.WebPageUtil;

   public class TestCase_2 extends Base {
	   
	  
@Parameters({"browser"})
		
	@Test(priority =2)
	
	public void TestCases03_User_Oneway() {
		
	       WebPageUtil.init( );
		   OneWay one = new OneWay();
	       one.open_oneway_trip();
	       WebPageUtil.TakeScreenshot();
	}
	@Test(priority = 3)
	    public void Testcases04_user_roundtrip() throws Throwable {
		
		  	  WebPageUtil.init();
		      RoundTrip roundtrip = new RoundTrip() ;
		      roundtrip.openroundtrippage();
		      waitImplicit(50);
		      WebPageUtil.TakeScreenshot();
	 }
	 
	 @Test(priority = 4)
		public void Testcases05_User_checkin() {
			
		 	WebPageUtil.init();
			Check_in_Page checkin = new Check_in_Page();
			checkin.open_checkin();
			waitImplicit(20);
			WebPageUtil.TakeScreenshot();
		}
	@Test(priority = 5)
		
		public void Testcases06_User_FlightStatus() {
			
			WebPageUtil.init();
			Flight_Status_Page status = new Flight_Status_Page();
			status.open_flightsstatus();
			waitImplicit(50);
			WebPageUtil.TakeScreenshot();
		}
	   
	@Test(priority=6)
		
		public void Testcases07_User_Manage() {
			
			WebPageUtil.init();
			Manage_Booking book = new Manage_Booking();
			book.open_Manage();
			waitImplicit(50);
			WebPageUtil.TakeScreenshot();
		}
   }


