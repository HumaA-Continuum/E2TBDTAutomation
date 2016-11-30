package continuum.cucumber.Page;

import java.sql.SQLException;

import org.testng.Reporter;

import continuum.cucumber.Locator;
import continuum.cucumber.Utilities;
import continuum.cucumber.WebdriverWrapper;


public class NocLoginPage {
	WebdriverWrapper wd=new WebdriverWrapper();


	public Locator emailId= new Locator("Login email id textbox", ".//*[@id='txtUser']");
	public Locator password= new Locator("Login password text box", ".//*[@id='txtPassword']");
	public Locator loginBtn= new Locator("Login button", ".//*[@id='Submit']");
	public Locator welcomeMsg= new Locator("Welcome message on login page","//td[1]/font");
	public Locator logutBtn=new Locator("Logout Btn",".//*[@id='dm0m0i8tdT']/div");
	public Locator wpopup=new Locator("close pop up", "//li[@class='highslide-close']");
		
	public void loginToNOC(String emaild, String pwd) throws SQLException{
		Reporter.log("Enter login credentials  to NOC portal");
	    wd.waitForElementToBeClickable(emailId,1000);
		wd.clearandSendKeys(emaild, emailId);
		wd.clearandSendKeys(pwd, password);
		wd.clickElement(loginBtn);
		//wd.clickUsingJavaScript(loginBtn);
	}
	
	
	
	public void closepopup() throws InterruptedException{
		wd.waitFor(5000);
		wd.mouseHover(wpopup);
	    wd.clickElement(wpopup);
	
	}
		
     public void navigateToNOC(){
    	wd.openApplication(Utilities.getMavenProperties("applicationUrl"));
   		wd.waitFor(6000);
    	 wd.verifyCurrentUrl(Utilities.getMavenProperties("applicationUrl"));
    	 Reporter.log("User is navigated to NOC portal");
	}
	
	public void verifyLoginToNOC(){
		wd.waitFor(3000);//(welcomeMsg, 2000);
		wd.verifyElementPresent(welcomeMsg);
	}

	public void logoutOfNOC() {
		wd.mouseHover(welcomeMsg);
		wd.clickElement(logutBtn);
	}

}
