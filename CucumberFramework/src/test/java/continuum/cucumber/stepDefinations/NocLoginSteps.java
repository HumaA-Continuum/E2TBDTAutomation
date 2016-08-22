package continuum.cucumber.stepDefinations;

import continuum.cucumber.Page.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NocLoginSteps extends PageFactory
{
	
	@Given("^User naviagte to NOC portal$")
	public void user_can_navigate_to_ITS_Portal() throws Throwable {
		noclogin.navigateToNOC();
	}

	@When("^Enter Login credentials \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void enter_Login_credentials(String email,String pwd)  {
		noclogin.loginToNOC(email,pwd);
	}

	@Then("^Verify user is Login to Portal$")
	public void verify_user_is_login_to_NOC_portal() throws Throwable {
		noclogin.verifyLoginToNOC();
	}

	@Then("^Verify user is able to logout$")
	public void verify_user_is_able_to_logout() throws Throwable {
		noclogin.logoutOfNOC();
	}

	@Given("^User can navigate to Quick Access Page$")
	public void user_can_navigate_to_Quick_Access_Page()  {
	   
	}

	@When("^User should go to QuickAccess->Site -> Server$")
	public void user_should_go_to_QuickAccess_Site_Server()  {
	    
	}

	@Then("^Validate total server count$")
	public void validate_total_server_count()  {
	   
	}
	
	@Then("^Navigate to Manual triage$")
	public void navigate_To_Email_Processing(){
		createtkt.navigateToEmailProcessing();
	}


}
