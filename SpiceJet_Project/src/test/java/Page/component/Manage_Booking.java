package Page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebPageUtil;

public class Manage_Booking extends WebPageUtil {
	
	
	//locators finding for managebooking
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[1]/div[4]/div[2]")
	WebElement managebooking;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/input")
	WebElement pnrnumber;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/input")
	WebElement emailbooking;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]")
	WebElement searchbooking;
	
	public Manage_Booking() { //constructor manage booking
		
		PageFactory.initElements(driver, this);
	}
	
	public void open_Manage() { //methods of manage booking
		
		iconclick(managebooking);
		keyinput(pnrnumber,"W3X3Z3");
		keyinput(emailbooking,"akshsan@yahoo.com");
		iconclick(searchbooking);
		
		
	}
}
