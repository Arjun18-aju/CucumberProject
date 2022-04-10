package CUtils_File;

import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Cucu_Constant.Constant;
import PageObject.DirectoryPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.TimePage;
import Webdriver_manager.Drivermanager;

public class CommonUtilities {
	
	private static CommonUtilities commonutilitiesinstance;
	
	private CommonUtilities() {
		
	}

	public static CommonUtilities getInstance() {
		
		if(commonutilitiesinstance==null) {
			commonutilitiesinstance=new CommonUtilities();
		}
		return commonutilitiesinstance;
		
		
	}


	public  void loadProperties()
	{


		Properties prop=new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constant.Url= prop.getProperty("Url");
		Constant.Browser= prop.getProperty("Browser");
		Constant.Chrome_Driver= prop.getProperty("Chrome_Driver");
		Constant.Edge_Driver= prop.getProperty("Edge_driver");
		Constant.Username=	prop.getProperty("Username");
		Constant.Password= prop.getProperty("Password");
	}


	public  void initElements() {

		PageFactory.initElements(Drivermanager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(Drivermanager.getDriver(), HomePage.getInstance());
		PageFactory.initElements(Drivermanager.getDriver(), DirectoryPage.getInstance());
		PageFactory.initElements(Drivermanager.getDriver(), TimePage.getInstance());
	}
	
//	public  void takeScreenshot() {
//		
//		File screenshot=((TakesScreenshot) Drivermanager.getDriver()).getScreenshotAs(OutputType.FILE);
//		
//		try {
//			
//			FileUtils.copyFile(screenshot,new File(Common_Def.getScenarioName()+"./Screenshots/screenshot.png"));
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
	
	public void highLightElements(WebElement element) {
		JavascriptExecutor execute=(JavascriptExecutor) Drivermanager.driver;
		execute.executeScript("arguments[0].setAttribute('style','border: 3px solid red');", element);
	}
	}





