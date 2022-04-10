package Webdriver_manager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Cucu_Constant.Constant;
import StepDefenition.Common_Def;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager  WebDriver {
	private static final Logger log=LogManager.getLogger(Common_Def.class.getName());
	
	public static WebDriver driver;
	
	
	
	
	public static void launchBrowser() {
		// TODO Auto-generated method stub
		try {
			switch (Constant.Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				log.info("Launching" + Constant.Browser);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;

			case "edge":
			WebDriverManager.edgedriver().setup();
				log.info("Launching" + Constant.Browser);
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				break;

			default:
				WebDriverManager.chromedriver().setup();
				log.info("Launching" + Constant.Browser);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;
		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	public static WebDriver getDriver() {
		return driver;
	}
}
