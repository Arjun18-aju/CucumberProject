package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CUtils_File.CommonUtilities;
import Cucu_Constant.Constant;

public class LoginPage {
	
	private static LoginPage logininstance;
	
	private LoginPage(){
		
	}
	
	public static LoginPage getInstance() {
		
		if(logininstance==null) {
		logininstance=new LoginPage ();
		}
		return logininstance;
		
		
	}
	
	@FindBy(id="txtUsername")
	private WebElement USERNAME;
	
	@FindBy(id="txtPassword")
	private WebElement PASSWORD;
	
	@FindBy(id="btnLogin")
	private WebElement LOGIN;

	public WebElement getUSERNAME() {
		CommonUtilities.getInstance().highLightElements(USERNAME);
		USERNAME.sendKeys(Constant.Username);
		return USERNAME;
	}

	public WebElement getPASSWORD() {
		CommonUtilities.getInstance().highLightElements(PASSWORD);
		PASSWORD.sendKeys(Constant.Password);
		return PASSWORD;
	}

	public WebElement getLOGIN() {
		LOGIN.click();
		return LOGIN;
	}
	
	
	
}
