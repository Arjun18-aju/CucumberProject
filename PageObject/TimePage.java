package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CUtils_File.CommonUtilities;

public class TimePage {

	private static TimePage timepageinstance;

	private TimePage() {

	}

	public static TimePage getInstance() {
		if(timepageinstance==null) {
			timepageinstance=new TimePage();
		}
		return timepageinstance;

	}


	@FindBy(id="employee")
	private WebElement Employee ;


	@FindBy(id="btnView")
	private WebElement view ;
	
	@FindBy(css ="div.message.warning")
	private WebElement TimeSheet ;
	

	public void enterEmployee(String name) {
		//CommonUtilities.getInstance().highLightElements(Employee);
		Employee.clear();
		Employee.sendKeys(name);
	}

	public void clickView() {

		view.click();
	}
	
	public String TimeDisplayed(String result) {

		return result;
	}




}
