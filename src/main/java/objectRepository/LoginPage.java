package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBys({@FindBy(name="user_name"),@FindBy(xpath="//input[@type='text']")})
	private WebElement uname;
	@FindAll({@FindBy(name="user_password"),@FindBy(xpath="//input[@type='password']")})
	private WebElement pwd;
	@FindBy(id="submitButton")
	private	WebElement login;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	public void loginPage(String username, String password)
	{
		uname.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
	}
}
