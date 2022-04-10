package StepDefenition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.junit.Assert;

//import com.github.dockerjava.api.command.BuildImageResultCallback;

import CUtils_File.CommonUtilities;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.TimePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTimesheet_Def {
	private static final Logger log=LogManager.getLogger(VerifyTimesheet_Def.class.getName());
	
	@Given("user land on the HMRC portal")
	public void user_land_on_the_hmrc_portal() {
		try {
			LoginPage.getInstance().getUSERNAME();
			LoginPage.getInstance().getPASSWORD();
			LoginPage.getInstance().getLOGIN();
			}catch (Exception e) {
				log.error(e);
				//CommonUtilities.getInstance().takeScreenshot();
				// TODO: handle exception
			}
		log.info("user land on the HMRC portal url");
	}
	@When("user click the Time tab")
	public void user_click_the_time_tab() {
		try {
	   HomePage.getInstance().getTime();
		}catch (Exception e) {
			log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
		}
	}
	@When("user enters {string} in Employer name tab")
	public void user_enters_in_employer_name_tab(String name) {
		try {
			TimePage.getInstance().enterEmployee(name);
			
		}catch (Exception e) {
			log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
		}
		
		
	   
	}
	@When("user click on view tab")
	public void user_click_on_view_tab() {
		try {
			TimePage.getInstance().clickView();
		}catch (Exception e) {
			log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
		}
		
	 
	}
	@Then("user able to see the {string}")
	public void user_able_to_see_the(String eresult) {
		
		try {
		String actualresult=TimePage.getInstance().TimeDisplayed(eresult);
		if(actualresult.contains(eresult))
		{
			log.info("Result passed");
		}
			
		}catch (Exception e) {
			log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
		}
	
	}



}
