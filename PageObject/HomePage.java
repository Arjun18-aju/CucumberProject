package PageObject;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import StepDefenition.Common_Def;
//import Webdriver_manager.Drivermanager;

//import Cucu_Constant.Constant;

public class HomePage  {

	
	private static HomePage homepageinstance;
	
	private HomePage() {
		
	}
	
	public static HomePage getInstance() {
		if(homepageinstance==null) {
		homepageinstance=new HomePage();
		}
		return homepageinstance;
		
	}
	
	@FindBy(linkText="Directory")
	private WebElement directory ;
	
	@FindBy(linkText="Time")
	private WebElement time ;

	public WebElement getDirectory() {
		directory.click();
		return directory;
	}
	
	public void getTime() {
		
		time.click();
	}
	
}
