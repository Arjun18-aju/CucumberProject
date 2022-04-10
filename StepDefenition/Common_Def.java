package StepDefenition;

//import java.util.Optional;

//import java.sql.DriverManager;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import CUtils_File.CommonUtilities;
import Cucu_Constant.Constant;
import Webdriver_manager.Drivermanager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.plugin.event.Node.Scenario;

public class Common_Def {

//	private static Optional<String> scenarioName =null;
//
//
//
//	public static  Optional<String>  getScenarioName() {
//		return scenarioName;
//	}

	private static final Logger log=LogManager.getLogger(Common_Def.class.getName());



	@Before
	public void beforeLaunch( ) {

		try {
			//scenarioName=scenario.getName();
			CommonUtilities.getInstance().loadProperties();
			if(Drivermanager.getDriver()==null) {
				log.info("Driver is  null");
				Drivermanager.launchBrowser();
				log.info("browser launched");
				CommonUtilities.getInstance().initElements();

			}

			Drivermanager.driver.get(Constant.Url);
			log.info("Url will be loaded");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


	}

	@After
public void tearDown() {

	Drivermanager.driver.quit();
}





}


