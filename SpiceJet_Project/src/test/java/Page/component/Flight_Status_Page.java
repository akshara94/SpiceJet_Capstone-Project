package Page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebPageUtil;

public class Flight_Status_Page extends WebPageUtil {
	
	//locators of flight status
	
	@FindBy(xpath ="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[1]/div[3]")
	WebElement flightstatus;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[2]")
    WebElement depatuaredate;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[4]/div[1]")
	WebElement tomorrowkey;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	WebElement fromorigin;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")
	WebElement selectdestination;
	
	@FindBy(xpath = " //*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/input")
	WebElement sgflights;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]")
	WebElement searchflights;
	
	public Flight_Status_Page() { //pagefactory constructor
		
		PageFactory.initElements(driver, this);
	}
	
	//methods of pagefactory
	public void open_flightsstatus() {
		iconclick(flightstatus);
		iconclick(depatuaredate);
		iconclick(tomorrowkey);
		keyinput(fromorigin,"DEL");
		keyinput(selectdestination,"BOM");
		keyinput(sgflights, "SG 701");
		iconclick(searchflights);
		System.out.println("login flight status");
		
		
		
	}
}
