package com.crm.Vtiger.Modules;

import org.testng.annotations.Test;

import com.crm.Vtiger.generic.BaseClass;

import objectRepository.HomePage;
import objectRepository.NewOrgDetailsPage;
import objectRepository.OrganisationPage;

public class TC002_CreateOrganistionTest extends BaseClass {
	@Test
	public void createOrganisation()
	{
		HomePage hp = new HomePage(driver);
		hp.getClickOrganisationMod().click();
		
		OrganisationPage og= new OrganisationPage(driver);
		og.getClickOrgMod().click();
		
		NewOrgDetailsPage nop = new NewOrgDetailsPage(driver);
		nop.AllOrgDetails();
    }

}
