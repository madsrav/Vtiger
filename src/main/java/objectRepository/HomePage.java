package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.generic.BaseClass;
import com.crm.Vtiger.generic.WebDriverUtilities;

public class HomePage {

	@FindBy(xpath="//a[.='Contacts']")
	private  WebElement ClickContactsMod;
	@FindBy(xpath="//a[.='Organizations']")
	private   WebElement ClickOrganisationMod;
	@FindAll({@FindBy(xpath="(//td[@class='small'])[2]"),@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")}) 
	private WebElement  Adminimg;
	@FindAll({@FindBy(xpath="//a[text()='Sign Out']"),@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")})
	private WebElement logout;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getClickContactsMod() {
		return ClickContactsMod;
	}
	public WebElement getClickOrganisationMod() {
		return ClickOrganisationMod;
	}
	public WebElement getLogout() {
		return logout;
	} 
	public WebElement getAdminimg() {
		return Adminimg;
	}
	public void Logout()
	{
		logout.click();
	}

}
