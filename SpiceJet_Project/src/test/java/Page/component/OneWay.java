package Page.component;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.WebPageUtil;

public class OneWay extends WebPageUtil {
	
	//pagefactory model
    //locators of oneway and payement details

	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[1]")
	WebElement oneway;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	WebElement fromoneway;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")
	WebElement onewaydestination;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/div")
	WebElement monthselect;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[7]/div/div")
	WebElement dateselect;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]")
	WebElement passenger;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")
	WebElement donebutton;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")
	WebElement currency;
	
	@FindBy(xpath ="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[1]")
	WebElement currencybutton;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]")
	WebElement searchflight;
	
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[3]/div[2]")
	WebElement continuebutton;
	
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[1]/div[2]/div")
	WebElement paymenttitle;
	
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/div/div")
	WebElement titleselect;
	
	@FindBy(xpath ="//*[@id=\"primary-contact-details\"]/div[3]/div[2]/div/div/div[2]/input")
	WebElement firstname;
	
	@FindBy(xpath ="//*[@id=\"primary-contact-details\"]/div[3]/div[3]/div/div/div[2]/input")
	WebElement lastname;
	
	@FindBy(xpath ="//*[@id=\"primary-contact-details\"]/div[3]/div[4]/div/div[2]/input")
	WebElement phonenumber;
	
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[1]/div/div/div[2]/input")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[3]/div/div/div[2]/input")
	WebElement place;
	
	@FindBy(xpath = "//*[@id=\\\"pax-item-MCFBRFQ-\\\"]/div[2]/div/div/div[1]/div/div/div/div[1]")
	WebElement acceptkey;
	
	@FindBy(xpath = "//*[@id=\"travellers-view\"]/div[2]/div/div/div[2]")
	WebElement continuesubmit;
	
	@FindBy(xpath ="//*[@id=\"main-container\"]/div/div[1]/div/div/div[4]/div/div[2]/div/div[2]/div")
	WebElement paymentcontinue;
	
	@FindBy(id = "skipfrompopup")
	WebElement skipbox;
	
	@FindBy(id ="card_number")
	WebElement entercard;
	
	public OneWay() { //page construction
		
		PageFactory.initElements(driver, this);
	}

	public void open_oneway_trip() { // method for oneway trip
		
		iconclick(oneway);
		keyinput(fromoneway,"DEL");
		keyinput(onewaydestination,"MAA");
        iconclick(monthselect);
        iconclick(dateselect);
        iconclick(passenger);
        iconclick(donebutton);
        waitImplicit(30);
        iconclick(currency);
        iconclick(currencybutton);
        System.out.println("currency button click");
        iconclick(donebutton);
        System.out.println("adult button click");
        iconclick(searchflight);
        System.out.println("searching for ONE_WAY_flights is successfull");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        iconclick(continuebutton);
        waitImplicit(10);
        iconclick(paymenttitle);
        iconclick(titleselect);
   		iconclick(firstname);
        keyinput(firstname,"Akshara");
        keyinput(lastname,"Santosh");
        keyinput(email,"akshsan@yahoo.com");
        keyinput(phonenumber,"9876543211");
        keyinput(place,"Mumbai");  
        driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[1]/div/div/div/div[1]")).click();
        waitImplicit(200);
        iconclick(continuesubmit);
        waitImplicit(10);
        System.out.println("payement is sucessfull");
        waitImplicit(10);
        Actions act = new Actions(driver);
  	    act.sendKeys(Keys.PAGE_DOWN).build().perform();
  	    waitImplicit(10);
  	    
	}
}
        
     
       
      
