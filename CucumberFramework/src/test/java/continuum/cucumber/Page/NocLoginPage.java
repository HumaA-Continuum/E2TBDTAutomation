package continuum.cucumber.Page;

import org.testng.Reporter;

import continuum.cucumber.Locator;
import continuum.cucumber.Utilities;
import continuum.cucumber.WebdriverWrapper;

public class NocLoginPage {
	WebdriverWrapper wd=new WebdriverWrapper();


	public Locator emailId= new Locator("Login email id textbox", ".//*[@id='txtUser']");
	public Locator password= new Locator("Login password text box", ".//*[@id='txtPassword']","id");
	public Locator loginBtn= new Locator("Login button", "//button[@value='Submit']//em[contains(.,'Login')]");
	
	
	public Locator welcomeMsg= new Locator("Welcome message on login page","//nav[@role='navigation']//span[contains(.,'Welcome')]"); 
	public Locator logutBtn=new Locator("Logout Btn",".//*[@id='dm0m0i8tdT']/div");
	
	
	public void loginToNOC(String emaild, String pwd){
			
    Reporter.log("Enter login credentials  to NOC portal");
	    wd.waitForElementToBeClickable(emailId,3000);
		wd.clearandSendKeys(emaild, emailId);
		wd.clearandSendKeys(pwd, password);
		wd.clickElement(loginBtn);
		 if(wd.isAlertPresent())
		    wd.acceptAlert();
			 wd.clearandSendKeys(emaild, emailId);
			 wd.clearandSendKeys(pwd, password);
   			wd.clickElement(loginBtn);	
	}
	
		
     public void navigateToNOC(){
   		wd.waitImplicit(5000);
    	 wd.verifyCurrentUrl(Utilities.getMavenProperties("browser"));
    	 Reporter.log("User is navigated to NOC portal");
	}
	
	public void verifyLoginToNOC(){
		wd.verifyElementPresent(welcomeMsg);
	}

	public void logoutOfNOC() {
		wd.mouseHover(welcomeMsg);
		wd.clickElement(logutBtn);
	}

}
