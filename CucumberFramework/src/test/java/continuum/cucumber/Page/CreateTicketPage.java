package continuum.cucumber.Page;

import org.testng.Reporter;

import continuum.cucumber.Locator;
import continuum.cucumber.Utilities;
import continuum.cucumber.WebdriverWrapper;

public class CreateTicketPage {

	 WebdriverWrapper wd=new WebdriverWrapper();

	public Locator management= new Locator("Management dropdown", ".//*[@id='dm0m0i8tdT']/div");
	public Locator emailprocessing= new Locator("Email Processing link", "..//*[@id='dm0m5i11tdT']");
	public Locator manualTriag= new Locator("Manual Triage Link", ".//*[@id='dm0m12i0tdT']");
	
		
     public void navigateToEmailProcessing(){
    	wd.waitImplicit(5000);
    	wd.clickElement(management);
    	wd.clickElement(emailprocessing);
    	wd.clickElement(manualTriag);
		
	}
	

		
	
}
