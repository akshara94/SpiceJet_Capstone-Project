package Page.component;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utility.WebPageUtil;

   public class SignupPage extends WebPageUtil {
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[2]/div[1]/div/div[3]/div[2]/div/a/div")
    WebElement signuppage;
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select")
	WebElement titlebox;
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	WebElement FirstName;
	
	@FindBy(id ="last_name")
	WebElement LastName;
   
 	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/select")
    WebElement country;
    
	@FindBy(id="dobDate")
	WebElement dateofbirth;
	
	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]")
	WebElement selectdate;
    
   
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/div[1]/input")
    WebElement mobilenumber;
    
    @FindBy(xpath="//*[@id=\"email_id\"]")
     WebElement emailkey;
    
    @FindBy(xpath="//*[@id=\"new-password\"]")
     WebElement passkey;
 
    @FindBy(xpath = "//*[@id=\"c-password\"]")
    WebElement confirmpass;
    
    @FindBy(id = "defaultCheck1")
    WebElement acceptkey;
    
    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[7]/div[1]/a/button")
    WebElement submitkey;

   
  public SignupPage() { //pagefactory constructor
	
	    PageFactory.initElements(driver, this);
	 }
  
  public void OpenPage1() {
			  
			  iconclick(signuppage);
			  
			  iconclick(titlebox);
			  
			  keyinput(titlebox,"Mrs");
			  
			  keyinput(FirstName,"Akshara");
			  
			  keyinput(LastName, "Santosh");
			  
			  iconclick(country);
			  keyinput(country,"India");
			  	  
			  iconclick(dateofbirth);
			  iconclick(selectdate);
			  
			  iconclick(mobilenumber);
			  keyinput(mobilenumber,"9876543211");
			  
			  keyinput(emailkey,"akshsan@yahoo.com");
			  
			  Actions act = new Actions(driver);
			  act.sendKeys(Keys.PAGE_DOWN).build().perform();
			    
		      keyinput(passkey, "12345@678Ak");
			 
			  keyinput(confirmpass, "12345@678Ak");
			 
			  //driver.findElement(By.id("defaultCheck1")).click();
			  
			  iconclick(acceptkey);
			  
		     iconclick(submitkey);
		      System.out.println("submit signup");
		      
		       }

       }
  
	  
	  

	  
  
     
  
   
    	
    	 
     
     
    	 
     
      
   

     
   

