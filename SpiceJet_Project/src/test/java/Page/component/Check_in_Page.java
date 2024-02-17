package Page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WebPageUtil;

public class Check_in_Page extends WebPageUtil {
	
	//pagefactory loctors
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[1]/div[2]")
	WebElement checkin;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/input")
	WebElement pnrnumber;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/input")
	WebElement emailcheckin;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]")
	WebElement searchbooking;
	
	public Check_in_Page() {  //pagefactory constructor
		
		PageFactory.initElements(driver, this);
	}
	
	public void open_checkin() { //methods
		
		iconclick(checkin);
		keyinput(pnrnumber, "W3Z3D4");
		keyinput(emailcheckin,"akshusan@yahoo.com");
		iconclick(searchbooking);
		System.out.println("Checkin_Page is login sucessfully");
		
	}

}
