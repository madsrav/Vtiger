package com.crm.Vtiger.Modules;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.Vtiger.generic.BaseClass;

import objectRepository.ContactPage;
import objectRepository.HomePage;
import objectRepository.NewContactDetailsPage;

@Listeners(com.crm.Vtiger.generic.Listner_Implementation.class)
public class TC001_CreateContactTest extends BaseClass{
	@Test
	public void createContact()
	{
		HomePage hp = new HomePage(driver);
		hp.getClickContactsMod().click();
		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactButton().click();
		NewContactDetailsPage cdp= new NewContactDetailsPage(driver);
		cdp.enterDetailsOfContact();
	}
}
