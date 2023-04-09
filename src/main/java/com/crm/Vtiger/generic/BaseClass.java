package com.crm.Vtiger.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public WebDriverUtilities Utils;
	public static WebDriver sdriver;
	@BeforeSuite
	public void connectToDataBase() {
		System.out.println("system connected to db");
	}
	@BeforeClass
	public void launchingBrowser() {
		driver = new ChromeDriver();
		Utils= new WebDriverUtilities(driver);
		Utils.waitForPageLoad();
		Utils.maximizewindow();
		sdriver = driver;
	}
	@BeforeMethod
	public void login() throws Throwable {
		ReadDataFromPropFile prop = new ReadDataFromPropFile();
		String url = prop.readDataFromPropFile("url");
		String un = prop.readDataFromPropFile("un");
		String pwd = prop.readDataFromPropFile("pwd");
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.loginPage(un,pwd);
	}
	@AfterMethod
	public void logout() throws Throwable 
	{   
		HomePage hp= new HomePage(driver);
		Thread.sleep(5000);
		Utils.moveToTheElement(hp.getAdminimg());
		Thread.sleep(10000);
		hp.getLogout().click();
	}
	@AfterClass
	public void closingBrowser() 
	{
		driver.close();
	}
	@AfterSuite
	public void closingDbConnection() {
		System.out.println("DB connection is closed successfully");
	}
}