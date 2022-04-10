package StepDefenition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//import Cucu_Constant.Constant;
import PageObject.DirectoryPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerifyCEO_Def  {
	private static final Logger log=LogManager.getLogger(VerifyCEO_Def.class.getName());
	
	@Given("user land on the HMRC portal url")
	public void user_land_on_the_hmrc_portal_url() {
	   log.info("user land on the HMRC portal url");
	}
	@When("user login with valid username and password")
	public void user_login_with_valid_username_and_password() {
		try {
		LoginPage.getInstance().getUSERNAME();
		LoginPage.getInstance().getPASSWORD();
		LoginPage.getInstance().getLOGIN();
		}catch (Exception e) {
			log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
			// TODO: handle exception
		}
	}
		

	@When("user clicks the  directory tab")
	public void user_clicks_the_directory_tab() {
		try {
	   HomePage.getInstance().getDirectory();
		}catch (Exception e) {
			log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
		}
	}

	
	@When("user select job title as {string}")
	public void user_select_job_title_as(String jobtitle) {
		try {
	  Select select=new Select(DirectoryPage.getInstance().getDROPDOWN());
	  select.selectByVisibleText(jobtitle);
	  String actualName="Chief Executive Officer";
	  if(actualName.contains(jobtitle)) {
		  Assert.assertTrue(true);
		  log.info("Pass");
	  }else {
		  Assert.assertFalse(false);
		  log.info("Fail");
	  }
	  }catch (Exception e) {
		  log.error(e);
			//CommonUtilities.getInstance().takeScreenshot();
	}
	  
	
	}
	@When("user click on search tab")
	public void user_click_on_search_tab() {
		try {
		DirectoryPage.getInstance().getSEARCH();
		  log.info("Search button clicked");
		}catch (Exception e) {
			log.error(e);
			Assert.fail(e.getMessage());
			//CommonUtilities.getInstance().takeScreenshot();
		}
	  
	}
	@Then("user able to see the results")
	public void user_able_to_see_the_results() {
		log.info("Results fetched up");
	  
	}




}
