package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectoryPage {
	
	
	private static DirectoryPage directorypageinstance;
	
	private DirectoryPage() {
		
	}
	
	public static DirectoryPage getInstance() {
		
		if(directorypageinstance==null)
		directorypageinstance=new DirectoryPage();
		return directorypageinstance;
		
	}
	
	@FindBy(id="searchDirectory_job_title")
	private WebElement DROPDOWN;
	
	@FindBy(id="searchBtn")
	private WebElement SEARCH;

	public WebElement getDROPDOWN() {
		return DROPDOWN;
	}

	public WebElement getSEARCH() {
		SEARCH.click();
		return SEARCH;
	}


}
