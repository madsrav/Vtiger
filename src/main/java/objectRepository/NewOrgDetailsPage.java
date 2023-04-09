package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.generic.JavaUtility;

public class NewOrgDetailsPage {

	@FindBy(name="accountname")
	private WebElement orgname;
	@FindBy(name="rating")
	private WebElement rating;
	@FindBy(xpath="//option[@value='Active']")
	private WebElement ratingOfOrg;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebutton;
	
	public NewOrgDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getRatingOfOrg() {
		return ratingOfOrg;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	public void AllOrgDetails()
	{
		JavaUtility ju = new JavaUtility();
		orgname.sendKeys(ju.Orgname());
		rating.click();
		ratingOfOrg.click();
		savebutton.click();
	}
	
}
