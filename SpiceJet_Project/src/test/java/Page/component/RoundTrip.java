package Page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebPageUtil;

public class RoundTrip extends WebPageUtil { //round trip locators
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]")
    WebElement roundtripkey;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	WebElement fromroundtrip;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")
	WebElement departurekey;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/div/div[1]/div")
	WebElement returnmonthselect;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/div/div[3]/div[1]/div[1]/div/div")
	WebElement returndate;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")
	WebElement returnpassenger;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")
	WebElement returndonebutton;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")
	WebElement returncurrency;
	
	@FindBy(xpath ="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[1]")
	WebElement returncurrencybutton;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]")
	WebElement returnadult;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
	WebElement returnsearchflights;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[3]/div/div[1]/div/div[1]/svg/g/rect")
	WebElement acceptkey;
	
	
 public RoundTrip() { // pagefactory construction
		  PageFactory.initElements(driver, this);
	 }
	 
	 public void openroundtrippage() throws Throwable { //methods of roundtrip
		 
		 iconclick(roundtripkey);    //click the circle the roundtrip
		 keyinput(fromroundtrip, "MAA"); //sendkey for from destination
		 keyinput(departurekey, "DEL");  //sendkey for the return destination
		 iconclick(returnmonthselect);  //month select
		 iconclick(returndate);     // click the date of birth
		 iconclick(returndate);      
		 System.out.println("date selected");
		 iconclick(returnpassenger);     //select the passenger
		 iconclick(returndonebutton);
		  System.out.println("adult button click");
		 iconclick(returncurrency);       //select the currency
		 iconclick(returncurrencybutton);
		 System.out.println("currency button click");
		 iconclick(returnsearchflights);      //search for flights
		System.out.println("RoundTrip_flights is sucessfull");
		Thread.sleep(5000);
		
	 }
}
    
	   
		
		 

