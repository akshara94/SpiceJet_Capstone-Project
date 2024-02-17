package Page.component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebPageUtil;

public class LoginPage extends WebPageUtil {
	
	//locations for loginpages
	
	@FindBy(xpath = " //*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[1]/div/div")
	WebElement loginpage;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[3]/div/div/div[2]/div[2]/div/div[2]")
	WebElement loginemail;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[4]/div[2]/input")
	WebElement enteremail;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[5]/div[1]/div[2]/input")
	WebElement enterpass;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[3]/div[2]/div[2]/div/div/div/div[5]/div[3]")
	WebElement submitlogin;
	
	 public LoginPage() { //pagefactory constructor
			
		    PageFactory.initElements(driver, this);
	}
    
	 //method of loginpages location
    public void openlogin() {
    	
    	iconclick(loginpage);
    	waitImplicit(10);
    	iconclick(loginemail);
    	keyinput(enteremail, "akshsan@yahoo.com");
    	keyinput(enterpass, "12345@678Ak");
    	waitImplicit(5);
    	iconclick(submitlogin);
    	
    	
    }

}


