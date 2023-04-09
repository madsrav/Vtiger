package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.generic.JavaUtility;

public class NewContactDetailsPage {
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(name="leadsource")
	private WebElement leadsource;
	@FindBy(xpath="//option[@value='Public Relations']")
	private WebElement clickdropdown;
	@FindBy(name="button")
	private WebElement Save;
	 public NewContactDetailsPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getLeadsource() {
		return leadsource;
	}
	
	public WebElement getClickdropdown() {
		return clickdropdown;
	}
	public WebElement getSave() {
		return Save;
	}
	public void enterDetailsOfContact()
	{
		JavaUtility ju= new JavaUtility();
		lastname.sendKeys(ju.generatelastname());
		leadsource.click();
		clickdropdown.click();
		Save.click(); 
	}
}
